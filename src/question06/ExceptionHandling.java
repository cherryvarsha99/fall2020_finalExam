/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws IOException, FileNotFoundException {
        // TODO code application logic here
        try {
            Scanner sc = new Scanner(new File("nofile.txt"));
        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        }

        Calculator calc = new Calculator(-5, 0);
        System.out.println("Add: " + calc.add());
        System.out.println("Sub: " + calc.sub());
        // try-catch for exception
        try {
            System.out.println("Div: " + calc.div());
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
//          catch (NegativeNumberException ex) {
//            System.out.println(ex.getMessage());
//        }
        System.out.println("I am done!");
        try {
            System.out.println("Mul: " + calc.mul());
        } catch (VSVException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
