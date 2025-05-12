import java.util.Scanner;
public class AULA1_EX_03v2
{
	public static void main(String[] args) {
		System.out.println("Insira dois nomes:");
		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		String nome1 = n1.nextLine();
		String nome2 = n2.nextLine();
		String nc1 = nome1.toUpperCase();
		String nc2 = nome2.toUpperCase();
		if (nc1.equals(nc2)) {
		    System.out.println("Os nomes " + nc1 + " e " + nc2 + " são iguais");
		}
		else if (nome1 != nome2) {
		    System.out.println("Os nomes " + nc1 + " e " + nc2 + " são diferentes");
		}
	}
}
