package multimethod

/**
 * Created by Pratik on 6/13/2015.
 */

public class Executive extends Employee{

    @Override
    public void raise(Number number) {
        println "Executive got raise"
    }

    public void raise(BigDecimal number){
        println "Executive got bumper raise"
    }
}