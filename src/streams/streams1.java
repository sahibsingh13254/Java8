package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apples", "banana", "orange");
        Stream<String> stream = fruits.stream();
        // this is how to convert List to stream

        String[] array = {"Apples", "banana", "orange"};
        Stream<String> stream1 = Arrays.stream(array);
        // array -> stream


        Stream<Integer>  limit = Stream.iterate(0, n -> n+1).limit(100);
    }
}
