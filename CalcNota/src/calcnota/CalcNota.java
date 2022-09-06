package calcnota;

import java.util.Scanner;

/**
 *
 * @author erica
 */
public class CalcNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota: ");
        nota = sc.nextInt();
        
        if(nota>=70 && nota <= 100)
        {
            System.out.println("APROVADO");
        }
        else if(nota>100)
        {
           System.out.println("ERRO! NOTA INVÁLIDA.");
        }
        else
            System.out.println("REPROVADO");
        
    }
    
}
