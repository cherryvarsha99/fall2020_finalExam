/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author Sai varsha vellanki
 */
public class Employee implements Comparable<Employee> {

    private int empId;
    private String empName;
    private int empSalary;

    /**
     *
     * @param empId
     * @param empName
     * @param empSalary
     */
    public Employee(int empId, String empName, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    /**
     *
     * @return
     */
    public int getEmpId() {
        return empId;
    }

    /**
     *
     * @param empId
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /**
     *
     * @return
     */
    public String getEmpName() {
        return empName;
    }

    /**
     *
     * @param empName
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     *
     * @return
     */
    public int getEmpSalary() {
        return empSalary;
    }

    /**
     *
     * @param empSalary
     */
    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary;
    }

    @Override
    public int compareTo(Employee e) {
        return Integer.compare(empId, e.empId);
    }

}
