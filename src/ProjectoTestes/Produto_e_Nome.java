package ProjectoTestes;
import java.util.Scanner;
public class Produto_e_Nome {

	public static void main(String[] args) {
		
		Scanner scanner = new  Scanner(System.in);
		
		System.out.print("Informe o preço do P1 TV: ");
		double precoP1 = scanner.nextDouble();
		
		System.out.print("Informe o preço de P2 Smarphone: ");
		double precoP2 = scanner.nextDouble();
		
		
		System.out.print("Informe o preço de P3 Notebook: ");
		double precoP3= scanner.nextDouble();
		
		
		System.out.print("Informe o preço de P4 MacBook: ");
		double precoP4= scanner.nextDouble();
		
		
		double SomaGeral = (precoP1 + precoP2 + precoP3 + precoP4);
		
		
		System.out.println("A Soma Geral dos preços de  TV, Smarphone, Notebbok e Macbook é: " + SomaGeral );
		
		scanner.close();

	}

}
