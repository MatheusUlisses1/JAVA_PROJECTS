import java.util.Scanner;
public class EX_01
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valor[] = new int[10];
		int N = 0;
		int maiorvalor = 0;
		int menorvalor = 99999;
		for (int i = 0; i < 10; i++) {
		    N = input.nextInt();
		    valor[i] = N;
		    if (N > maiorvalor) {
		        maiorvalor = N;
		    } else if (N < menorvalor) {
		        menorvalor = N;
		    }
		}
		System.out.println("O maior valor é: " + maiorvalor);
		System.out.println("O menor valor é: " + menorvalor);
	}
}
