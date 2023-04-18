package UUP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak2 {

	public static void main(String[] args) throws Exception {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	double a,b,c,p;
	System.out.println("Unesite vrednost stranice a");
	a = Double.parseDouble(bf.readLine());
	System.out.println("Unesite vrednost stranice b");
	b = Double.parseDouble(bf.readLine());
	System.out.println("Unesite vrednost stranice c");
	c = Double.parseDouble(bf.readLine());
	
	if ((a+b>c) && (a+c>b) && (b+c>a)) {
		
		p = 0.25 * Math.sqrt((a+b+c)*(b+c-a)*(a+c-b)*(a+b-c));
	System.out.println("Ove tri stranice cine trougao i njegova povrsina je "+ p);
	}
	else
	{
	System.out.println("Uneta stranice ne cine trougao, unesite ih ponovo.");
	}
		
		
	}

}
