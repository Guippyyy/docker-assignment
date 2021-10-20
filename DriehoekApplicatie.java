package cui;

import java.util.Scanner;

import Domein.Driehoek;

public class DriehoekApplicatie {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int zijdeA, zijdeB, zijdeC;
		
		System.out.print("Geef de lengte van zijde A:");
		zijdeA = input.nextInt();
		
		System.out.print("Geef de lengte van zijde B:");
		zijdeB = input.nextInt();
		
		System.out.print("Geef de lengte van zijde C:");
		zijdeC = input.nextInt();
		
		Driehoek driehoek1 = new Driehoek(zijdeA, zijdeB, zijdeC);
		
		System.out.printf("De driehoek is %s rechthoekige driehoek",
				driehoek1.isRechthoekig()= true ? "een" : "geen");
	}

}
