/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

import java.util.Scanner;

/**
 *
 * @author Sai Varsha vellanki
 */
public class RandomArrayInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creating array with index length 100
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array index: ");
        // displaying index of selected random number and catching exception for array length beyond 100
        try {
            int index = scan.nextInt();
            System.out.println("array[" + index + "] = " + array[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds.");
        }
    }

}
