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
public abstract class GradauteAssistant implements Payable{
    private String name;
    private String ssn;

    /**
     *
     * @param name
     * @param ssn
     */
    public GradauteAssistant(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getSsn() {
        return ssn;
    }

    /**
     *
     * @param ssn
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

     
    @Override
    public String toString(){
        return  "Name of GA: "+getName()+"\n"+
                "SSN of GA: "+getSsn()+"\n"+
                "Monthly Pay: "+calcMonthlyPay()+"\n"+
                "Monthly Tax: "+ calcMonthlyTax()+"\n"+
                "Salary with Tax: "+salaryWithTax()+"\n"
                 ;
                
    }
}