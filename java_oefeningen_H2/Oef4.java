package cui;
import java.util.Scanner;

public class Oef4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		double afstand = -10000; int tel = 0; double snelheid = 40;
		
		
		
		while(afstand < 1) {
		
			System.out.print("Geef de afstand in kilometer (strikt positief geheel getal):"); afstand = input.nextInt();
		}
		double tijd = 60/(snelheid/afstand);
		
		while(tel < 11) {
			
			System.out.println(afstand + " km\t" + snelheid + " km/u\t0 u "+tijd+" min" );
			tel++;snelheid += 10; tijd = 60/(snelheid/afstand);
		}
		//voor de tijd 60/(snelheid/afstand)
		input.close();
	}

}
