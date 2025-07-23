import java.util.Scanner;
public class EX_03
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de linhas: ");
		int n1 = input.nextInt();
		
		for (int i = 0; i < n1+1; i++) {
		    for (int j = 0; j < i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		for (int i = n1; i > 0; i--) {
		    for (int j = i; j > 0; j--) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
