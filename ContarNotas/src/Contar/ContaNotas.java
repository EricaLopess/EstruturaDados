package Contar;

import java.util.Scanner;


public class ContaNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int valor, n100, n50, n25, n10, n5, n2, n1;
       
       Scanner sc = new Scanner(System.in);
       System.out.print("Valor = ");
       valor = sc.nextInt();
            
       System.out.println("Valor = " + valor);

       n100 = valor/100;
       valor = valor - (n100*100);
       
       n50 = valor/50;
       valor = valor - (n50*50);

       n25 = valor/25;
       valor = valor - (n25*25);
       
       n10 = valor/10;
       valor = valor - (n10*10);

       n5 = valor/5;
       valor = valor - (n5*5);

       n2 = valor/2;
       valor = valor - (n2*2);
       
       n1 = valor/1;
       valor = valor - (n1*1);
              
       System.out.println("100 = " + n100);
       System.out.println("50  = " + n50);                
       System.out.println("25  = " + n25);
       System.out.println("10  = " + n10);                 
       System.out.println("5   = " + n5);
       System.out.println("2   = " + n2);
       System.out.println("1   = " + n1);
      
    }
    
}
