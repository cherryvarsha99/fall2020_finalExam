/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

/**
 *
 * @author Sai Varsha Vellanki
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
     */
    public int add() {
        return numA + numB;
    }

    /**
     *
     * @return
     */
    public int sub() {
        return numA - numB;
    }

    /**
     *
     * @return
     * @throws question06.VSVException @throws BandiException
     */
    public int mul() throws VSVException{
        if (numA >= 0) {
            throw new VSVException("This is an example of RunTimeException");
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
