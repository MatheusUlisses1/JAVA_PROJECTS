
import java.util.Scanner;

public class ex_02{
    public static void main(String[] args) {
        System.out.println("Escreva uma sentença:");
        Scanner sent = new Scanner(System.in);
        String sent1 = sent.nextLine();
        String[] sent2 = sent1.split(" ");
        String resultado = "";
        for (String sent3 : sent2) {
            String ls = sent3.substring(0,1).toUpperCase();
            String sent4 = ls + sent3.substring(1);
            resultado += sent4 + " ";
        }
        System.out.println("Essa é a forma que Jaden Smith escreveria: " + resultado.trim());
        
    }
}