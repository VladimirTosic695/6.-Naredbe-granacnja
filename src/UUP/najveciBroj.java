package UUP;

import java.util.Scanner;

public class najveciBroj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Deklarisanje promenljivih
		double a,b,c,max;
		
		// Unos podataka
		System.out.println("Unesite tri broja (a,b,c) ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		sc.close();
		if ((a==b)&&(a==c))
			System.out.println("Greska.");
		else {
		max = a;
		
		if (b>a) 
			max =b;
			
		
		if(c>b) 
			max =c;
		
		System.out.println("najveci je "+max);
		}
		
		//Obrada podataka
		/*if (a>b && a>c) {
			max=a;
			System.out.println("Najveci broj je "+max);
		}
		else if (b>a && b>c)
		{
			max=b;
			System.out.println("Najveci broj je "+max);
		}
		else if (c>a && c>b) {
			max =c;
			System.out.println("Najveci broj je "+max);
			}
		
		else {
			System.out.println("Unesite ponovo brojeve. Postoje minimum 2 broja koja imaju istu vrednost.");
			*/
		

	}

}
