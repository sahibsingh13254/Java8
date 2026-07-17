package predicate;

import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {
        Predicate<Integer> checkGreaterThan = x -> x > 100;
        System.out.println(checkGreaterThan.test(10));
        System.out.println(checkGreaterThan.test(900));
    }
}
