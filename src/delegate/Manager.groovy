package delegate


/**
 * Created by Pratik on 5/24/2015.
 */
class Manager {

    @Delegate Expert expert = new  Expert()
    @Delegate Workers worker= new Workers()
}
