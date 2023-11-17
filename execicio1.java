
public class execicio1 {
	public static void main(String [] args) {

		int matriz[][], i, j, m = 1;

		matriz = new int [4][4];
		matriz [0][0] = 2;


		for (i=0; i<4; i++) {
			for (j=0; j<4; j++) {
				m = m*2;
				matriz[i][j]= m;
	 }
	}

	System.out.println("O resultado é:");	
	for (i=0; i<4; i++) {
	    System.out.println(" ");
		for (j=0; j<4; j++) {
				System.out.print("["+matriz[i][j]+"]");

		
		}
	}
}
}
