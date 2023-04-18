package UUP;

import java.util.Scanner;

public class Oblast {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	double x,y;
	double x1,x2,y1,y2;
	x1 = -3;
	x2 = 3;
	y1 = -2;
	y2 = 2;
	System.out.println("Unesite vrednost tacke x ");
	x = sc.nextDouble();
	System.out.println("Unesite vrednost tacke y ");
	y = sc.nextDouble();
	
	if ((x>x1&&x<x2)&&(y>y1&&y<y2))
	System.out.println("Uneta tacka se nalazi unutar pravougaonika.");
	else
		System.out.println("Uneta tacka nije unutar pravougaonika.");
	sc.close();
	
	}

}
