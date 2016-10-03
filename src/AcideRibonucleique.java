import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class AcideRibonucleique extends ArrayList<Nucleotide> {
	
	/*
	 * Constructeur qui permet d'heriter de la classe ArrayList.
	 * */
	public AcideRibonucleique( Collection< Nucleotide > c ) {
		super( c );
	}
	//Constructeur vide.
	public AcideRibonucleique() {
	}
	
	/*
	 * Permet de retrouver un codon a une position donnee
	 * dans une sequence de Nucleotide.
	 * 
	 * @param position
	 * 			un entier qui correspond a la position d'
	 * 			un Nucleotide dans la sequence.
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
	/*Permet de retrouver le codon a la position exacte
	 * dans une sequence de Nucleotide.
	 * 
	 * @param position
	 * 			un entier qui correspond a la position
	 * 			du codon dans la sequence
	 * @return [] codon
	 * 			un tableau de 3 Nucleotide
	 * */
	public Nucleotide[] Codon(int position){
		Nucleotide[] codon = new Nucleotide [3];
		
		codon = codon(position*3);
		return codon;
	}
	
	/*
	 * Verifie que la sequence repond a certains
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
		}else{
			for (int position = 0;position<this.size(); ++position){
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
		codon = Codon(position);
		/*
		 * Voir la classe TableauAcide pour voir
		 * le deroulement de l'algorithme.
		 * */
		acide = TableauAcide.acide(codon);
		return acide;
	}
	
	/*
	 * Permet de creer une sequence complement de la
	 * sequence de base, celle-ci inverse
	 * les Nucleotides selon le tableau du TP.
	 * 
	 * @return ARN
	 * 		Un arrayList de Nucleotide qui represente
	 * 		le complement de la sequence initiale.
	 * */
	public AcideRibonucleique complement(){
		AcideRibonucleique comp = new AcideRibonucleique ();
		
		for(int i = 0; i < this.size() ; ++i){
			switch (this.get(i)){
			case A :
				comp.add(Nucleotide.U);
				break;	
			case U :
				comp.add(Nucleotide.A);
				break;
			case C :
				comp.add(Nucleotide.G);
				break;
			case G :
				comp.add(Nucleotide.C);
				break;
			case D :
				comp.add(Nucleotide.H);
				break;
			case H :
				comp.add(Nucleotide.D);
				break;
			case K :
				comp.add(Nucleotide.M);
				break;
			case M :
				comp.add(Nucleotide.K);
				break;
			case R :
				comp.add(Nucleotide.Y);
				break;
			case Y :
				comp.add(Nucleotide.R);
				break;
			case B :
				comp.add(Nucleotide.V);
				break;
			case V :
				comp.add(Nucleotide.B);
				break;
			default:
				comp.add(this.get(i));
				break;
			}
		}
		return comp;
	}
	/*
	 * Permet de comparer deux arn et de determiner si
	 * une sequence arn est bien decrite par la sequence
	 * de base.
	 * 
	 * @param decrite
	 * 		un array arn qui represente la sequence que 
	 * 		l'on souhaite decrire.
	 * 
	 * @return decrit
	 * 		un boolean qui renvoi vrai si la sequence est bien
	 * 		decrite par l'arn de base.
	 * */
	public boolean decrit( AcideRibonucleique decrite ){
		boolean decrit = true;
		/*
		 * Voir la classe TableauDecrit pour voir
		 * le deroulement de l'algorithme.
		 * */
		if (this.size()== decrite.size()){
			decrit = TableauDecrit.decrite(this,decrite);
		}else{
			decrit = false;
		}
		
		return decrit;
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
		ArrayList <Nucleotide> tab = new ArrayList <>(Arrays.asList(Nucleotide.C,Nucleotide.K,Nucleotide.N));
		ArrayList <Nucleotide> decrit = new ArrayList <>(Arrays.asList(Nucleotide.C,Nucleotide.G,Nucleotide.N));
		
		AcideRibonucleique arn = new AcideRibonucleique (tab);
		AcideRibonucleique decrite = new AcideRibonucleique (decrit);
		
		System.out.print(arn.decrit(decrite));
		
	}
}
