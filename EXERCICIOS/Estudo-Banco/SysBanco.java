public class SysBanco {
		int vatual;
		int vdepositado;
		int vsacado;
		int n100 = 0;
    	int n50 = 0;
    	int n20 = 0;
    	int n10 = 0;
    	int n5 = 0;
    	int n2 = 0;
    	
    	String vnotastxt = "";
    	
		void Intro() {
		    System.out.println("\033[0mEscolha uma opção:");
		    System.out.println("\033[32m1. Depositar");
		    System.out.println("\033[31m2. Sacar");
		    System.out.println("\033[33m3. Consultar Saldo\u001B[0m");
		}
		
		String Depositar() {
		    if (vdepositado < 0) {
		        return "\033[31mERRO!\u001B[0m Valor depositado não pode ser negativo!";
		    } else {
		        return "Depósito realizado! Você depositou R$" + (vatual += vdepositado) + " em sua conta";
		    }
		}
		
		
		String Sacar() {
		    if (vatual - vsacado < 0) {
		        return "\033[31mERRO!\u001B[0m Valor sacado excede limites da conta!";
		    }
		    else {
		        Notas();
		        String txtsacar = "Saque realizado! Você recebeu\n";
		        txtsacar += vnotastxt;
		        txtsacar += "Seu saldo atual é de R$" + (vatual -= vsacado);
		        return txtsacar;
		    } 
		}
		int Consulta() {
		    return vatual;
		}
		
		void Notas() {
		    int vnota = vsacado;
		    n100 = n50 = n20 = n10 = n5 = n2 = 0;
		    vnotastxt = "";
    		while (vnota > 0) {
    		    if (vnota >= 100) {
    		        n100 += 1;
    		        vnota -= 100;
    		    } else if (vnota >= 50) {
    		        n50 += 1;
    		        vnota -= 50;
    		    } else if (vnota >= 20) {
    		        n20 += 1;
    		        vnota -= 20;
    		    } else if (vnota >= 10) {
    		        n10 += 1;
    		        vnota -= 10;
    		    } else if (vnota >= 5) {
    		        n5 += 1;
    		        vnota -= 5;
    		    } else if (vnota >= 2) {
    		        n2 += 1;
    		        vnota -= 2;
    		    }
    		}
    		 if (n100 > 0) vnotastxt += n100 + " nota(s) de 100\n";
             if (n50 > 0)  vnotastxt += n50 + " nota(s) de 50\n";
             if (n20 > 0)  vnotastxt += n20 + " nota(s) de 20\n";
             if (n10 > 0)  vnotastxt += n10 + " nota(s) de 10\n";
             if (n5 > 0)   vnotastxt += n5 + " nota(s) de 5\n";
             if (n2 > 0)   vnotastxt += n2 + " nota(s) de 2\n";
        }
		    
}
    		
