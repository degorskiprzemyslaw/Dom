package functionalProgramming.task28;

import java.util.Comparator;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Task28 {
    public static void main(String[] args) {
        Function<String, Integer> getLength = text -> text.length();
        System.out.println(getLength.apply("Dlugosc tekstu"));

        Predicate<String> hasFiveChars = text -> text.length() >= 5;
        System.out.println(hasFiveChars.test("ds"));


        Supplier <Integer> randomWithinOneTen = () -> new Random().nextInt(10) + 1;
        System.out.println(randomWithinOneTen.get());

        Function<String, String> printWithCapitalLetters = text -> text.toUpperCase();
        System.out.println(printWithCapitalLetters.apply("Zwieksz proszę ten tekst"));

        Comparator<String> areSameLength = (text1, text2) -> text1.length() - text2.length();
        String text1 = "asd";
        String text2 = "asdsa";
        if(areSameLength.compare(text1, text2) == 0){
            System.out.println("są równe");
        }else if(areSameLength.compare(text1, text2) < 0){
            System.out.println("Pierwszy tekst jest krótszy");
        }else{
            System.out.println("Pierwszy tekst jest dłuższy");
        }

    }
}

    /*Stosując gotowe klasy interfejsów funkcyjnych (Function, Consumer, Supplier, Comparator, Predicate)
    zaimplementuj i przetestuj 5 funkcji:
        funkcja przyjmująca tekst i zwracająca jego długość
        funkcja sprawdzająca czy przekazany tekst ma minimum 5 znaków
        funkcja dostarczająca losową liczbę z przedziału 1-10
        funkcja drukująca tekst wielkimi literami
        funkcja porównująca dwa teksty po ilości liter*/
