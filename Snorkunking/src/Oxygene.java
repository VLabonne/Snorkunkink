
public class Oxygene {

	public static  int [] oxygene(int niveau, int action, int oxygene, int nbrcoffre, int coffre_dernier_niveau) {
		
		int[] values = new int [2];
		
		if(niveau != 0) {
		
			oxygene = oxygene - Cout.cout(action, nbrcoffre, niveau);
		
			if(oxygene == 0) {
			
				coffre_dernier_niveau = coffre_dernier_niveau + nbrcoffre;
				nbrcoffre = 0;
				values[0] = coffre_dernier_niveau;
				values[1] = nbrcoffre;
				return values;
			
			}
		
			else {
			
				values[0] = oxygene;
				return values;
			}
		}
		else {
			values[0]=oxygene;
			values[1]=nbrcoffre;
			return values;
		}
	}
}
