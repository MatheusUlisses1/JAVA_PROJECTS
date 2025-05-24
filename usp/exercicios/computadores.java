import java.util.Scanner;
public class computadores
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int C1, C2, C3, C4, A1, A2, A3, A4;
		System.out.println("Quantos computadores tem no laboratório 1?");
		C1 = input.nextInt();
		System.out.println("Quantos computadores tem no laboratório 2?");
		C2 = input.nextInt();
		System.out.println("Quantos computadores tem no laboratório 3?");
		C3 = input.nextInt();
		System.out.println("Quantos computadores tem no laboratório 4?");
		C4 = input.nextInt();
		System.out.println("Quantos alunos tem no laboratório 1?");
		A1 = input.nextInt();
		System.out.println("Quantos alunos tem no laboratório 2?");
		A2 = input.nextInt();
		System.out.println("Quantos alunos tem no laboratório 3?");
		A3 = input.nextInt();
		System.out.println("Quantos alunos tem no laboratório 4?");
		A4 = input.nextInt();
		
		int TC = C1+C2+C3+C4;
		int TA = A1+A2+A3+A4;
		
		if (A1 > 40) {
		    System.out.println("Fica pra próxima...");
		} else if (A2 % 2 != 0) {
		    System.out.println("Fica pra próxima...");
		} else if (A3 > C3 / 2) {
		    System.out.println("Fica pra próxima...");
		} else if (A4 % 10 != 7) {
		    System.out.println("Fica pra próxima...");
		} else if (TA > TC) {
		    System.out.println("Fica pra próxima...");
		} else {
		    System.out.println("HABEMUS AULA!!");
		}
	}
}