package ProjectoTestes;
import java.util.Scanner;
public class Produto_e_Nome {

	public static void main(String[] args) {
		
		Scanner scanner = new  Scanner(System.in);
		
		System.out.print("Informe o pre�o do P1 TV: ");
		double precoP1 = scanner.nextDouble();
		
		System.out.print("Informe o pre�o de P2 Smarphone: ");
		double precoP2 = scanner.nextDouble();
		
		
		System.out.print("Informe o pre�o de P3 Notebook: ");
		double precoP3= scanner.nextDouble();
		
		
		System.out.print("Informe o pre�o de P4 MacBook: ");
		double precoP4= scanner.nextDouble();
		
		
		double SomaGeral = (precoP1 + precoP2 + precoP3 + precoP4);
		
		
		System.out.println("A Soma Geral dos pre�os de  TV, Smarphone, Notebbok e Macbook �: " + SomaGeral );
		
		scanner.close();

	}

}
