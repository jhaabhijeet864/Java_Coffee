package Stream;

import java.util.Arrays;
import java.util.List;

public class Test {
    // Create a list of strings and print the names which start with A.
    public static void main(String[] args) {
        // Added some names starting with "A" to test the filter
        List<String> l = Arrays.asList("suruchi", "ritu", "himasnhi", "Rohan", "Abhijeet", "Ayush");

        // Fixed the unbalanced parentheses: filter(s -> s.startsWith("A"))
        l.stream()
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);
    }
}