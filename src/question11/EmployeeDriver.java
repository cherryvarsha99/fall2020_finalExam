/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Sai varsha Vellanki
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> ls = new ArrayList<Employee>();
        Employee e1 = new Employee(23456, "srija", 5000);
        Employee e2 = new Employee(10345, "Kumar", 8000);
        Employee e3 = new Employee(11345, "sita", 6500);
        Employee e4 = new Employee(22345, "priya", 7500);
        Employee e5 = new Employee(32345, "Akhil", 7700);
        ls.add(e1);

        ls.add(e2);
        ls.add(e3);
        ls.add(e4);
        ls.add(e5);

        System.out.println("****After adding to the list*****");
        printEmployees(ls);

        Collections.sort(ls);
        System.out.println("****After sorting in natural ordering****");
        printEmployees(ls);
        Collections.sort(ls, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getEmpSalary() == e2.getEmpSalary()) {
                    return 0;
                } else if (e1.getEmpSalary() > e2.getEmpSalary()) {
                    return 1;
                } else {
                    return -1;
                }

            }

        });

        System.out.println("****After overriding natural ordering by empSalary****");
        printEmployees(ls);

        Collections.sort(ls, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                 if (e1.getEmpName().compareTo(e2.getEmpName()) == 0) 
                   
                     return e1.getEmpName().compareTo(e2.getEmpName());
                 return e1.getEmpName().compareTo(e2.getEmpName());
               }

        });
        System.out.println("****After overriding natural ordering by  empName****");
        printEmployees(ls);
    }

    private static void printEmployees(ArrayList<Employee> eList) {
        for (Employee e : eList) {
            System.out.println(e);
        }

    }

}
