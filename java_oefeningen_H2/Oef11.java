package cui;

import java.util.Scanner;

public class Oef11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Geef een geheel getal in:"); int getal = input.nextInt();
		
		if(getal%2 == 0) {
			System.out.print("Het ingevoerde getal "+ getal + " is een even getal");
		}
		else {
			System.out.print("Het ingevoerde getal "+ getal + " is een oneven getal");
		}
		
		input.close();
	}

}
