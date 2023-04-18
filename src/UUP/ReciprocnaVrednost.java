package UUP;

import java.util.Scanner;

public class ReciprocnaVrednost {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double a;
	double x;
	System.out.print("unesite vrednost realnog broja a ");
	a = sc.nextInt();
	sc.close();
	/*if (a%2!=0) {
		x = 1/a;
	}
	else {
		x = Math.pow((a-1), 2);
	}
	System.out.println("Za uneti broj a = "+a+" vrednost izraza je "+x);
	}*/
	
	x = (a%2!=0)? 1/a : Math.pow((a-1), 2);
	System.out.println("Za uneti broj a = "+a+" vrednost izraza je "+x);
	}

}
