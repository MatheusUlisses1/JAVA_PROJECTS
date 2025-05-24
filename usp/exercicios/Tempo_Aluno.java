import java.util.Scanner;

public class Tempo_Aluno
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int T1;
		int T2;
		int T3;
		int T4;
		int T5;
		int TV3;
		int mais;
		System.out.println("Quanto tempo o primeiro aluno chegou?");
		T1 = input.nextInt();
		System.out.println("Quanto tempo o segundo aluno chegou?");
		T2 = input.nextInt();
		System.out.println("Quanto tempo o terceiro aluno chegou?");
		T3 = input.nextInt();
		System.out.println("Quanto tempo o quarto aluno chegou?");
		T4 = input.nextInt();
		System.out.println("Quanto tempo o quinto aluno chegou?");
		T5 = input.nextInt();
		
		if (T3 % 2 == 0) {
		    TV3 = T3 / 2;
		} else {
		    TV3 = T3 * 2;
		}
		
		int TV1 = T1 * 5;
		int TV2 = T2 * T2;
		int TV4 = TV3 * 3;
		int TV5 = T5-T1*2;
		mais = TV1;
		
		if (mais < TV2) {
		    mais = TV2;
		} 
		if (mais < TV3) {
		    mais = TV3;
		} 
		if (mais < TV4) {
		    mais = TV4;
		} 
		if (mais < TV5) {
		    mais = TV5;
		}
		System.out.println(mais);
	}
}
