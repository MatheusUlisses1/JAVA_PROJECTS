import java.util.Scanner;
public class EX_01
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 0;
		System.out.println("Escreva uma palavra:");
		String palavra = input.nextLine();
		while (x < 5) {
		    System.out.println(palavra);
		    x++;
		}
	}
}