package predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {
        Predicate<Integer> checkGreaterThan = x -> x > 100;
        System.out.println(checkGreaterThan.test(10));
        System.out.println(checkGreaterThan.test(900));



        // other example can be

        Predicate<Integer> checkEven = x -> x % 2 ==0;
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        for (Integer i : numbers)
        {
            if (checkEven.test(i)){
                System.out.println(i);
            }
        }


        // other example of string can be
        Predicate<String> checkLetterV = x -> x.toLowerCase().charAt(0) == 'v';
        System.out.println(checkLetterV.test("Vision"));
    }
}
