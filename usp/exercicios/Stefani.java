import java.util.Scanner;
public class Stefani
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos albúns Stefani possui?");
        int N = input.nextInt();
        int Am;
        int Eu;
        int As;
        int Af;
        int Oc;
        int S = 0;
		for (int i = 1; i <= N; i++) {
		    System.out.print("Quantos ouvintes o " + i + "º tem em cada um dos 5 continentes?(Continentes separados por espaço): ");
		    Am = input.nextInt();
		    Eu = input.nextInt();
		    As = input.nextInt();
		    Af = input.nextInt();
		    Oc = input.nextInt();
		    int Ouvintes = Am + Eu + As + Af + Oc;
		    if (Ouvintes >= 100000) {
		        S++;
		    }
        }
        System.out.println(S + " Albúns hitaram (>100.000 ouvintes)");
	}
}
