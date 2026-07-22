package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,8,9,9,20,435,43,435,65,36,5,6,5,7456,7,45,7,45,7,547,45,7,54,754,7,45,7,457,54,7,4,4,8,7,8,7,23,4,4,23,423,3,42,23,4,32,25,3,32,521,5435,1,431,4327,47,56,5,76,557,65,6,5,6475,45,54,56,6543,5,545,543);
        List<Integer> integerStream = list.stream().filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(integerStream);


        List<Integer> mapped = integerStream.stream().map(x -> x / 2)
                .distinct() // for unique
                .sorted()  // for ascending
                .sorted((a,b) -> (b -a)) // for descending
                .limit(5)
                .collect(Collectors.toList());   // to get back a list

        System.out.println(mapped);

    }
}
