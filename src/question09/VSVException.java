/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class VSVException extends RuntimeException {

    /**
     * Creates a new instance of <code>VSVException</code> without detail
     * message.
     */
    public VSVException() {
    }

    /**
     * Constructs an instance of <code>VSVException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public VSVException(String msg) {
        super(msg);
    }
}
