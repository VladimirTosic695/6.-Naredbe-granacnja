package UUP;

import java.util.Scanner;

public class primer18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double x;
		boolean y;
		System.out.println("Unesite vrednost promenljive x");
		x = sc.nextDouble();
		sc.close();
		
		if (x>=1) {
y = Math.sqrt((2+x-Math.pow(x, 3)) / x+2) > 0 || Math.exp(x) < x-1 && Math.sqrt(x-1) <= 0;
		System.out.println("Vrednost funkcije y = "+ y );
		}
		
	}

}
