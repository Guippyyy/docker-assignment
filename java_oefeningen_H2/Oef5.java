package cui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Oef5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> nummers = new ArrayList<Integer>();
		
		int getal; int tel = 1;
		
		while(tel < 11) {
			System.out.print("Geef getal "+ tel +" in:"); getal = input.nextInt();
			tel++;
			nummers.add(getal);
		}
		input.close();
		Collections.sort(nummers);
		System.out.print("Het op 1 na grootste getal is "+nummers.get(8)); 
	}
}

