package singleton;

/**
 * Created by tage on 7/11/16.
 */
public class Singleton2 {
    private static  Singleton2 singleton = null;

    private Singleton2() {

    }

    public synchronized Singleton2 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }

    public static void doSomething() {

    }
}
