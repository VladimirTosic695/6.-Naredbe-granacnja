package UUP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ifElseStruktura {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		double x,y;
		
		System.out.println("Unesite vrednost x");
		x = Double.parseDouble(bf.readLine());
		
		if(x>=0) {
			y =x;
		}
		else 
		{
			y= -x;
		}
		System.out.println("Y = " + y);
	}

}
