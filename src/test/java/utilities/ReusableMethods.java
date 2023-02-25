package utilities;

public class ReusableMethods {


    public static void waitForIt(int seconds){

        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {

        }

    }

}
