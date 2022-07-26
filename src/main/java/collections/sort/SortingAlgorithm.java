package collections.sort;

import java.util.List;

public class SortingAlgorithm {

    public void bubbleSort(List<Integer> numbers){
        System.out.println("Sortujemy!");
        for (int j = 0; j < numbers.size(); j++) {
            for (int i = 0; i < numbers.size() - 1 - j; i++) {
                int first = numbers.get(i);
                int second = numbers.get(i+1);
                if(first > second){
                    numbers.set(i, second);
                    numbers.set(i+1, first);
                }
            }
        }
    }

    public void selectionSort(List<Integer> numbers){
        System.out.println("Sortujemy selection sort!");


        int index = 0;


        for(int j = 0; j < numbers.size(); j++){
            int min = numbers.get(j);

            for (int i = j; i < numbers.size() ; i++){
                int number = numbers.get(i);
                if(number <= min){
                    min = number;
                    index = i;

                }
            }

            int temp = numbers.get(j);
            numbers.set(j, min);
            numbers.set(index, temp);

        }



    }
}
