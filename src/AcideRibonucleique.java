import java.util.ArrayList;

public class AcideRibonucleique extends ArrayList<Nucleotide> {
	
	/*
	 * Methode qui permet d'heriter de la classe ArrayList
	 * */
	public AcideRibonucleique(){
		super();
	}
	
	/*
	 * Permet de retrouver un codon à une position donnee
	 * dans une séquence de Nucleotide.
	 * 
	 * @param position
	 * 			un entier qui correspond à la position
	 * 			dans une sequence de Nucleotide.
	 * @return [] codon
	 * 			un tableau de 3 Nucleotide.
	 * */
	public Nucleotide[] codon(int position){
		Nucleotide[] codon = new Nucleotide [3];
		
		if ((position%3)==0){
			for (int i = 0; i<3 ; ++i){
				codon[i] = this.get(position+i);
			}
		}else if((position%3)==1){
			for (int i = 0; i<3 ; ++i){
				codon[i] = this.get((position-1)+i);
			}
		}else if((position%3)==2){
			for (int i = 0; i<3 ; ++i){
				codon[i] = this.get((position-2)+i);
			}
		}
		return codon;
	}
	
	/*
	 * Verifie que la sequence répond a certains
	 * criteres de validite precis.
	 * 
	 * @return valide
	 *  		un boolean qui nous renseigne sur la validitee de la sequence.
	 * */
	public boolean estValide(){
		Nucleotide[] codon = new Nucleotide [3];
		boolean valide = true;
		
		if ((this.size()%3) != 0){
			valide = false;
		}
		
		for (int position = 0;position<=this.size()-1; ++position){
			codon = codon(position);
			
			if(position == 0 || position == 1 || position == 2){
				
				if(!((codon[0]==Nucleotide.A) ||(codon[0]==Nucleotide.U)||
						(codon[0]==Nucleotide.G))){
					valide= false;
				}else if(!(codon[1]==Nucleotide.U)){
					valide= false;
				}else if(!(codon[2]==Nucleotide.G)){
					valide = false;
				}
				
			}else if(position == this.size()-1||position == this.size()-2||position == this.size()-3){
				
				if(!(codon[0]==Nucleotide.U)){
					valide= false;
				}else if(!((codon[1]==Nucleotide.A))||(codon[1]==Nucleotide.G)){
					valide= false;
				}else if(!(codon[2]==Nucleotide.A)){
					valide = false;
				}
				
			}else{
				
				if((codon[0]==Nucleotide.U)&&(codon[1]==Nucleotide.A)&&
						(codon[2]==Nucleotide.A)){
					valide= false;
				}
			}
		}
		return valide;
	}
	
	/*
	 * Trouve le codon qui correspond a la position
	 * et l'acide aminee qui correspond au codon.
	 * 
	 * @param position
	 * 			un entier qui correspond a une position
	 * 			dans un sequence de nucleotide.
	 * @return AcideAmine
	 * 			une Acide aminee qui correspond au codon
	 * 			prelevee.
	 * @throws IndexOutOfBoundsException
	 * 			une exception si la position n'existe pas dans
	 * 			la sequence.
	 * */
	public AcideAmine getAcideAmine( int position ) throws IndexOutOfBoundsException{
		Nucleotide[] codon = new Nucleotide [3];
		AcideAmine acide = null;
		codon = codon(position);
		/*
		 * Voir la classe TableauAcide pour voir
		 * le deroulement de l'algorithme.
		 * */
		acide = TableauAcide.acide(codon);
		return acide;
	}
	
	public AcideRibonucleique complement(){
		//Inverse chaque lettre de la séquence
		//A <> U et C <> G
		/*Pour nucléotide inverser l'ensemble ex :
		 * R = {A,G} <> {U,C} = {C,U} = Y 
		 * Regarder complement cours plus simple*/
		return null;
	}
	
	public boolean decrit( AcideRibonucleique decrite ){
		//XI.decrit(x2)
		// Chaine taille difference return false
		/*Ex : VHCGNRCA décrit MACGUGCA ?
		 * M décrit V mais V ne décrit pas M
		 * Voir page 3 TP*/
		return false;
	}
	
	public AcideRibonucleique generalise( AcideRibonucleique arn ){
		//XI.generalise(x2)
		//Chaine taille differente leve exception indexOutOfBoundException
		/*Union ex: ARHUN union ACSHUV
		 * A et C = M || R et S = V || H et H = H
		 * U et U = U || N et V = N
		 * Pour test x3.decrit(x1) et x3.decrit(x2)
		 * tableau page 4*/
		return this;
	}
	
	public static void main (String[] args){
		AcideRibonucleique ok = new AcideRibonucleique();
		ok.add(Nucleotide.A);
		ok.add(Nucleotide.U);
		ok.add(Nucleotide.G);
		ok.add(Nucleotide.C);
		ok.add(Nucleotide.U);
		ok.add(Nucleotide.A);
		ok.add(Nucleotide.G);
		ok.add(Nucleotide.U);
		ok.add(Nucleotide.G);
		ok.add(Nucleotide.U);
		ok.add(Nucleotide.A);
		ok.add(Nucleotide.A);
		
		System.out.println(ok.estValide());
		System.out.println(ok.getAcideAmine(7));
	}
}
