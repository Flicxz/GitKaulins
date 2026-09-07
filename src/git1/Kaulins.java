package git1;

import java.util.Scanner;

public class Kaulins {

	public static void main(String[] args) {
		int skaitlis, reizes;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Cik reizes mest kauliņu? ");
		reizes = scan.nextInt();
		
		for (int i=0; i<reizes; i++) {
			skaitlis = (int)(Math.random()*6)+1;
			System.out.println("Uzkrita skaitlis: " + skaitlis);
		}
		scan.close();
	}

}
