import java.util.ArrayList;

/*
 * Classe qui permet de retourner l'acide aminee
 * qui correspond au codon.
 * */
public class Acide {
	
	/*
	 * Serie de tableau qui facilite la recherche
	 * de l'acide aminee.
	 * */
	private static AcideAmine[][] A = {{AcideAmine.ASN,AcideAmine.ILE,AcideAmine.LYS,AcideAmine.MET,
										AcideAmine.THR,AcideAmine.SER},
								{AcideAmine.ASN,AcideAmine.ASP,AcideAmine.GLU,AcideAmine.GLN,
									AcideAmine.HIS,AcideAmine.LYS,AcideAmine.PYL,AcideAmine.SEC,
									AcideAmine.TYR},
								{AcideAmine.ALA,AcideAmine.ARG,AcideAmine.GLU,AcideAmine.GLN,
									AcideAmine.GLY,AcideAmine.ILE,AcideAmine.LEU,AcideAmine.LYS,
									AcideAmine.PRO,AcideAmine.SEC,AcideAmine.SER,AcideAmine.THR,
									AcideAmine.VAL}};
	
	private static AcideAmine[][] G = {{AcideAmine.ALA,AcideAmine.ASP,AcideAmine.GLU,AcideAmine.GLY,
										AcideAmine.VAL},
								{AcideAmine.ARG,AcideAmine.ASP,AcideAmine.CYS,AcideAmine.GLY,AcideAmine.SER,
									AcideAmine.TRP},
								{AcideAmine.ALA,AcideAmine.ARG,AcideAmine.GLU,AcideAmine.GLN,AcideAmine.GLY,
									AcideAmine.LEU,AcideAmine.LYS,AcideAmine.MET,AcideAmine.PRO,AcideAmine.PYL,
									AcideAmine.SER,AcideAmine.THR,AcideAmine.TRP,AcideAmine.VAL}};

	private static AcideAmine[][] U = {{AcideAmine.CYS,AcideAmine.LEU,AcideAmine.PHE,AcideAmine.PYL,
										AcideAmine.SEC,AcideAmine.SER,AcideAmine.TRP,AcideAmine.TYR},
								{AcideAmine.ILE,AcideAmine.LEU,AcideAmine.MET,AcideAmine.PHE,AcideAmine.VAL},
								{AcideAmine.ALA,AcideAmine.ARG,AcideAmine.ASN,AcideAmine.ASP,AcideAmine.LEU,
									AcideAmine.ILE,AcideAmine.VAL,AcideAmine.SER,AcideAmine.PRO,AcideAmine.THR,
									AcideAmine.CYS,AcideAmine.GLY,AcideAmine.HIS,AcideAmine.TYR,AcideAmine.PHE}};
	
	private static AcideAmine[][] C = {{AcideAmine.LEU,AcideAmine.PRO,AcideAmine.HIS,AcideAmine.GLN,
										AcideAmine.ARG},
								{AcideAmine.SER,AcideAmine.PRO,AcideAmine.THR,AcideAmine.ALA},
								{AcideAmine.PHE,AcideAmine.SER,AcideAmine.TYR,AcideAmine.CYS,AcideAmine.LEU,
									AcideAmine.PRO,AcideAmine.HIS,AcideAmine.ARG,AcideAmine.ILE,AcideAmine.THR,
									AcideAmine.ASN,AcideAmine.VAL,AcideAmine.ALA,AcideAmine.ASP,AcideAmine.GLY}};
	
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
			for(int i = 0 ; i < A[0].length ; ++i){
				acides.add(A[0][i]);
			}
		}else if(codon[0]==Nucleotide.G){
			for(int i = 0 ; i < G[0].length ; ++i){
				acides.add(G[0][i]);
			}
		}else if(codon[0]==Nucleotide.U){
			for(int i = 0 ; i < U[0].length ; ++i){
				acides.add(U[0][i]);
			}
		}else if(codon[0]==Nucleotide.C){
			for(int i = 0 ; i < C[0].length ; ++i){
				acides.add(C[0][i]);
			}
		}
		
		
		if (codon[1]==Nucleotide.A){
			for(int i = 0 ; i < A[1].length ; ++i){
				if(acides.contains(A[1][i])){
					acides_t.add(A[1][i]);
				}
			}
		}else if(codon[1]==Nucleotide.G){
			for(int i = 0 ; i < G[1].length ; ++i){
				if(acides.contains(G[1][i])){
					acides_t.add(G[1][i]);
				}
			}
		}else if(codon[1]==Nucleotide.U){
			for(int i = 0 ; i < U[1].length ; ++i){
				if(acides.contains(U[1][i])){
					acides_t.add(U[1][i]);
				}
			}
		}else if(codon[1]==Nucleotide.C){
			for(int i = 0 ; i < C[1].length ; ++i){
				if(acides.contains(C[1][i])){
					acides_t.add(C[1][i]);
				}
			}
		}
		
		if (codon[2]==Nucleotide.A){
			for(int i = 0 ; i < A[2].length ; ++i){
				if(acides_t.contains(A[2][i])){
					acide = A[2][i];
				}
			}
		}else if(codon[2]==Nucleotide.G){
			for(int i = 0 ; i < G[2].length ; ++i){
				if(acides_t.contains(G[2][i])){
					acide = G[2][i];
				}
			}
		}else if(codon[2]==Nucleotide.U){
			for(int i = 0 ; i < U[2].length ; ++i){
				if(acides_t.contains(U[2][i])){
					acide = U[2][i];
				}
			}
		}else if(codon[2]==Nucleotide.C){
			for(int i = 0 ; i < C[2].length ; ++i){
				if(acides_t.contains(C[2][i])){
					acide = C[2][i];
				}
			}
		}
		return acide;
	}

	
}
