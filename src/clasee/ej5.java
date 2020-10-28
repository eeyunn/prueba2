package clasee;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
		
		
			System.out.println("Introduce la hora:minutos:segundos.");
		
			System.out.print("Introduce la hora: ");
			int hora = input.nextInt();
		
			System.out.print("Introduce los minutos: ");
			int min = input.nextInt();
			System.out.print("Introduce los segundos: ");
			int sec = input.nextInt();
			
			if (hora >= 0 && hora < 24) {
				if (min >= 0 && min < 60) {
					if (sec >= 0 && sec < 60) {
						System.out.println("La hora " + hora + ", los minutos " + min + " y los segundos " + sec + " son correctos.");
					}else System.out.println("Los segundos no son correctos.");
				}else System.out.println("Los minutos no son correctos.");
			}else System.out.println("La hora no es correcta.");
		
			input.close();
			}
			catch (Exception e) {
			System.out.println("ERROR en la introducción de datos.");
			}
		}

}
