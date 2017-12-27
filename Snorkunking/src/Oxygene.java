
public class Oxygene {

	public static  double [] oxygene(int niveau, int action, double oxygene, int nbrcoffre, int nbrtresor, int tresorSvg) {
		
		double[] values = new double [2];
		
		if(niveau != 1) {
		
			oxygene = oxygene + Cout.cout(action, nbrcoffre, niveau);
		
			}
		
		if (niveau == 0) {
			values[1]=nbrtresor - tresorSvg;
		}
		values[0]=oxygene;
		return values;
}
}
