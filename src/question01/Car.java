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
public class Car extends Vehicle implements Movable, Drivable {

    private String brand;

    /**
     *
     * @param brand
     */
    public Car(String brand) {
        this.brand = brand;
    }

    /**
     *
     */
    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    @Override
    public void accelerate() {
        System.out.println("accelerate the car");
    }

    /**
     *
     */
    @Override
    public void decelerate() {
        System.out.println("decelerate the car");
    }

    /**
     *
     */
    @Override
    public void drive() {
        System.out.println("drive the car");
    }

    /**
     *
     */
    @Override
    public void noOfhoursDrive() {
        System.out.println("drive for 5 hrs");
    }

    /**
     *
     */
    @Override
    public void start() {

        System.out.println("This is car class ");
    }

}
