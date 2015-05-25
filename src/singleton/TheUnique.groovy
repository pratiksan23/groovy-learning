package singleton

/**
 * Created by Pratik on 5/25/2015.
 */

@Singleton(lazy = true, strict = false)
class TheUnique {
    private TheUnique(){
        println "Instace created"
    }

    def hello(){
        println "Say hello"
    }
}
