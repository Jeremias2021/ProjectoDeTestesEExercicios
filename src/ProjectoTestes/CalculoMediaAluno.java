package ProjectoTestes;
import java.util.Scanner;
public class CalculoMediaAluno {
	
	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       
	      System.out.print("Informe seu Nome:  ");
	      String nome = scanner.nextLine();
	       
	      System.out.print("Informa a nota da Atividade N1:  ");
	      int notaAtividade1 = scanner.nextInt();
	       	
	        	System.out.print("Informa a nota da Atividade N2:  ");
	        	double notaAtividade2 = scanner.nextInt();
	              
	        	System.out.print("Informa a nota da Atividade N3:  ");
	        	double notaAtividade3 = scanner.nextInt();
	         
	        	double mediaAluno = (notaAtividade1 + notaAtividade2 + notaAtividade3) / 3;
	            
	            System.out.println();
	            System.out.println("BEM VINDO A CALCULADORA DE MÉDIA DE ALUNO ");
	            System.out.println(" A sua Média é: " + mediaAluno);
	            
	            if(mediaAluno>=10) {
	            	
	                System.out.println();
	                System.out.println("Parabéns Aluno/a Aprovado/a.");
	                System.out.println("OBS: A sua média é maior que 10 por isso foi aprovado/a");
	                
	                } else if(mediaAluno <7) {
	                System.out.println();
	                System.out.println("Infelizmente Aluno/a Reprovado/a.");
	                System.out.println("OBS: A sua média deve ser maior ou igual a 10 para ser aprovado/a");
	                
	                } else if(mediaAluno >7 && mediaAluno < 10) {
	                	System.out.println("Infelizmente terá que fazer Recuperação.");
	            	     System.out.println();
	                }
	                System.out.println("FIM DO PROGRAMA!!!!!!!!");
	            	scanner.close();
	        }
	   }
