package collections.sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SortingDemo {
    public static void main(String[] args) {
        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
        List<Integer> numbers = new LinkedList<>(List.of(12, 34, 9, 55, 44, 1, 7, 99, 2, 44)); //10 liczb
        System.out.println(numbers);
        sortingAlgorithm.bubbleSort(numbers);
        System.out.println(numbers);


        List<Integer> numbers2 = new LinkedList<>(List.of(64, 25, 12, 22, 11));
        System.out.println(numbers2);
        sortingAlgorithm.selectionSort(numbers2);
        System.out.println(numbers2);
    }
}
