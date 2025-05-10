/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class EX_05
{
	public static void main(String[] args) {
		double abacaxi = 8.5;
		double goiaba = 2.0;
		double laranja = 1.3;
		System.out.println("Insira o código do produto: 1. Abacaxi 2. Goiaba 3. Laranja");
		Scanner input = new Scanner(System.in);
		int codigo = input.nextInt();
		switch (codigo) {
		    case 1 :
		        System.out.println("O valor do abacaxi é $" + abacaxi + " reais");
		        break;
		    case 2 :
		        System.out.println("O valor da goiaba é $" + goiaba + " reais");
		        break;
		    case 3 :
		        System.out.println("O valor da laranja é $" + laranja + " reais");
		        break;
		    default :
		    System.out.println("Não reconhecido");
		}
	}
}
