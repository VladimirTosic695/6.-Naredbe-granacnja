package UUP;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b,y;
		
		System.out.println("Unesite vrednosti za a i b ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		if (a>=0) 
			y = (1-Math.min(a, b))/(1+Math.max(a, b));
			
		
		else 
			y = Math.min(a, b) / (Math.min(a*a, b*b)+3);
			
			System.out.println("y = "+y);
		
		
			/*if (a==0) 
			System.out.println("Greska, uneta vrednost je 0.");*/
		sc.close();
	}

}
