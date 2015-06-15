package multimethod

/**
 * Created by Pratik on 6/13/2015.
 */

def giveRaise(Employee employee){
    employee.raise(new BigDecimal(1000.000))
}

giveRaise new Employee()
giveRaise new Executive()