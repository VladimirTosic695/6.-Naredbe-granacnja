package UUP;

import java.util.Scanner;

public class Aritmeticka {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a,b,z;
		System.out.println("unesite a i b kao realne brojeve ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		sc.close();
		/*if (a>b) {
			z = 2*a+b;
		}
		else {
			z = a-2*b;
		}
		System.out.println("Vrednost z = " +z);*/
		
		z = (a>b)? 2*a+b : a-2*b;
		System.out.println("Vrednost z = " +z);
	}

}
