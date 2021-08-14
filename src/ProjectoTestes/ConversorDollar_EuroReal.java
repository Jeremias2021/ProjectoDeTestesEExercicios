package ProjectoTestes;

import java.util.Scanner;

public class ConversorDollar_EuroReal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos Reais eu tenho?  R$");
		double reais = scanner.nextDouble();
		
		double dolares = reais/5.05;
		double euro = reais/5.98;
		
		System.out.println("Posso ter U$$ "  +dolares);
		System.out.println("Posso ter € "  +euro);
		scanner.close();
	}

}
