package cui;

import java.util.Scanner;

public class Oef10 {

	public static void main(String[] args) {
		int tellernew = 0; int noemernew = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Geef de teller van de breuk in:"); int teller = input.nextInt();
		System.out.print("Geef de noemer van de breuk in:"); int noemer = input.nextInt();
		
		int deling = (teller/noemer);
		System.out.print(teller+"/"+noemer+ " = "+ deling);
		
		int rest = (teller%noemer);
		System.out.print("\nrest = "+rest);
		
		
		if(rest == 0) {
			tellernew = teller/noemer;
			noemernew = noemer/noemer;
			System.out.print("\nVereenvoudigde breuk = "+ tellernew+"/"+noemernew);
		}
		
		
		input.close();
	}

}
