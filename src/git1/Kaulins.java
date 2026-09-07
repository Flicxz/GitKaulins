package git1;

public class Kaulins {
	static void MestKaulinu(int reizes) {
		int skaitlis;
		for (int i=0; i<reizes; i++) {
			skaitlis = (int)(Math.random()*6)+1;
			System.out.println("Uzkrita skaitlis: " + skaitlis);
		}
	}
	
	public static void main(String[] args) {
		MestKaulinu(5);
	}

}
