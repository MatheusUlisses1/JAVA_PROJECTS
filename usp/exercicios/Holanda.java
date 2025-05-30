import java.util.Scanner;
public class Holanda
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int I;
        double S;
        double melhorproposta = -1;
        int propostavencedora = 0;
		for (int i = 1; i <= 4; i++) {
		    System.out.print("Proposta " + i + " (Interesse e Salário separados por espaço): ");
            I = input.nextInt();
            S = input.nextDouble()
		    double atualproposta = I * S;
		    if (atualproposta > melhorproposta) {
		        melhorproposta = atualproposta;
		        propostavencedora = i;
		    }
		}
		System.out.println(propostavencedora);
	}
}
