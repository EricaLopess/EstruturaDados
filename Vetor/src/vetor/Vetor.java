/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor;

import javax.swing.JOptionPane;

/**
 *
 * @author erica
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        int teste[]= new int[i];
        
        for (int x=0; x<= teste.length-1;x++)
        {
            teste[x]=x+1;
        }
                
        for (int x=0; x<= teste.length-1;x++)
        {
            System.out.print(teste[x]+", ");
        }
    }
    
}
