import java.util.Scanner;

public class Espaco_Festa
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double L;
		double C;
		int N;
		
		System.out.println("Qual é o comprimento do espaço da festa?");
		L = input.nextDouble();
		System.out.println("Qual é a largura do espaço da festa?");
		C = input.nextDouble();
		System.out.println("Quantas pessoas vão pra festa?");
		N = input.nextInt();
		double A = L*C;
		int N2 = N*2;
		if (A >= N2) {
		    System.out.println("“JÁ É INTEEEEEEEEER”");
		}
		else if (A <= N2) {
		    System.out.println("Santa Rita realmente ficou pequena...");
		}
	}
}
