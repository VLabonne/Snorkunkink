import java.util.Random;

public class Tresor {

	public static int[] tresor (int [] cave) {
		
		int [] tresors = new int [cave[3]];
		int a = 0;
		int b = 0;
		int n =0;
		
		while(n != cave[3]) {
			if (n <= cave[0]) {
			 a = 3;
			 b = 1;
			}
			if(cave[0] < n && n <= cave[0] + cave[1]){
			 a = 4;
			 b = 5;
			}
			if(cave[0] + cave[1] < n && n != cave[3]) {
			 a = 3;
			 b = 10;
			}
		//for( i=0; i == cave[3]; i++) {
		Random rand = new Random();
		int tresor = rand.nextInt(a) + b;
		tresors[n] = tresor;
		n++;
		}
	return tresors;

}

}
