/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class estachovendo
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
		else {
		    System.out.println("Não sairei de casa");
		}
	}
}
