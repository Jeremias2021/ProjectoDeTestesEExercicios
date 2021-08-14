package ProjectoTestes;

import java.util.Scanner;

public class Conversor_Temperatura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Farenheit: ");
		double F = scanner.nextDouble();
		
		double Celsius = (F-32)/1.8;
		double Kelvin = (F-32) * 5/9 + 273.15;
		
		System.out.println("A temperatura em Grau Celsius é : " +Celsius);
		System.out.println("A temperatura em Grau Kelvin é : " +Kelvin);

	
		scanner.close();

	}

}
