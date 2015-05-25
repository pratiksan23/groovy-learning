package Lazy

/**
 * Created by Pratik on 5/24/2015.
 */
class AsNeeded {
    def value
    @Lazy Heavy heavy1 = new Heavy();
    @Lazy Heavy heavy2 = {new Heavy(size: 1000)}();

    AsNeeded(){ println "Created As Needed"}
}
