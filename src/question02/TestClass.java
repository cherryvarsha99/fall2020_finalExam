/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// creating 5 objects 
        GeometricObject[] geo = new GeometricObject[5];
        geo[0] = new Square(1);
        geo[1] = new Square(2);
        geo[2] = new Square(3);
        geo[3] = new Square(4);
        geo[4] = new Square(5);
// calling area() for all the objects in array list
        for (int i = 0; i < geo.length; i++) {
            System.out.printf("\n%d Geometricobject \n", i);
            System.out.printf("Area : %f\n", geo[i].getArea());
            if (geo[i] instanceof Colorable) {
                Colorable c = (Colorable) geo[i];
                c.howToColor();
            }
        }
    }

}
