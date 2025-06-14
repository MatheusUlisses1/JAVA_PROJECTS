import java.util.Scanner;
public class EX_02
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matriz = {{1, 2, 3}, 
		                  {4, 5, 6},
		                  {7, 8, 9}};
		System.out.println(matriz[1][1]);
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 3; j++) {
		        System.out.print(matriz[i][j]);
		        System.out.print(" ");
		    }
		}
		System.out.println(" ");
		int[][] matriz1 = new int[3][3];
		matriz1[0][0] = 1;
		matriz1[0][1] = 2;
		matriz1[0][2] = 3;
		matriz1[1][0] = 4;
		matriz1[1][1] = 5;
		matriz1[1][2] = 6;
		matriz1[2][0] = 7;
		matriz1[2][1] = 8;
		matriz1[2][2] = 9;
		System.out.println(matriz1[1][1]);
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 3; j++) {
		        System.out.print(matriz1[i][j]);
		        System.out.print(" ");
		    }
		}
	}
}
