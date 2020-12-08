/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author Sai Varsha vellanki
 */
public class Circle {

    private double radius;

    /**
     *
     * @param radius
     */
    public Circle(double radius) {

        this.radius = radius;
    }

    /**
     * Return radius
     * @return 
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set a new radius
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return
     */
    public double getArea() {
        String result= String.format("%.2f", radius * radius * Math.PI);
        
        return Double.parseDouble(result);
    }

    @Override
    public String toString() {
        return "radius=" + radius;
    }

}
