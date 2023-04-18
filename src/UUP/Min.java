package UUP;

import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a, b, y;
		System.out.println("Unesite vrednosti za a i b ");
		a = sc.nextDouble();
		b = sc.nextDouble();

		/*
		 * y = (a>=0)? Math.min(a, b) : 2*Math.min(a, b);
		 * 
		 * System.out.println("Y = "+y);
		 */

		if (a >= 0) {
			y = Math.min(a, b);
		} else
			y = 2 * Math.min(a, b);
		System.out.println("Y = " + y);
		sc.close();
	}

}
