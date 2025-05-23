import java.util.Scanner;

public class Barrinhas
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double DI;
		double DC;
		double P;
		double N;
		
		System.out.println("Quanto de dinheiro o Itu levou?");
		DI = input.nextDouble();
		System.out.println("Quando de dinheiro o Caio levou?");
		DC = input.nextDouble();
		System.out.println("Qual é o valor de uma barrinha de goiaba? ");
		P = input.nextDouble();
		System.out.println("Quantas barrinhas devem ser compradas?");
		N = input.nextDouble();
		double DIDC = DI+DC;
		double V = P*N;
		if (DIDC < V) {
		    double F = V-DIDC;
		    System.out.println("Larissa deverá enviar R$" + F + " reais para Itu e Caio");
		}
		else if (DIDC > V) {
		    System.out.println("Itu e Caio podem comprar as barrinhas sem Larissa");
		}
	}
}
