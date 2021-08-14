package ProjectoTestes;

import java.util.Scanner;

public class ericson2 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escveve seu nome:  ");
	    String nome = scanner.nextLine();
	    
	    System.out.print("Escreve dia nascimento:  ");
	    int DiaNasc= scanner.nextInt();
	    
	    System.out.print("Escveve mes nascimento:  ");
	    int MesNasc= scanner.nextInt();
	    
	    System.out.print("Escveve ano  nascimento:  ");
	    int AnoNasc= scanner.nextInt();
	    
	    int Calnascimento = 2021 - AnoNasc;
	    
	    

	    System.out.println(" Olá o Seu nome é: " +nome);
	    System.out.println("e  sua idade é: " +Calnascimento);
		
		

	}

}
