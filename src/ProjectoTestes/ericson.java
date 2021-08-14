package ProjectoTestes;

import java.util.Scanner;

public class ericson {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Informa numero N1:  ");
    double N1 = scanner.nextDouble();
     
    System.out.print("Informa numero N2:  ");
    double N2 = scanner.nextDouble();
			
	double soma = N1+N2;
	
	if(soma> 0  && soma <100) {
		System.out.println("Dentro Range ");
	} else if (soma < 0 ) {
		System.out.println("Abaixo Rang");
		}
		 
	}

}
