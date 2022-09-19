
package bubblesort;

import javax.swing.JOptionPane;

public class BubbleSort {
  public static void main(String args[]) {
      int tamanho;
      tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
      
     int[] v = new int[tamanho];
    
    for (int x=0; x < v.length; x++)
        v[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
    
    
     for(int num : v) {
      System.out.print(num + " ");
    }
     System.out.println("");
     
     
    BubbleSort bs = new BubbleSort();
    bs.ordenar(v);
    
    for(int num : v) {
      System.out.print(num + " ");
   }
  }
  
  public void ordenar(int[] v) {
    for(int i = 0; i < v.length - 1; i++) {
      //  System.out.println("i = " + i);
      for(int j = 0; j < v.length - 1 - i ; j++) {
              if(v[j] < v[j + 1]) {
            
          int aux = v[j];
          v[j] = v[j + 1];
          v[j + 1] = aux;

            }
        }
      }
    }
  }

