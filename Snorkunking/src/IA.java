import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IA {

		public static List<Object> ia(int realPlayer, int maxNiveau, int oxygene, int[] nbrcoffre, int niveauActuel, int[] targets, boolean[] focusTargets) {
			
			boolean[] focusTarget = new boolean[4];
			List<Object> data = new ArrayList<Object>();
			
			for(int i = 0; i == 4 - realPlayer; i++) {
				
				int[] target = new int [4 - realPlayer];
				focusTarget[i] = false;
				int action = 0;
			
				while(true) {
					if(focusTarget[i] == false) {
						
						Random rand = new Random();
						target[i] = rand.nextInt(maxNiveau);
						focusTarget[i] = true;
					}
					
					if(focusTarget[i] && oxygene >( (target[i] - niveauActuel)*Cout.cout(1, nbrcoffre[i], niveauActuel) + target[i]*Cout.cout(1, nbrcoffre[i], niveauActuel) + (target[i] + 1)*Cout.cout(1, nbrcoffre[i+1], niveauActuel) + (target[i] + 1)*Cout.cout(1, nbrcoffre[i+2], niveauActuel) + (target[i] + 1)*Cout.cout(1, nbrcoffre[i+3], niveauActuel) )) {
						
						if(target[i] < niveauActuel) {
							action = 2;
							break;
						}
						
						if(target[i] > niveauActuel) {
							action = 1;
							break;
						}
						
						if(target[i] == niveauActuel) {
							action = 3;
							break;
						}
					}
					
					else {
						
						if(nbrcoffre[i] != 0 && oxygene > niveauActuel*Cout.cout(1, nbrcoffre[i], niveauActuel)) {
							target[i] = 0;
							focusTarget[i] = true;
							action = 1;
							break;
						}
						
						else {
							
							Suicide.suicide();
						}
					}
				}
				
				data.add(action);
				data.add(target);
				data.add(focusTarget);
			}
			
			return data;
			
		}
}
