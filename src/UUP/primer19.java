package UUP;

import java.util.Scanner;

public class primer19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double q,r,s,y;
		
		System.out.println("Unesite vrednost q");
		q = sc.nextDouble();
		System.out.println("Unesite vrednost r");
		r = sc.nextDouble();
		System.out.println("Unesite vrednost s");
		s = sc.nextDouble();
		
		
		if (r>s) {
			y = r;
			}
			else
				y = s;
		if(q<y) {
			y = q;
		}
		System.out.println("Vrednost funkcije y = "+ y);
		sc.close();
	}

}
