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
public abstract class Vehicle {

    private String vName;

    /**
     *
     */
    public void start() {
        System.out.println("This vehicle starts");
    }

    /**
     *
     */
    public abstract void stop();
}
