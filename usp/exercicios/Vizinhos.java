import java.util.Scanner;
public class Vizinhos
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantas casas existem na rua?");
		int N = input.nextInt();
		int[] H = new int[N];
		int[] V = new int[N];
		System.out.println("Quantos habitantes tem em cada casa?");
		for (int i = 0; i < N; i++) {
		    H[i] = input.nextInt();
		}
		for (int i = 0; i < N; i++) {
		    int vizinhos = 0;
		    if (i > 0) {
		        vizinhos += H[i - 1];
		    }
		    if (i < N - 1) {
		        vizinhos += H[i + 1];
		    }
		    V[i] = vizinhos;
		}
		for (int i = 0; i < N; i++) {
            System.out.print(V[i]);
            if (i < N - 1) {
                System.out.print(" ");
            }
        }
	}
}
