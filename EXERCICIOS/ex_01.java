import java.util.Scanner;

public class ex_01 {

    public static void main(String[] args) {
        System.out.println("Banco Gaymes:");
        System.out.println("Insira o seu saldo inicial:");
        Scanner saldoi = new Scanner(System.in);
        int input1 = saldoi.nextInt();
        while (true) {
            System.out.println("Escolha o que deseja fazer: 1. Consultar Saldo 2. Depositar 3. Sacar ");
            Scanner opcao = new Scanner(System.in);
            String opcao1 = opcao.nextLine();
            if (opcao1.equals("1")) {
            System.out.println("O seu saldo atual é de: R$" + input1 + " reais");
            }
            else if (opcao1.equals("2")) {
            System.out.println("Quanto você deseja depositar?");
            Scanner saldom = new Scanner(System.in);
            int saldom1 = saldom.nextInt();
            input1 += saldom1;
            System.out.println("Pronto! Seu novo saldo é de: R$" + input1);
            } 
            else if (opcao1.equals("3")) {
                System.out.println("Quanto você deseja sacar?");
                Scanner saldon = new Scanner(System.in);
                int saldon1 = saldon.nextInt();
                input1 -= saldon1;
                System.out.println("Pronto! Seu novo saldo é de: R$" + input1);
                } 
        }
        
            
    }
}