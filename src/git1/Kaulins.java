package git1;

import java.util.Scanner;

public class Kaulins {
	static int MestKaulinu(int reizes) {
		int skaitlis, min=6;
		for (int i=0; i<reizes; i++) {
			skaitlis = (int)(Math.random()*6)+1;
			System.out.println("Uzkrita skaitlis: " + skaitlis);
			if (skaitlis < min) min = skaitlis;
		}
		return min;
	}

	public static void main(String[] args) {
		int reizes;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Cik reizes mest kauliņu? ");
		reizes = scan.nextInt();
		System.out.println("Mazākais skaitlis no viesiem metieniem: " + MestKaulinu(reizes));

		scan.close();
	}
}
