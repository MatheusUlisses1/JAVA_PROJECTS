import java.util.Scanner;
public class EX_03
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira o tamanho do array: ");
		int N = input.nextInt();
		int[] num = new int[N];
		for (int i = 0; i < N; i++) {
		    int cont = i + 1;
		    System.out.print("Insira o numera na " + cont + "º posição: ");
		    int num1 = input.nextInt();
		    num[i] = num1;
		}
		for (int j : num ) {
		    System.out.print(j + " ");
		}
	}
}
