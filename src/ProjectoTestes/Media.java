package ProjectoTestes;
import java.util.Scanner;

public class Media {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe a Nota: ");
          int nota = scanner.nextInt();
        
        if (nota>=7 && nota <= 10) {
            System.out.println ("APROVADO!");

        } else if (nota>=5 && nota <7) {
            System.out.println ("RECUPERAÇÃO!");

        } else if (nota>=0 && nota <5) {
            System.out.println ("REPROVADO!");
        }else{
            System.out.println ("NOTA INVÁLIDA!");
        }
        
		System.out.println ("FIM DO PROGRAMA !!!!");
		scanner.close();
	}
	
}



