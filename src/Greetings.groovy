
class Greetings{
    private def miles = 0
    final year

    Greetings(year){
        this.year = year
    }

    private void setMiles(miles) {
        throw new IllegalAccessException("Not allowed to change the miles of the car")
    }

    def getMiles(){
        println "getMiles called"
        miles
    }

    def drive(dist){
        if(dist > 0){
            miles += dist
        }
    }
}
