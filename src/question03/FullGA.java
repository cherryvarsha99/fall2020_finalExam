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
public class FullGA extends GradauteAssistant {

    private int serviceyears;

    /**
     *
     * @param serviceyears
     * @param name
     * @param ssn
     */
    public FullGA(int serviceyears, String name, String ssn) {
        super(name, ssn);
        this.serviceyears = serviceyears;
    }

    @Override
    public String toString() {
        return super.toString() + "serviceyears=" + serviceyears + "\n*********************";
    }

    /**
     *
     * @return
     */
    @Override
    public double calcMonthlyPay() {
        return PAY;
    }

    /**
     *
     * @return
     */
    @Override
    public double calcMonthlyTax() {
        return 0.1 * calcMonthlyPay();
    }

    /**
     *
     * @return
     */
    @Override
    public double salaryWithTax() {
        return PAY - calcMonthlyTax();
    }

}
