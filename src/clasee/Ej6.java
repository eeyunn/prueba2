package clasee;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Introduce una cantidad: ");
			int num = input.nextInt();
			
			int n500, n200, n100, n50, n20, n10, n5, resto;
			
			n500 = num / 500;
			resto = num % 500;
			
			n200 = resto / 200;
			resto = resto % 200;
			
			n100 = resto / 100;
			resto = resto % 100;
			
			n50 = resto / 50;
			resto = resto % 50;
			
			n20 = resto / 20;
			resto = resto%20;
			
			n10 = resto / 10;
			resto = resto%10;
			
			n5 = resto / 20;
			resto = resto%20;
			
			if(n500 > 0) {
				System.out.println("Billetes de 500: " + n500);
			}
			if (n200 > 0) {
				System.out.println("Billetes de 200: " + n200);
			}
			//ARREGLAR
			System.out.println("Billetes de 100: " + n100);
			System.out.println("Billetes de 50: " + n50);
			System.out.println("Billetes de 20: " + n20);
			System.out.println("Billetes de 10: " + n10);
			System.out.println("Billetes de 5: " + n5);

			
			input.close();
			
		}catch (Exception e) {
			System.out.println("ERROR en la introducción de datos.");
		}

	}

}
