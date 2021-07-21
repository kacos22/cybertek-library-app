package com.cybertek.library.utilities;

public class BrowserUtils {
    /*
    Method that will accept int
    Wait dor gievn second duration
     */
    //1sec = 1000 milli secs(Thread.sleep is in millie seconds)

    public static void sleep(int second) {
        second*=1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("Something happened in the sleep method");
        }

    }
}
