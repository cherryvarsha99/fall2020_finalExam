/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author Sai Varsha Vellanki
 */
public interface Payable {
    
    /**
     *
     */
    public static final double PAY = 750.00;

    /**
     *
     * @return
     */
    public abstract double calcMonthlyPay();

    /**
     *
     * @return
     */
    double calcMonthlyTax();

    /**
     *
     * @return
     */
    double salaryWithTax();
}
    
