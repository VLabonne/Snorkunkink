import java.util.List;
import java.util.Random;

public class IA {

		public static int[] ia(int[] nbrcoffre, int[] cave, int realPlayer, int maxNiveau, double oxygene, int[] coffre, int niveauActuel, int targets, boolean focusTargets) {
			
				int action = 0;
				int ft = 0;
			
					if(!focusTargets ) {
						
						Random rand = new Random();
						targets = rand.nextInt(maxNiveau);
						focusTargets = true;
					}
					
					if(focusTargets){ // && oxygene >( (targets - niveauActuel)*Cout.cout(1, nbrcoffre[3 - realPlayer], niveauActuel) + targets*Cout.cout(1, nbrcoffre[3 - realPlayer], niveauActuel) + (targets + 1)*Cout.cout(1, nbrcoffre[3 - realPlayer+1], niveauActuel) + (targets + 1)*Cout.cout(1, nbrcoffre[3 - realPlayer+2], niveauActuel) + (targets + 1)*Cout.cout(1, nbrcoffre[3 - realPlayer+3], niveauActuel))) {
						
						if(targets < niveauActuel) {
							action = 2;
							
						}
						
						if(targets > niveauActuel) {
							action = 1;
							
						}
						
						if(targets == niveauActuel && coffre[cave[3] - niveauActuel] != 0) {
							action = 3;
							focusTargets = false;
						
						}
					}
					
					else {
						focusTargets = false;
						/*if(nbrcoffre[3 - realPlayer] != 0 && oxygene > niveauActuel*Cout.cout(1, nbrcoffre[3 - realPlayer], niveauActuel)) {
							targets = 0;
							focusTargets = true;
							action = 1;
							
						}
						
						else {
							
							Suicide.suicide();
						}*/
					}
				
				int[] data = new int[3];
				if(focusTargets) {ft = 0;}
				if(!(focusTargets)) {ft = 1;}
				data[0] = ft;
				data[1] = targets;
				data[2] = action;
			
			return data;
			
		}
}
