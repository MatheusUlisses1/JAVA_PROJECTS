import java.util.Scanner;
public class EX_01
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[3];
		System.out.print("Insira o primeiro numero: ");
		int N1 = input.nextInt();
		num[0] = N1;
		System.out.print("Insira o segundo numero: ");
		int N2 = input.nextInt();
		num[1] = N2;
		System.out.print("Insira o terceiro numero: ");
		int N3 = input.nextInt();
		num[2] = N3;
		int soma = num[0] + num[1] + num[2];
		System.out.println("A soma total é: " + soma);
	}
}