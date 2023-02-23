package utilities;

import org.junit.Test;

public class ReusableMethods {


    public static void bekle(int seconds){

        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {

        }

    }

}
