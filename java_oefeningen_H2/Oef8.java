package cui;

import java.util.Scanner;

public class Oef8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Geef een strikt positief geheel getal in:");
		int getal = input.nextInt();
		
		for(int i = 1; i < getal; i = i+ 1) {
			if( getal%i==0) {
				System.out.print("De delers zijn:"); System.out.print(i);
			}
			
			
		input.close();
		}
	}

}
