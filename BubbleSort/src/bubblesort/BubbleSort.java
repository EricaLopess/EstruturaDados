
package bubblesort;

public class BubbleSort {
  public static void main(String args[]) {
    int[] v = {21,5,13,17,22,0,4};
    
     for(int num : v) {
      System.out.print(num + " ");
    }
     System.out.println(" ");
     
     
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
              if(v[j] > v[j + 1]) {
            
          int aux = v[j];
          v[j] = v[j + 1];
          v[j + 1] = aux;

            }
        }
      }
    }
  }

