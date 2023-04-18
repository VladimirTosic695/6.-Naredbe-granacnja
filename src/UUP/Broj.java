package UUP;

import java.util.Scanner;

public class Broj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int j,d,s,k,broj,rez;
		
		System.out.println("Unesite trocifren broj. ");
		broj = sc.nextInt();
		sc.close();
		
		j = broj % 10;
		d = (broj / 10) % 10;
		s = broj / 100;
		
		if (j>d)  {                 // if (j>d)
			k = j;                  // k = j;
			j = d;                  // j = d
			d = k;	                // d = k
		}
		
		if (j>s) {                   // (j>s)
			k = j;                  // k = j
			j = s;                  // j = s
			s = k;                  // s = k
		}
		if (d>s) {                  //  (d>s)  
			k = d;                 // k = d
			d = s;                 // d = s
			s = k;                 // s = k
		}
		rez = s * 100 + d * 10 +j;
		System.out.println("Za trocifreni broj " + broj + " najveci broj od tih cifara je " + rez);
	}
}
