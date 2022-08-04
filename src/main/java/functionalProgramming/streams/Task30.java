package functionalProgramming.streams;

import java.util.ArrayList;
import java.util.List;

public class Task30 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(73);
        numbers.add(4);
        numbers.add(34);
        numbers.add(98);
        numbers.add(16);
        numbers.add(83);
        numbers.add(26);
        numbers.add(2);
        numbers.add(17);
        numbers.add(64);

        System.out.println("Zad.1");
        numbers.forEach(number -> System.out.println(number));
        System.out.println();
        System.out.println("Zad.2");
        numbers.stream()
                .sorted( (number1,number2) -> number1 - number2)
                .forEach(number -> System.out.println(number));
        System.out.println();
        System.out.println("Zad.3");
        long countEvenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .count();
        System.out.println(countEvenNumbers);
        System.out.println();
        System.out.println("zad.4");
        numbers.stream()
                .filter(number -> number < 50)
                .toList()
                .forEach(number -> System.out.println(number));
        System.out.println();
        System.out.println("zad.5");
        int firstNumber = numbers.stream()
                .sorted( (number1,number2) -> number2 - number1)
                .findFirst().get();
        System.out.println(firstNumber);

    }
}



/*    Przygotuj ArrayList z 10 liczbami z przedziału 0-100.
        za pomocą metody forEach wyświetl wszystkie liczby
        za pomocą streama posortuj liczby i wyświetl posortowane
        za pomocą streama odfiltruj liczby nieparzyste i policz ile pozostało elementów funkcją kończącą count()
        za pomocą streama odfiltruj wszystkie liczby powyżej 50, pozostałe liczby zbierz do nowej listy
        za pomocą streama posortuj liczby malejąco a następnie pobierz pierwszą z nich metodą findFirst*/
