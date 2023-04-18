package UUP;

import java.io.*;

public class primer20 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		double x,y,p,q,f;
		
		System.out.println("Unesite vrednost x");
		x = Double.parseDouble(bf.readLine());
		System.out.println("Unesite vrednost y");
		y = Double.parseDouble(bf.readLine());
		System.out.println("Unesite vrednost p");
		p = Double.parseDouble(bf.readLine());
		System.out.println("Unesite vrednost q");
		q = Double.parseDouble(bf.readLine());
		
		if (p<q) {
			f=p;
		}
		else
			f=q;
		if (y>f)
			f = y;
		if (x<f)
			f = x;
		System.out.println("Vrednos f = "+ f);
	}

}
