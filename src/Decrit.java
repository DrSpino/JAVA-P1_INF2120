import java.util.ArrayList;
import java.util.Arrays;
/*
 * Classe qui permet de retourner si
 * une sequence ARN est bien decrite par l'arn de base.
 * */
public class Decrit {
	/*
	 * Serie d'arrayList qui permet de faciliter
	 * la comparaison entre les deux ARN.
	 * 
	 * Ex: l'ArrayList A represente toutes les Nucleotides que
	 * le Nucleotide A peut decrire.
	 * */
	public static ArrayList <Nucleotide> A = new ArrayList<> (Arrays.asList(Nucleotide.A,Nucleotide.R,Nucleotide.W,Nucleotide.M,Nucleotide.D,
										Nucleotide.H,Nucleotide.V,Nucleotide.N));
	public static ArrayList <Nucleotide> C = new ArrayList<> (Arrays.asList(Nucleotide.C,Nucleotide.Y,Nucleotide.S,Nucleotide.M,Nucleotide.B,
										Nucleotide.H,Nucleotide.V,Nucleotide.N));
	public static ArrayList <Nucleotide> G = new ArrayList<> (Arrays.asList(Nucleotide.G,Nucleotide.R,Nucleotide.S,Nucleotide.K,Nucleotide.B,
										Nucleotide.D,Nucleotide.V,Nucleotide.N));
	public static ArrayList <Nucleotide> U = new ArrayList<> (Arrays.asList(Nucleotide.U,Nucleotide.Y,Nucleotide.W,Nucleotide.K,Nucleotide.B,
										Nucleotide.D,Nucleotide.H,Nucleotide.N));
	public static ArrayList <Nucleotide> R = new ArrayList<> (Arrays.asList(Nucleotide.R,Nucleotide.D,Nucleotide.V,Nucleotide.N));
	public static ArrayList <Nucleotide> Y = new ArrayList<> (Arrays.asList(Nucleotide.Y,Nucleotide.B,Nucleotide.H,Nucleotide.N));
	public static ArrayList <Nucleotide> S = new ArrayList<> (Arrays.asList(Nucleotide.S,Nucleotide.B,Nucleotide.V,Nucleotide.N));
	public static ArrayList <Nucleotide> W = new ArrayList<> (Arrays.asList(Nucleotide.W,Nucleotide.D,Nucleotide.H,Nucleotide.N));
	public static ArrayList <Nucleotide> K = new ArrayList<> (Arrays.asList(Nucleotide.K,Nucleotide.B,Nucleotide.D,Nucleotide.N));
	public static ArrayList <Nucleotide> M = new ArrayList<> (Arrays.asList(Nucleotide.M,Nucleotide.H,Nucleotide.V,Nucleotide.N));
	public static ArrayList <Nucleotide> B = new ArrayList<> (Arrays.asList(Nucleotide.B,Nucleotide.N));
	public static ArrayList <Nucleotide> D = new ArrayList<> (Arrays.asList(Nucleotide.D,Nucleotide.N));
	public static ArrayList <Nucleotide> H = new ArrayList<> (Arrays.asList(Nucleotide.H,Nucleotide.N));
	public static ArrayList <Nucleotide> V = new ArrayList<> (Arrays.asList(Nucleotide.V,Nucleotide.N));
	
	/*
	 * Methode appelee par decrit de la classe ARN.
	 * La recherche etant longue j'ai prefere la mettre
	 * dans cette classe.
	 * 
	 * @param arn
	 * 		la sequence ARN de base.
	 * @param decrite
	 * 		la sequence ARN que l'on souhaite determiner
	 * 		si elle est decrite ou non.
	 * @return decrite
	 * 		le boolean qui nous dit la description
	 * 		correspond ou non.
	 * */
	public static boolean decrite (AcideRibonucleique arn,AcideRibonucleique decrite){
		boolean decrit = true;
		
		for(int i = 0; i < decrite.size(); ++i){
			
			switch (decrite.get(i)){
			case A:
				if (!(A.contains(arn.get(i)))){
					decrit = false;
				}
				break;
			case C:
				if (!(C.contains(arn.get(i)))){
					decrit = false;
				}
				break;
			case G:
				if (!(G.contains(arn.get(i)))){
					decrit = false;
				}
				break;
			case U:
				if (!(U.contains(arn.get(i)))){
					decrit = false;
				}
				break;
			case R:
				if (!(R.contains(arn.get(i)))){
					decrit = false;
				}
				break;
			case Y:
				if (!(Y.contains(arn.get(i)))){
					decrit = false;
				}
				break;
			case S:
				if (!(S.contains(arn.get(i)))){
					decrit = false;
				}
				break;
			case W:
				if (!(W.contains(arn.get(i)))){
					decrit = false;
				}
				break;
			case K:
				if (!(K.contains(arn.get(i)))){
					decrit = false;
				}
				break;
			case M:
				if (!(M.contains(arn.get(i)))){
					decrit = false;
				}
				break;
			case B:
				if (!(B.contains(arn.get(i)))){
					decrit = false;
				}
				break;
			case D:
				if (!(D.contains(arn.get(i)))){
					decrit = false;
				}
				break;
			case H:
				if (!(H.contains(arn.get(i)))){
					decrit = false;
				}
				break;
			case V:
				if (!(V.contains(arn.get(i)))){
					decrit = false;
				}
				break;
			case N:
				if (!(Nucleotide.N ==arn.get(i))){
					decrit = false;
				}
				break;
			}	
		}
		return decrit;
	}
}
