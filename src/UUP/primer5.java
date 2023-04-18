package UUP;

import java.util.Scanner;

public class primer5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a,y;
	
	System.out.println("Unesite vrednost a ");
	a= sc.nextDouble();
	sc.close();
	
	if (a>0) {
		y = Math.sqrt(a);
	}
	else {
		y = a*a;
	}
	System.out.println("y= "+ y);
	}

}
