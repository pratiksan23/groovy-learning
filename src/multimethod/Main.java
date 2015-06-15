package multimethod;

import java.math.BigDecimal;

/**
 * Created by Pratik on 6/13/2015.
 */
public class Main {

    public static void main(String[] args){
        giveRaise(new Employee());
        giveRaise(new Executive());
    }

    public static void giveRaise(Employee employee){
        employee.raise(new BigDecimal(100.00));
    }
}
