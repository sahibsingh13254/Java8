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

        Predicate<String> endsWithLetterV = x -> x.toLowerCase().charAt(x.length()-1) == 'l';

         // AND
        Predicate<String> and  = checkLetterV.and(endsWithLetterV);
        System.out.println(and.test("vipul"));

        //OR
        Predicate<String> or  = checkLetterV.or(endsWithLetterV);
        System.out.println(or.test("bipin"));

        //Negate
        System.out.println(checkLetterV.negate().test("vipin"));


        // passing objects to predecate
        student sahib = new student(1 , "sahib");
        student daksh = new student(2 , "daksh");
        student anushk = new student(3, "anushk");

        Predicate<student> studentPredicate = x -> x.getId() > 1;
        System.out.println(studentPredicate.test(daksh));

    }
    private static class student{
        int id;

        public student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        String name;

        }
    }

