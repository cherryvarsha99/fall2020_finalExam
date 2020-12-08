/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

/**
 *
 * @author S540114
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Car c1 = new Car("BMW");
// this method will call car class start() not abstract class start()
        c1.start();
        //will call implemented method in car class
        c1.accelerate();
        
    }

}
