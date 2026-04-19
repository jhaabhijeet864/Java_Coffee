package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Stream_Intro {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> sq = list.stream()
                .map(i -> i + 1)
                .map(i -> i + 2)
                .collect(Collectors.toList());

        System.out.println("Original: " + list);
        System.out.println("Mapped: " + sq);

        // Added filter method: filters out odd numbers, keeping only evens
        List<Integer> filtered = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Filtered (Evens): " + filtered);

        // Here comes, method reference .
        // For each method.
        System.out.println("Printing each element using forEach and a method reference:");
        list.stream().forEach(System.out::println);
    }
}

