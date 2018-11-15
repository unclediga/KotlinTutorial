package coursera.week2;
import coursera.week2.W2ExtentionsKt.*;
public class TestStatic {
    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println(foo(parent));
    }

    private static String foo(Parent parent) {
        return "parent";
    }
    private static String foo(Child child) {
        return "child";
    }
}
