import java.util.Scanner;

public class Vetores {
	public static void main(String[] args) {
		double alunos[] = new double [10], total =0;
		Scanner leitor = new Scanner(System.in);
		for(int i=0;i<alunos.length;i++) {
			System.out.println("Por favor, digite o consumo do " + (i+1) + " ° aluno");
			alunos[i]= leitor.nextDouble(); 
			total = alunos[i] + total ;
		}
		for(int i=0;i<alunos.length;i++) {
			System.out.println("O Aluno "  + (i+1) + " Consumiu R$" + alunos[i]);
		}
		System.out.println("O total de consumo foi de R$" + total);
		leitor.close();
	}
}
