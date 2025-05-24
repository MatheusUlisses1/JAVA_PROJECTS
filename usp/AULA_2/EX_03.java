import java.util.Scanner;
public class EX_03
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Escreva um número: ");
		int N = input.nextInt();
		for (int i = 0; i <= 10; i++) {
		    System.out.println(N + " * " + i + " = " + N * i);
		}
	}
}