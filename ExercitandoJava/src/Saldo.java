
import java.util.Scanner;
public class Saldo {
	public static void main(String[] args) {
		/* Informar um saldo e realizar reajuste */
			double saldo;
				
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite o saldo da sua conta");
			saldo = scanner.nextDouble();
			saldo = (saldo * 0.01) + saldo;
			
			System.out.println("O saldo com ajuste de 1% é " + Math.round(saldo));
			
	}
}
