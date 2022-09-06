/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author erica
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static int fibonacci(int x)
    {
        
        if (x == 0)
        {
            x = 0;
        }
        else if (x == 1)
        {
            x = 1;
        }
        else 
        {
            x = (fibonacci(x -1)+fibonacci(x-2));
        }
        
        return x;
    }
    
    public static void main(String[] args) {
    
        for (int i=0; i<10; i++)        
            System.out.println(fibonacci(i));

        
        
    }
    
}
