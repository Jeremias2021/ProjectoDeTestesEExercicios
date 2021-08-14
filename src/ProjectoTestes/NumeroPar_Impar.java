package ProjectoTestes;

import java.util.Scanner;

public class NumeroPar_Impar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o numero: ");
		int numero = scanner.nextInt();
		
		if((numero%2 == 0)) {
			System.out.println("Par");			
		} else {
			System.out.println("Impar");
		}
				scanner.close();
	}

}
