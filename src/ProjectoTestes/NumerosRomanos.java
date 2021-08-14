package ProjectoTestes;

import java.util.Scanner;

public class NumerosRomanos {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("Digite o numero: ");
		int numero = scanner.nextInt();
		
		String numerosRomanos = null;
		
		switch (numero){
		case 1: numerosRomanos = "I";
			break;
		case 5: numerosRomanos = "V";
			break;
		case 10: numerosRomanos = "X";
			break;
		case 50: numerosRomanos = "L";
			break;
		case 100: numerosRomanos = "C";
			break;
		case 500: numerosRomanos = "D";
			break;
		case 1000: numerosRomanos = "M";
			break;
			default:
		}
		System.out.println("O numero: " +numerosRomanos);
		  
		
		
		scanner.close();

	}

}
