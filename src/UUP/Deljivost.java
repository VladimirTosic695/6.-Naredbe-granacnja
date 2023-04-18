package UUP;

import java.util.Scanner;

public class Deljivost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,z;
		
		System.out.println("Unesite vrednosti celih brojeva za a i b");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		/*if (a % 2 ==0 && b % 3 ==0) {
			z = a+b;
		}
		else {
			z = a-b;
		}
		System.out.println("Z = "+z);*/
		z = (a % 2 ==0 && b % 3 ==0)? a+b:a-b;
		System.out.println("Z = "+z);
	}

}
