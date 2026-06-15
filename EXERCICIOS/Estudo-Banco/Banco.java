import java.util.Scanner;
public class Banco
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SysBanco b = new SysBanco();
		System.out.println("\033[34m---Banco Hydrux---");
		while (true) {
		    b.Intro();
		    int esc = input.nextInt();
		    switch (esc) {
		        case 1 :
		            System.out.print("Digite a quantia que deseja depositar: ");
		            b.vdepositado = input.nextInt();
		            System.out.println(b.Depositar());
		            break;
		        case 2 :
		            System.out.println("Digite a quatia que deseja sacar: ");
		            b.vsacado = input.nextInt();
		            System.out.println(b.Sacar());
		            break;
		        case 3 :
		            System.out.println("O seu saldo atual é de R$" + b.Consulta());
		            break;
		    }
		}
	}
}
