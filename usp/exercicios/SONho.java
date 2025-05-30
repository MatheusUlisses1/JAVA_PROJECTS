import java.util.Scanner;
public class SONho
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P = 0;
        int X = 0;
        int titulo = -1;
        System.out.print("Insira o numero de partidas: ");
        P = input.nextInt();
		for (int i = 1; i <= P; i++) {
		    int GS = input.nextInt();
		    int GA = input.nextInt();
		    if (GS > GA) {
		        X++;
		    }
		    if (X == 5 && titulo == -1) {
		        titulo = i;
		    }
		}
		System.out.println(titulo);
	}
}

