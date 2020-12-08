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
public class Multiply {

    private int numA;
    private int numB;

    /**
     *
     * @param numA
     * @param numB
     */
    public Multiply(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    /**
     *
     * @return
     */
    public int getNumA() {
        return numA;
    }

    /**
     *
     * @param numA
     */
    public void setNumA(int numA) {
        this.numA = numA;
    }

    /**
     *
     * @return
     */
    public int getNumB() {
        return numB;
    }

    /**
     *
     * @param numB
     */
    public void setNumB(int numB) {
        this.numB = numB;
    }

    @Override
    public String toString() {
        return "numA=" + numA + ", numB=" + numB;
    }

    /**
     *
     * @return
     * @throws NegativeNumberException
     */
    public int mul() throws NegativeNumberException {
        if (numA <= 0) {
            throw new VSVException("This is an example of Exception");
        }
        if (numB < 0) {
            throw new NegativeNumberException("We may not consider the result");
        }
        return numA * numB;
    }

    /**
     *
     * @return
     * @throws ArithmeticException
     */
    public int div() throws ArithmeticException {

        try {
            if (numB == 0) {
                // throw new ArithmeticException("Divisible by 0 is not possible");
            }
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }

        return numA / numB;
    }
}
