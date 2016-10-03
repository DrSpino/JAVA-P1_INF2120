import java.util.ArrayList;

/*
 * Classe qui permet de retourner l'acide aminee
 * qui correspond au codon.
 * */
public class Acide {
	
	/*
	 * Serie de tableau qui facilite la recherche
	 * de l'acide aminee.
	 * 
	 * La premiere lettre majuscule correspond au Nucleotide
	 * Et le chiffre sa position dans le codon.
	 * Ex : G_1 veut dire que le nucleotide G ce trouve 
	 * a la deuxieme position du codon.
	 * 
	 * */
	public static AcideAmine[] A_0 = {AcideAmine.ASN,AcideAmine.ILE,AcideAmine.LYS,AcideAmine.MET,
						AcideAmine.THR,AcideAmine.SER};
	public static AcideAmine[] A_1 = {AcideAmine.ASN,AcideAmine.ASP,AcideAmine.GLU,AcideAmine.GLN,
						AcideAmine.HIS,AcideAmine.LYS,AcideAmine.PYL,AcideAmine.SEC,
						AcideAmine.TYR};
	public static AcideAmine[] A_2 = {AcideAmine.ALA,AcideAmine.ARG,AcideAmine.GLU,AcideAmine.GLN,
						AcideAmine.GLY,AcideAmine.ILE,AcideAmine.LEU,AcideAmine.LYS,
						AcideAmine.PRO,AcideAmine.SEC,AcideAmine.SER,AcideAmine.THR,
						AcideAmine.VAL};

	public static AcideAmine[] G_0 = {AcideAmine.ALA,AcideAmine.ASP,AcideAmine.GLU,AcideAmine.GLY,
						AcideAmine.VAL};
	public static AcideAmine[] G_1 = {AcideAmine.ARG,AcideAmine.ASP,AcideAmine.CYS,AcideAmine.GLY,AcideAmine.SER,
						AcideAmine.TRP};
	public static AcideAmine[] G_2 = {AcideAmine.ALA,AcideAmine.ARG,AcideAmine.GLU,AcideAmine.GLN,AcideAmine.GLY,
						AcideAmine.LEU,AcideAmine.LYS,AcideAmine.MET,AcideAmine.PRO,AcideAmine.PYL,
						AcideAmine.SER,AcideAmine.THR,AcideAmine.TRP,AcideAmine.VAL};

	public static AcideAmine[] U_0 = {AcideAmine.CYS,AcideAmine.LEU,AcideAmine.PHE,AcideAmine.PYL,
						AcideAmine.SEC,AcideAmine.SER,AcideAmine.TRP,AcideAmine.TYR};
	public static AcideAmine[] U_1 = {AcideAmine.ILE,AcideAmine.LEU,AcideAmine.MET,AcideAmine.PHE,AcideAmine.VAL};
	public static AcideAmine[] U_2 = {AcideAmine.ALA,AcideAmine.ARG,AcideAmine.ASN,AcideAmine.ASP,AcideAmine.LEU,
						AcideAmine.ILE,AcideAmine.VAL,AcideAmine.SER,AcideAmine.PRO,AcideAmine.THR,
						AcideAmine.CYS,AcideAmine.GLY,AcideAmine.HIS,AcideAmine.TYR,AcideAmine.PHE};

	public static AcideAmine[] C_0 = {AcideAmine.LEU,AcideAmine.PRO,AcideAmine.HIS,AcideAmine.GLN,
						AcideAmine.ARG};
	public static AcideAmine[] C_1 = {AcideAmine.SER,AcideAmine.PRO,AcideAmine.THR,AcideAmine.ALA};
	public static AcideAmine[] C_2 = {AcideAmine.PHE,AcideAmine.SER,AcideAmine.TYR,AcideAmine.CYS,AcideAmine.LEU,
						AcideAmine.PRO,AcideAmine.HIS,AcideAmine.ARG,AcideAmine.ILE,AcideAmine.THR,
						AcideAmine.ASN,AcideAmine.VAL,AcideAmine.ALA,AcideAmine.ASP,AcideAmine.GLY};
	
	
	/*
	 * Methode appelee par getAcideAmine de la classe ARN.
	 * La recherche etant longue j'ai prefere la mettre
	 * dans cette classe.
	 * 
	 * @param []codon
	 * 		tableau de taille 3 de Nucleotide.
	 * @return acide
	 * 		l'acide aminee qui correspond au codon.
	 * 		
	 * */
	public static AcideAmine acide(Nucleotide[]codon){
		AcideAmine acide = null;
		ArrayList <AcideAmine> acides = new ArrayList<>();
		ArrayList <AcideAmine> acides_t = new ArrayList<>();
		
		if (codon[0]==Nucleotide.A){
			for(int i = 0 ; i < A_0.length ; ++i){
				acides.add(A_0[i]);
			}
		}else if(codon[0]==Nucleotide.G){
			for(int i = 0 ; i < G_0.length ; ++i){
				acides.add(G_0[i]);
			}
		}else if(codon[0]==Nucleotide.U){
			for(int i = 0 ; i < U_0.length ; ++i){
				acides.add(U_0[i]);
			}
		}else if(codon[0]==Nucleotide.C){
			for(int i = 0 ; i < C_0.length ; ++i){
				acides.add(C_0[i]);
			}
		}
		
		
		if (codon[1]==Nucleotide.A){
			for(int i = 0 ; i < A_1.length ; ++i){
				if(acides.contains(A_1[i])){
					acides_t.add(A_1[i]);
				}
			}
		}else if(codon[1]==Nucleotide.G){
			for(int i = 0 ; i < G_1.length ; ++i){
				if(acides.contains(G_1[i])){
					acides_t.add(G_1[i]);
				}
			}
		}else if(codon[1]==Nucleotide.U){
			for(int i = 0 ; i < U_1.length ; ++i){
				if(acides.contains(U_1[i])){
					acides_t.add(U_1[i]);
				}
			}
		}else if(codon[1]==Nucleotide.C){
			for(int i = 0 ; i < C_1.length ; ++i){
				if(acides.contains(C_1[i])){
					acides_t.add(C_1[i]);
				}
			}
		}
		
		if (codon[2]==Nucleotide.A){
			for(int i = 0 ; i < A_2.length ; ++i){
				if(acides_t.contains(A_2[i])){
					acide = A_2[i];
				}
			}
		}else if(codon[2]==Nucleotide.G){
			for(int i = 0 ; i < G_2.length ; ++i){
				if(acides_t.contains(G_2[i])){
					acide = G_2[i];
				}
			}
		}else if(codon[2]==Nucleotide.U){
			for(int i = 0 ; i < U_2.length ; ++i){
				if(acides_t.contains(U_2[i])){
					acide = U_2[i];
				}
			}
		}else if(codon[2]==Nucleotide.C){
			for(int i = 0 ; i < C_2.length ; ++i){
				if(acides_t.contains(C_2[i])){
					acide = C_2[i];
				}
			}
		}
		return acide;
	}

	
}
