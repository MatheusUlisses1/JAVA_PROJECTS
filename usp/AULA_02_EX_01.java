/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class AULA_02_EX_01

{
	public static void main(String[] args) {
		System.out.println("Bem-Vindo a lanchonete");
		System.out.println("Insira o seu saldo inicial:");
		Scanner din = new Scanner(System.in);
		double din1 = din.nextDouble();
		
		System.out.println("Faça seu pedido:");
		System.out.println("1. Quarteirão com queijo R$ 19.99");
		System.out.println("2. Royale com queijo R$ 20.99");
		System.out.println("3. Milkshake R$ 4.99");
		Scanner esc = new Scanner(System.in);
		String esc1 = esc.nextLine();
		double carrinho = 0;
		
		switch (esc1) {
		    case "1":
		    System.out.println("Quantas unidades do Quarteirão com queijo você gostaria de comprar?");
		    Scanner quanti1 = new Scanner(System.in);
		    int quanti01 = quanti1.nextInt();
		    System.out.println("Agradecemos pela sua compra!");
		    System.out.println("x" + quanti01 + " Quarteirão com queijo foi adicionado ao seu carrinho");
		    carrinho += 19.99 * quanti01;
		    break;
		    
		    case "2":
		    System.out.println("Quantas unidades do Royale com queijo você gostaria de comprar?");
		    Scanner quanti2 = new Scanner(System.in);
		    int quanti02 = quanti2.nextInt();
		    System.out.println("Agradecemos pela sua compra!");
		    System.out.println("x" + quanti02 + " Royale com queijo foi adicionado ao seu carrinho");
		    carrinho += 19.99 * quanti02;
		    break;
		    
		    case "3":
		    System.out.println("Quantas unidades do Milkshake você gostaria de comprar?");
		    Scanner quanti3 = new Scanner(System.in);
		    int quanti03 = quanti3.nextInt();
		    System.out.println("Agradecemos pela sua compra!");
		    System.out.println("x" + quanti03+ " Milkshake foi adicionado ao seu carrinho");
		    carrinho += 19.99 * quanti03;
		    break;
		}
		
		double resto = din1 -= carrinho;
		if (din1 > carrinho) {
		    System.out.println("Compra finalizada! Seu saldo restante é de R$" + resto);
		}
		else if (din1 < carrinho) {
		    System.out.println("Você não tem saldo o suficiente pra finalizar a compra");
		}
		 
		
	}
}
