import java.util.Scanner;
public class Vypurr
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menorValor = 0;
		int maiorValor = 0;
		int media = 0;
		int MT = 0;
		System.out.println("Quantas partidas o Vypurr jogou?");
		int R = input.nextInt();
		int[] T = new int[R];
		System.out.println("Quais foram os tempos das partidas?");
		for (int i = 0; i < R; i++) {
		    T[i] = input.nextInt();
		}
		for (int i = 0; i < R; i++) {
		    menorValor = T[0];
		    if (T[i] < menorValor) {
		        menorValor = T[i];
		    }
		}
		for (int i = 0; i < R; i++) {
		    maiorValor = T[0];
		    if (T[i] > maiorValor) {
		        maiorValor = T[i];
		    }
		}
		
		for (int i = 0; i < R; i++) {
		    media += T[i];
		}
		for (int i = 0; i < R; i++) {
		    MT = media - (maiorValor + menorValor);
		}
		media = media / 5;
		MT = MT / (T.length - 2);
		System.out.println("A media truncada de Vypurr é: " + MT);
		
		System.out.println("A mediana de Vypurr é: " + media);
	}
}
