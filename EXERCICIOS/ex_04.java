import java.util.Scanner;
public class ex_04
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Par p = new Par();
		System.out.print("Insira o primeiro número: ");
		p.n1 = input.nextInt();
		System.out.print("Insira o segundo número: ");
		p.n2 = input.nextInt();
		System.out.println(p.Conta());
	}
}

class Par {
		int n1;
		int n2;
		 
		String Conta() {
		    int n3 = n1 + n2; 
		    if (n3 % 2 == 0) {
		        return n3 + " é par";
		    } else {
		        return n3 + " é ímpar";
		    }
		}
}
