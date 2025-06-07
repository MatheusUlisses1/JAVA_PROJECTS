import java.util.Scanner;
public class Liga_Foguete
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = 0;
		System.out.println("Quantas partidas Alan e Beraldo jogaram?");
		int P = input.nextInt();
		int[] A = new int[P];
		int[] B = new int[P];
		System.out.println("Insira os resultados das partidas, Alan e Beraldo respectivamente: ");
		for (int i = 0; i < P; i++) {
		    A[i] = input.nextInt();
		    B[i] = input.nextInt();
		}
		System.out.println("Qual partidada dona Nena passou?");
		N = input.nextInt();
		int pontuacaoA = A[N - 1];
		int pontuacaoB = B[N - 1];
		if (pontuacaoA > pontuacaoB) {
		    System.out.println("Alan Ganhou");
		} else if (pontuacaoA < pontuacaoB) {
		    System.out.println("Beraldo Ganhou");
		} else {
		    System.out.println("Alan e Beraldo empataram");
		}
	}
}
