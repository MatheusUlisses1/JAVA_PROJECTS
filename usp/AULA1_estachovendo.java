import java.util.Scanner;
public class AULA1_estachovendo
{
	public static void main(String[] args) {
		System.out.println("Está chovendo?");
		Scanner n1 = new Scanner(System.in);
		String caso1 = n1.nextLine();
		String resp1 = caso1.toUpperCase();
		
		System.out.println("Esta relampejando?");
		Scanner n2 = new Scanner(System.in);
		String caso2 = n2.nextLine();
		String resp2 = caso2.toUpperCase();
		if (resp1.equals("NÃO") && resp2.equals("NÃO")) {
		    System.out.println("Sairei de casa");
		}
		else if (resp1.equals("NÃO") && resp2.equals("SIM")) {
		    System.out.println("Como está relampejando se não está chovendo?");
		}
		else {
		    System.out.println("Não sairei de casa");
		}
	}
}
