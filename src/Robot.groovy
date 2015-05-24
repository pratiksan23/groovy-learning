/**
 * Created by Pratik on 5/17/2015.
 */
public class Robot{
    def type, weight, fragile
    def access(Map location, int weight, boolean fragile){
        println "Received a fragile package ? $fragile, weight is $weight and location is $location"
    }
}