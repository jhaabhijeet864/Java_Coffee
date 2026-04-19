package Stream;

import java.util.Arrays;
import java.util.List;


public class Test_2 {

    // Create a list of strings and convert all names in uppercase
    public static void main(String[] args) {
        List<String> l = Arrays.asList("suruchi", "ritu", "himasnhi", "Rohan");

        l.stream().map(String::toUpperCase).filter(s->s.length()<=5).forEach(System.out::println);
    }
}

// .min , .max , .sum