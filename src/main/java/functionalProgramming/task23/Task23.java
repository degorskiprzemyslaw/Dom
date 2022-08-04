package functionalProgramming.task23;

import java.util.Comparator;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Task23 {
    public static void main(String[] args) {
        Function<Integer, Integer> randomWithinNumber = number -> new Random().nextInt(number);
        System.out.println(randomWithinNumber.apply(11));


        Predicate<String> isBiggerThanFive = text -> text.length() >= 5;
        if(isBiggerThanFive.test("as")){
            System.out.println("Conajmniej 5");
        }else {
            System.out.println("Mniej niz 5");
        }

        Comparator<String> areSameLength = (text1, text2) ->{
            return text1.length() - text2.length();
        };
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
