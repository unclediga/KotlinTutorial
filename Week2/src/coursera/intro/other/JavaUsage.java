package coursera.intro.other;

import coursera.intro.Utils;
import coursera.intro.Extentions2Kt;

import java.io.IOException;

public class JavaUsage {
    public static void main(String[] args) {

        System.out.println("foo=" + Utils.foo());
        System.out.println("foo=" + Extentions2Kt.foo2());

        System.out.println("boo => " + Utils.boo(2));
        Utils.bee();
        Extentions2Kt.bee2();


        try {
            Utils.test1();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Extentions2Kt.test2();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
