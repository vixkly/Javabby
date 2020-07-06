import java.util.Scanner;

public class ExercitandoBasico {
	/* Leitura de vida em dias */
	
	public static void main(String[] args) {
		int diaNascimento, mesNascimento, anoNascimento;
		int anoAtual, ano;
		int resultado;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o dia do seu nascimento");
		diaNascimento = leitor.nextInt();
		
		System.out.println("Digite o mês do seu nascimento");
		mesNascimento = leitor.nextInt();
		
		System.out.println("Digite o ano do seu nascimento");
		anoNascimento = leitor.nextInt();
		
		anoAtual = 2020;
		
		ano = anoAtual - anoNascimento; 
		
		resultado = ((ano * 365)+(mesNascimento * 30) + (diaNascimento));
		System.out.println("Você está vivo por " + resultado + " continue assim.");
	}

}
