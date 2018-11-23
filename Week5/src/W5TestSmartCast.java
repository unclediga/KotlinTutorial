import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class W5TestSmartCast {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        System.out.println(a);
        List l = new ArrayList() {
        };
        testFirst(Arrays.asList(1, 2, 3));
        testFirst(Arrays.asList("a", "b", "c"));

    }

    private static void testFirst(List list) {
        if (list.get(0) instanceof String) {
            String s = (String) list.get(0);
//            String s = list.get(0);   ERROR
            System.out.println("first is String for " + list);
        } else if (list.get(0) instanceof Integer) {
            Integer i = (Integer) list.get(0);
//            Integer i = ist.get(0); ERROR
            System.out.println("first is Int for " + list);
        }
    }
}
