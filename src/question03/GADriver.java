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
public class GADriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        
        GradauteAssistant ga = new FullGA(2, "John", "1243");
        //System.out.println(ga);

        Payable p1 = new HalfGA("Wes", "7543");
        Payable p2 = new FullGA(3, "zessica", "1234");

        //p1=p2;
        //System.out.println(p1);
       // assigning half ga instance to fullga instance 
        p2 = p1;
        System.out.println(p2);
//assigning fullga ga instance to halfga instance 
        p1 = ga;
// typecasting halfga instance to fullga and without assigning in p1=ga statement we will get wrror
        FullGA ga2 = (FullGA) p1;
        System.out.println(ga2);

        //primitive data type Casting
        double a = 13.5;
        double b = 6.6;
        // typecasting double to in
        System.out.println("divide a/b :" + (int) (a * (a / b)));

    }

}
