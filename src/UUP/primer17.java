package UUP;

import java.util.Scanner;

public class primer17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double x,y,z,f;
		System.out.println("unesite vrednost promenljive x");
		x = sc.nextDouble();
		System.out.println("Unesite vrednost promenljive y");
		y = sc.nextDouble();
		System.out.println("Unesite vrednost promenljive z");
		z = sc.nextDouble();
		sc.close();
		if (2 * x != y) {
			f = (x+y)*(x+z)/(2*x-y);
			System.out.println("Vrednost funkcije f= "+f);
			
		}
		else 
			System.out.println("Ponovo unesite vrednosti promenljivih. U ovom slucaju 2*x=y.");
		
		}

}
