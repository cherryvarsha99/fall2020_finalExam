/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class RecursionExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       countdown(3);
    }
    
    /**
     *
     * @param n
     */
    public static void countdown(int n) {
    if (n == 0) {
        System.out.println("number cannot be zero!");
    } else {
        System.out.println(n);
        countdown(n - 1);
    }
}
    
}
