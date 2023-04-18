package UUP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak1 {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		double x,y,f;
		DecimalFormat df= new DecimalFormat ("#.###");
		System.out.println("Unesite vrednost x");
		x = Double.parseDouble(bf.readLine());
		System.out.println("Unesite vrednost y");
		y = Double.parseDouble(bf.readLine());
		
		if (x>y)
			f = Math.sqrt((x-0.2)/(2+y));
		else
			f = Math.sqrt((y-0.2)/(2+x));
		
		System.out.println("Vrednost funkcije f = "+df.format(f));

	}

}
