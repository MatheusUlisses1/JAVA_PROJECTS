import java.util.Scanner;

public class Calculadora_Tae
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double N;
		double M;
		double OM;
		int ESC;
		double R;
		
		System.out.println("Insira o primeiro número");
		N = input.nextDouble();
		System.out.println("Insira o segundo número");
		M = input.nextDouble();
		System.out.println("Escolha a operação: 1. Adição 2. Subtração 3. Multiplicação 4. Divisão");
		ESC = input.nextInt();
		switch (ESC) {
		    case 1:
		        R = N+M;
		        System.out.println("O resultado de " + N + " + " + M + " é " + R);
		        break;
		    case 2:
		        R = N-M;
		        System.out.println("O resultado de " + N + " - " + M + " é " + R);
		        break;
		    case 3:
		        R = N*M;
		        System.out.println("O resultado de " + N + " * " + M + " é " + R);
		        break;
		    case 4:
		        R = N/M;
		        System.out.println("O resultado de " + N + " / " + M + " é " + R);
		        break;
		}
	}
}
