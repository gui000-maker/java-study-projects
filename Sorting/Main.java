package Sorting;

import java.util.Arrays;

public class Main {
    static void main() {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        Main.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (smallest > number) {
                smallest = number;
            }
        }
        return smallest;
    }

    private static int indexOfSmallest(int[] numbers) {
        int smallestIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[smallestIndex] > numbers[i]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[smallestIndex] > table[i]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int Index = 0; Index < array.length; Index++) {
            System.out.println(Arrays.toString(array));
            Main.swap(array, Index, Main.indexOfSmallestFrom(array, Index));
        }
    }
}
