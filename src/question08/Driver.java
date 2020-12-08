/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import question06.VSVException;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class Driver {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     * @throws question06.VSVException
     */
    public static void main(String[] args) throws IOException,FileNotFoundException, VSVException {
        // TODO code application logic here
        try {
         Scanner sc = new Scanner(new File("nofile.txt"));
        }
        catch(IOException ie) {
            System.out.println(ie.getMessage());
        }
        
         Calculator calc = new Calculator(-5, 0);
       
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
        } catch (NegativeNumberException ve)  {
            System.out.println(ve.getMessage());
        }
            
        }
    }
    

