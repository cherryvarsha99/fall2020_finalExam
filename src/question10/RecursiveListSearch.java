/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class RecursiveListSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> elements = new ArrayList<>();
//adding elements
        elements.add(4);
        elements.add(14);
        elements.add(6);
        elements.add(7);
        elements.add(9);
        elements.add(10);
        //displaying elements
        System.out.println("list of elements:");
        for (Integer list : elements) {
            System.out.println(list);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to find");
        int n = sc.nextInt();
        sc.close();
        ListClass ls = new ListClass(elements);
        //invoking element search method to display index of selected element
        System.out.println("the element is found at index:" + ls.searchElemnt(n));

    }

}
