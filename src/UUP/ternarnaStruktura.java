package UUP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ternarnaStruktura {

	public static void main(String[] args) throws Exception {
		// Deklarisanje podataka
	
	
		double x,y;
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Unesite vrednost x");
		x = Double.parseDouble(bf.readLine());
		// Ternarni ili uslovni operatori ? i :
		y = (x>=0) ? Math.abs(x) : -x;
	
		System.out.println("Y = "+ y);
	}

}
