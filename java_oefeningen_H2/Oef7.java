package cui;

import java.util.Scanner;

public class Oef7 {

	public static void main(String[] args) {
		
		int tel = 0;int tel2 = 0;int tel3 = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Geef een positief geheel getal (stoppen met 0):");
		int getal = input.nextInt();
			
		while(getal != 0){
			if (getal%2 ==0) {
				tel ++;	
			}
			
			if (getal%3 ==0){
				tel2 ++;
			}
			
			if (getal%6 ==0){
				tel3 ++;
			}
			
			
			System.out.print("Geef een positief geheel getal (stoppen met 0):");
			getal = input.nextInt();
			
		}
		System.out.print("\nEr zijn "+tel+" getallen deelbaar door 2");
		System.out.print("\nEr zijn "+tel2+" getallen deelbaar door 3");
		System.out.print("\nEr zijn "+tel3+" getallen deelbaar door 6");
		
		input.close();
	}

}
