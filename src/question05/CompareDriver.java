/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class CompareDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//creating objects to ComparableCircle
        ComparableCircle c1 = new ComparableCircle(16);
        ComparableCircle c2 = new ComparableCircle(13);

        // Displaying  comparableCircles
        System.out.println("ComparableCircle1:");
        System.out.println(c1);
        System.out.println("ComparableCircle2:");
        System.out.println(c2);

        // calculating area and comapring  larger of the two ComparableCircle objects
        System.out.println((c1.compareTo(c2) == 1
                ? "\nComparableCircle1 " : "\nComparableCircle2 ")
                + "is the larger of the two Circles");
    }

}
