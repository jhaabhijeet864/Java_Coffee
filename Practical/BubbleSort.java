package Practical;

import java.util.*;
class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
        System.out.print("Unsorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("\nSorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
