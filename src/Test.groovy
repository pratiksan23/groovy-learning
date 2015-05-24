import groovy.transform.Canonical

@Canonical(excludes = "isTrue")
public class Test{

    int var;
    String value;
    Boolean isTrue;
}
