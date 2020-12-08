/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08;

import question08.VSVException;

/**
 *
 * @author S540114
 */
public class Calculator {

    private int numA;
    private int numB;

    /**
     *
     * @param numA
     * @param numB
     */
    public Calculator(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    /**
     *
     * @return
     * @throws question08.NegativeNumberException @throws BandiException
     */
    public int mul() throws NegativeNumberException {
        if (numA <= 0) {
            throw new VSVException("This is an example of Exception");
        }
        if (numB <= 0) {
            throw new NegativeNumberException("We may not consider the result");
        }
        return numA * numB;
    }

    /**
     *
     * @return
     */
    public int div() {
        if (numB == 0) {
            throw new ArithmeticException("Divisible by 0 is not possible");
        }

        return numA / numB;
    }

}
