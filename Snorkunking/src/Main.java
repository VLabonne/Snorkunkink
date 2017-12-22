import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

public class Main {
	
	public final static int X_MAX=150;
	public final static int Y_MAX=100;
	public final static float WIDTH=0.5f;
	
	public static void main(String[] args) {
		boolean cond = false;
		
		for(int k=1; k!=4; k++) {
		while (!cond) {
		cond=Menu.menu();
		}	
			double oxygene = 0;
			boolean a = false;
			int [] cave = new int [4];
			int pos = 0;
			
			cave = Niveau.niveau(a, cave);
			a = true;
				
			int coffre[] = new int[cave[3]];
			int n=0;
			while(n!=cave[3]) {coffre[n]=1;n++;}
		
			while(oxygene <= 35) {
			InterfaceGraphique.IG(oxygene, cave, pos, coffre);
			StdDraw.show(50);
			//System.out.println(oxygene);
			
			double fact = 35.0/(double)(2*cave[3]);
			
			if(StdDraw.isKeyPressed(KeyEvent.VK_DOWN) && pos != -cave[3]) {
				pos--;
				oxygene = Oxygene.oxygene(pos, 1, oxygene, 0, 0)[0];
				
		}
			if(StdDraw.isKeyPressed(KeyEvent.VK_UP) && pos !=0) {
				pos++;
				oxygene = Oxygene.oxygene(pos, 2, oxygene, 0, 0)[0];
				//oxygene = oxygene + fact*Cout.cout(2, 0, pos);
				
		}
			if(StdDraw.isKeyPressed(KeyEvent.VK_ENTER) && coffre[cave[3] + pos] !=0) {
				oxygene = Oxygene.oxygene(pos, 3, oxygene, 0, 0)[0];
				coffre[cave[3] + pos] = coffre[cave[3] + pos] - 1;
				System.out.println(coffre[cave[3] + pos]);
				//oxygene = oxygene + fact*Cout.cout(3, 0, pos);
				
			}
				
			}
			while(!(StdDraw.isKeyPressed(KeyEvent.VK_RIGHT))){
			StdDraw.clear(StdDraw.RED);
			StdDraw.text(75, 50, "Vous êtes morts");
			StdDraw.show();
			}
			}
			
		}
			}
		//InterfaceGraphique.IG();
		
				
		/*int [] player = new int [4];
		 for(int i = 0; i<4; i++) {
		 While (oxygene!=0){
		 
	System.out.println(Coffre.coffre(1,6,6));
*/

	
	


