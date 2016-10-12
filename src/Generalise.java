import java.util.ArrayList;

public class Generalise {
	
	private static Nucleotide[]A	= {Nucleotide.A,Nucleotide.M,Nucleotide.R,Nucleotide.W,Nucleotide.R,Nucleotide.H,Nucleotide.V,
										Nucleotide.W,Nucleotide.D,Nucleotide.M,Nucleotide.N,Nucleotide.D,Nucleotide.H,
										Nucleotide.V};
	private static Nucleotide[]C	= {Nucleotide.M,Nucleotide.C,Nucleotide.S,Nucleotide.Y,Nucleotide.V,Nucleotide.Y,Nucleotide.S,
										Nucleotide.H,Nucleotide.B,Nucleotide.M,Nucleotide.B,Nucleotide.N,Nucleotide.H,
										Nucleotide.V};
	private static Nucleotide[]G	= {Nucleotide.R,Nucleotide.S,Nucleotide.G,Nucleotide.K,Nucleotide.R,Nucleotide.B,Nucleotide.S,
										Nucleotide.D,Nucleotide.K,Nucleotide.V,Nucleotide.B,Nucleotide.D,Nucleotide.N,
										Nucleotide.V};
	private static Nucleotide[]U	= {Nucleotide.W,Nucleotide.Y,Nucleotide.K,Nucleotide.U,Nucleotide.D,Nucleotide.Y,Nucleotide.B,
										Nucleotide.W,Nucleotide.K,Nucleotide.H,Nucleotide.B,Nucleotide.D,Nucleotide.H,
										Nucleotide.N};
	private static Nucleotide[]R	= {Nucleotide.R,Nucleotide.V,Nucleotide.R,Nucleotide.D,Nucleotide.R,Nucleotide.N,Nucleotide.V,
										Nucleotide.D,Nucleotide.D,Nucleotide.V,Nucleotide.N,Nucleotide.D,Nucleotide.N,
										Nucleotide.V};
	private static Nucleotide[]Y	= {Nucleotide.H,Nucleotide.Y,Nucleotide.B,Nucleotide.Y,Nucleotide.N,Nucleotide.Y,Nucleotide.B,
										Nucleotide.H,Nucleotide.D,Nucleotide.H,Nucleotide.B,Nucleotide.N,Nucleotide.H,
										Nucleotide.N};
	private static Nucleotide[]S	= {Nucleotide.V,Nucleotide.S,Nucleotide.S,Nucleotide.B,Nucleotide.V,Nucleotide.B,Nucleotide.S,
										Nucleotide.N,Nucleotide.B,Nucleotide.V,Nucleotide.B,Nucleotide.N,Nucleotide.N,
										Nucleotide.V};
	private static Nucleotide[]W	= {Nucleotide.W,Nucleotide.H,Nucleotide.D,Nucleotide.W,Nucleotide.D,Nucleotide.H,Nucleotide.N,
										Nucleotide.W,Nucleotide.D,Nucleotide.H,Nucleotide.N,Nucleotide.D,Nucleotide.H,
										Nucleotide.N};
	private static Nucleotide[]K	= {Nucleotide.D,Nucleotide.B,Nucleotide.K,Nucleotide.K,Nucleotide.D,Nucleotide.D,Nucleotide.B,
										Nucleotide.D,Nucleotide.K,Nucleotide.N,Nucleotide.B,Nucleotide.D,Nucleotide.N,
										Nucleotide.N};
	private static Nucleotide[]M	= {Nucleotide.M,Nucleotide.M,Nucleotide.V,Nucleotide.H,Nucleotide.V,Nucleotide.H,Nucleotide.V,
										Nucleotide.H,Nucleotide.N,Nucleotide.M,Nucleotide.N,Nucleotide.N,Nucleotide.H,
										Nucleotide.V};
	private static Nucleotide[]B	= {Nucleotide.N,Nucleotide.B,Nucleotide.B,Nucleotide.B,Nucleotide.N,Nucleotide.B,Nucleotide.B,
										Nucleotide.N,Nucleotide.B,Nucleotide.N,Nucleotide.B,Nucleotide.N,Nucleotide.N,
										Nucleotide.N};
	private static Nucleotide[]D	= {Nucleotide.D,Nucleotide.N,Nucleotide.D,Nucleotide.D,Nucleotide.D,Nucleotide.N,Nucleotide.N,
										Nucleotide.D,Nucleotide.D,Nucleotide.N,Nucleotide.N,Nucleotide.D,Nucleotide.N,
										Nucleotide.N};
	private static Nucleotide[]H	= {Nucleotide.H,Nucleotide.H,Nucleotide.N,Nucleotide.H,Nucleotide.N,Nucleotide.H,Nucleotide.N,
										Nucleotide.H,Nucleotide.N,Nucleotide.H,Nucleotide.N,Nucleotide.N,Nucleotide.H,
										Nucleotide.N};
	private static Nucleotide[]V	= {Nucleotide.V,Nucleotide.V,Nucleotide.V,Nucleotide.N,Nucleotide.V,Nucleotide.N,Nucleotide.V,
										Nucleotide.N,Nucleotide.N,Nucleotide.V,Nucleotide.N,Nucleotide.N,Nucleotide.N,
										Nucleotide.V};
	
	
	public static ArrayList<Nucleotide> Gen (AcideRibonucleique arn, AcideRibonucleique gen){
		ArrayList <Nucleotide> generalise = new ArrayList <>();
		for(int i = 0 ; i < arn.size(); ++i){
			int pos = 0;
			switch (arn.get(i)){
			case A :
				pos = 0;
				break;
			case C :
				pos = 1;
				break;
			case G :
				pos = 2;
				break;
			case U :
				pos = 3;
				break;
			case R :
				pos = 4;
				break;
			case Y :
				pos = 5;
				break;
			case S :
				pos = 6;
				break;
			case W :
				pos = 7;
				break;
			case K :
				pos = 8;
				break;
			case M :
				pos = 9;
				break;
			case B :
				pos = 10;
				break;
			case D :
				pos = 11;
				break;
			case H :
				pos = 12;
				break;
			case V :
				pos = 13;
				break;
			default:
				break;
			}
			
			switch (gen.get(i)){
			case A :
				generalise.add(A[pos]);
				break;
			case C :
				generalise.add(C[pos]);
				break;
			case G :
				generalise.add(G[pos]);
				break;
			case U :
				generalise.add(U[pos]);
				break;
			case R :
				generalise.add(R[pos]);
				break;
			case Y :
				generalise.add(Y[pos]);
				break;
			case S :
				generalise.add(S[pos]);
				break;
			case W :
				generalise.add(W[pos]);
				break;
			case K :
				generalise.add(K[pos]);
				break;
			case M :
				generalise.add(M[pos]);
				break;
			case B :
				generalise.add(B[pos]);
				break;
			case D :
				generalise.add(D[pos]);
				break;
			case H :
				generalise.add(H[pos]);
				break;
			case V :
				generalise.add(V[pos]);
				break;
			case N :
				generalise.add(Nucleotide.N);
				break;
			}
		}
		return generalise;
	}

}
