/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

import java.io.IOException;

/**
 *
 * @author S540114
 */
public class VSVException extends Exception {

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
