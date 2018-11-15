package coursera.week2;
import static coursera.week2.StringUtilsKt.lastChar;
import static coursera.week2.StringUtilsKt.repeat;

public class JavaUsage {
    public static void main(String[] args) {
        String t = "TestSTRING";
        System.out.println("from java: lastChar(\""+t+"\")="+lastChar(t));
        System.out.println("from java: repeat(\""+t+"\",3)="+repeat(t,3));
    }
}
