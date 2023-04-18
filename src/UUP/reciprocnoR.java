package UUP;

import java.util.Scanner;

public class reciprocnoR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c,r,min;
		System.out.println("Unesite vrednosti a, b i c");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		sc.close();
		min=a;
		/*min = a;
		
		if (b<min)
			min = b;
		if (c<min)
			min = c;
		System.out.println("Najmanji broj je "+ min);
		
		if (min==0) 
			r = 3;
		else 
			r = 1/min;*/
		if (a<b && a<c)
			min=a;
		if (b<a && b<c)
			min = b;
		if (c<a && c<b)
			min = c;
		System.out.println("Minimum je " + min);
		if (0 == min)
			r = 3;
		else 
		r=1/min;
		System.out.println("reciprocna vrednost je " + r);
	}

}
