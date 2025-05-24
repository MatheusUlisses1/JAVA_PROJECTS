import java.util.Scanner;
public class EX_05
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String senha = "Matheus";
		System.out.println("Digite a senha correta:");
		String tent = input.nextLine();
		while (!tent.equals(senha)) {
		    System.out.println("Senha incorreta, Tente novamente");
		    tent = input.nextLine();
		}
		System.out.println("Você acertou a senha!");
	}
}
