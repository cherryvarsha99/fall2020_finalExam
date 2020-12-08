/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class JavaExceptionHandling {

    /**
     * @param args the command line arguments
     * @throws question09.NegativeNumberException
     */
    public static void main(String[] args) throws VSVException, NegativeNumberException {

        // Scanner scan = new Scanner(new File("nofile.txt"));
        Multiply m = new Multiply(3,-3);
        System.out.println(m.mul());

        System.out.println(m.div());

    }
}
