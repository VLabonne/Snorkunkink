import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

public class Game {
	
	public static int versus(int stageNumber, int[] point) {
		
		double oxygene = 0;
		boolean a = false;
		int[] cave = new int[4];
		int[] pos = new int[4];

		cave = Niveau.niveau(a, cave);
		a = true;

		int coffre[] = new int[cave[3]];
		int playerTresor[] = new int[4];
		int playerCoffre[] = new int[4];
		int tresors[] = new int[cave[3]];
		tresors = Tresor.tresor(cave);
		int[] tresorSvg = new int[4];
		int n = 0;
		boolean detectionToucheBas = false;
		boolean detectionToucheHaut = false;
		boolean detectionToucheRecup = false;
		boolean ft = false;
		int[] data = new int[3];
		data[0] = 5;
		int targets = 0;
		
		while (n != cave[3]) {
			coffre[n] = 1;
			n++;
		}

		int player = 0;
		while (oxygene <= 35) {
			InterfaceGraphique.IG(player, oxygene, cave, pos, coffre, tresorSvg, playerTresor);
			StdDraw.show(50);
			//int players = player;
			// System.out.println(oxygene);
			if(!(StdDraw.isKeyPressed(KeyEvent.VK_DOWN))){detectionToucheBas = false;}
			if(!(StdDraw.isKeyPressed(KeyEvent.VK_UP))){detectionToucheHaut = false;}
			if(!(StdDraw.isKeyPressed(KeyEvent.VK_ENTER))){detectionToucheRecup = false;}
			
			double fact = 35.0 / (double) (2 * cave[3]);
			if (pos[player] == 0) {
				playerCoffre[player] = 0;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_H)){
                InterfaceGraphique.Help();
            }
			if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN) && pos[player] != -cave[3] && !detectionToucheBas) {
				pos[player]--;
				oxygene = Oxygene.oxygene(pos[player], 1, oxygene, playerCoffre[player], playerTresor[player],
						tresorSvg[player])[0];
				tresorSvg[player] = tresorSvg[player] + (int) Oxygene.oxygene(pos[player], 1, oxygene,
						playerCoffre[player], playerTresor[player], tresorSvg[player])[1];
				detectionToucheBas = true;
				if (player != 3) {
					player++;
				} else {
					player = 0;
				}
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_UP) && pos[player] != 0 && !detectionToucheHaut) {
				pos[player]++;
				oxygene = Oxygene.oxygene(pos[player], 2, oxygene, playerCoffre[player], playerTresor[player],
						tresorSvg[player])[0];
				tresorSvg[player] = tresorSvg[player] + (int) Oxygene.oxygene(pos[player], 2, oxygene,
						playerCoffre[player], playerTresor[player], tresorSvg[player])[1];
				detectionToucheHaut = true;
				if (player != 3) {
					player++;
				} else {
					player = 0;
				}
				// oxygene = oxygene + fact*Cout.cout(2, 0, pos);
			
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER) && pos[player] != 0 && coffre[cave[3] + pos[player]] != 0 && !detectionToucheRecup) {
				oxygene = Oxygene.oxygene(pos[player], 3, oxygene, playerCoffre[player], playerTresor[player],
						tresorSvg[player])[0];
				tresorSvg[player] = tresorSvg[player] + (int) Oxygene.oxygene(pos[player], 3, oxygene,
						playerCoffre[player], playerTresor[player], tresorSvg[player])[1];
				coffre[cave[3] + pos[player]] = coffre[cave[3] + pos[player]] - 1;
				playerCoffre[player]++;
				playerTresor[player] = playerTresor[player] + tresors[cave[3] + pos[player]];
				// System.out.println(playerTresor[0]);
				// System.out.println(tresorSvg[0]);
				detectionToucheRecup = true;
				if (player != 3) {
					player++;
				} else {
					player = 0;
				}
				// oxygene = oxygene + fact*Cout.cout(3, 0, pos);

			}
			if (player == 3)
			{
			
				if (data[0] == 1) {ft = false;}
				if (data[0] == 0) {ft = true;}
				data = IA.ia(playerCoffre, cave, 3, cave[3], oxygene, coffre, Math.abs(pos[3]), targets, ft);
				targets = data[1];
				if(data[2] == 1 && pos[3] != -cave[3]) {
					pos[3]--;
					oxygene = Oxygene.oxygene(pos[3], 1, oxygene, playerCoffre[3], playerTresor[3],
							tresorSvg[player])[0];
					tresorSvg[3] = tresorSvg[3] + (int) Oxygene.oxygene(pos[3], 1, oxygene,
							playerCoffre[3], playerTresor[3], tresorSvg[3])[1];
					player = 0;
					
				}
				if (data[2] == 2 && pos[3] != 0) {
					pos[3]++;
					oxygene = Oxygene.oxygene(pos[3], 2, oxygene, playerCoffre[3], playerTresor[3],
							tresorSvg[3])[0];
					tresorSvg[3] = tresorSvg[3] + (int) Oxygene.oxygene(pos[3], 2, oxygene,
							playerCoffre[3], playerTresor[3], tresorSvg[3])[1];
					player = 0;
				}
				if (data[2] == 3 && pos[player] != 0 && coffre[cave[3] + pos[player]] != 0 ) {
					oxygene = Oxygene.oxygene(pos[player], 3, oxygene, playerCoffre[player], playerTresor[player],
							tresorSvg[player])[0];
					tresorSvg[player] = tresorSvg[player] + (int) Oxygene.oxygene(pos[player], 3, oxygene,
							playerCoffre[player], playerTresor[player], tresorSvg[player])[1];
					coffre[cave[3] + pos[player]] = coffre[cave[3] + pos[player]] - 1;
					playerCoffre[player]++;
					playerTresor[player] = playerTresor[player] + tresors[cave[3] + pos[player]];
					player = 0;
				}
				System.out.println(data[0]);
				System.out.println(data[1]);
				System.out.println(Math.abs(pos[3]));
				System.out.println(data[2]);
			}
			// System.out.println(oxygene);
		}
		while (!(StdDraw.isKeyPressed(KeyEvent.VK_RIGHT))) {

			deathscreen.deathscreens(stageNumber, point);
		}
		return 0;
}
	
	public static int coop(int stageNumber, int[] point) {
		
		double oxygene = 0;
		boolean a = false;
		int[] cave = new int[2];
		int[] pos = new int[2];

		cave = Niveau.niveau(a, cave);
		a = true;

		int coffre[] = new int[cave[3]];
		int playerTresor[] = new int[2];
		int playerCoffre[] = new int[2];
		int tresors[] = new int[cave[3]];
		tresors = Tresor.tresor(cave);
		int[] tresorSvg = new int[2];
		int n = 0;
		int pts = 0;
		boolean detectionToucheBas = false;
		boolean detectionToucheHaut = false;
		boolean detectionToucheRecup = false;
		boolean detectionToucheSpace = false;
		int[] data = new int[3];
		data[0] = 5;
		
		while (n != cave[3]) {
			coffre[n] = 1;
			n++;
		}

		int player = 0;
		while (oxygene <= 35) {
			
			pts = tresorSvg[0] + tresorSvg[1];
			
			InterfaceGraphique.IGCoop(pts, player, oxygene, cave, pos, coffre, tresorSvg, playerTresor);
			StdDraw.show(50);
			//int players = player;
			// System.out.println(oxygene);
			if(!(StdDraw.isKeyPressed(KeyEvent.VK_DOWN))){detectionToucheBas = false;}
			if(!(StdDraw.isKeyPressed(KeyEvent.VK_UP))){detectionToucheHaut = false;}
			if(!(StdDraw.isKeyPressed(KeyEvent.VK_ENTER))){detectionToucheRecup = false;}
			if(!(StdDraw.isKeyPressed(KeyEvent.VK_SPACE))){detectionToucheSpace = false;}
			
			double fact = 35.0 / (double) (2 * cave[3]);
			if (pos[player] == 0) {
				playerCoffre[player] = 0;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_H)){
                InterfaceGraphique.Help();
            }
			if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN) && pos[player] != -cave[3] && !detectionToucheBas) {
				pos[player]--;
				oxygene = Oxygene.oxygene(pos[player], 1, oxygene, playerCoffre[player], playerTresor[player],
						tresorSvg[player])[0];
				tresorSvg[player] = tresorSvg[player] + (int) Oxygene.oxygene(pos[player], 1, oxygene,
						playerCoffre[player], playerTresor[player], tresorSvg[player])[1];
				detectionToucheBas = true;
				if (player != 1) {
					player++;
				} else {
					player = 0;
				}
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_UP) && pos[player] != 0 && !detectionToucheHaut) {
				pos[player]++;
				oxygene = Oxygene.oxygene(pos[player], 2, oxygene, playerCoffre[player], playerTresor[player],
						tresorSvg[player])[0];
				tresorSvg[player] = tresorSvg[player] + (int) Oxygene.oxygene(pos[player], 2, oxygene,
						playerCoffre[player], playerTresor[player], tresorSvg[player])[1];
				detectionToucheHaut = true;
				if (player != 1) {
					player++;
				} else {
					player = 0;
				}
				// oxygene = oxygene + fact*Cout.cout(2, 0, pos);
			
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER) && pos[player] != 0 && coffre[cave[3] + pos[player]] != 0 && !detectionToucheRecup) {
				oxygene = Oxygene.oxygene(pos[player], 3, oxygene, playerCoffre[player], playerTresor[player],
						tresorSvg[player])[0];
				tresorSvg[player] = tresorSvg[player] + (int) Oxygene.oxygene(pos[player], 3, oxygene,
						playerCoffre[player], playerTresor[player], tresorSvg[player])[1];
				coffre[cave[3] + pos[player]] = coffre[cave[3] + pos[player]] - 1;
				playerCoffre[player]++;
				playerTresor[player] = playerTresor[player] + tresors[cave[3] + pos[player]];
				// System.out.println(playerTresor[0]);
				// System.out.println(tresorSvg[0]);
				detectionToucheRecup = true;
				if (player != 1) {
					player++;
				} else {
					player = 0;
				}
	}
			if (StdDraw.isKeyPressed(KeyEvent.VK_SPACE) && !detectionToucheSpace) {
				
				detectionToucheSpace = true;
				if(player != 1) {
					player++;
				}else {
					player = 0;
				}
			}
}
		while (!(StdDraw.isKeyPressed(KeyEvent.VK_RIGHT))) {

			deathscreen.deathscreens(stageNumber, point);
		}
		return 0;
	}
}