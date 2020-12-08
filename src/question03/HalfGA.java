/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author S540114
 */
public class HalfGA extends GradauteAssistant {

    /**
     *
     * @param name
     * @param ssn
     */
    public HalfGA(String name, String ssn) {
        super(name, ssn);
    }

    /**
     *
     * @return
     */
    @Override
    public double calcMonthlyPay() {
        return 0.5 * PAY;
    }

    /**
     *
     * @return
     */
    @Override
    public double calcMonthlyTax() {
        return 0.07 * calcMonthlyPay();
    }

    /**
     *
     * @return
     */
    @Override
    public double salaryWithTax() {
        return calcMonthlyPay() - calcMonthlyTax();
    }

}
