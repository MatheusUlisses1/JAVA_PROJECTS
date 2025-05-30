import java.util.Scanner;
public class Rayssa_Fiel
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = 0;
        int M = 0;
        int totalN = 0;
        int maiornota = 0;
        int menornota = 0;
		for (int i = 1; i <= 10; i++) {
		    N = input.nextInt();
		    if (maiornota < N) {
		        maiornota = N;
		    }
		    if (menornota > N) {
		        menornota = N;
		    }
		    totalN += N;
		    M = (totalN - maiornota - menornota) / 8;
        }
        if (M > 900) {
		        System.out.println("EEEE CAMPEÃAAAA!!");
		    } else {
		        System.out.println("Fica pra próxima Fiel…");
		    }
	}
}
