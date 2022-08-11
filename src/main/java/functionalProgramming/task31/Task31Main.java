package functionalProgramming.task31;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Task31Main {
    public static void main(String[] args) {
        Random r = new Random();

        Pet pet1 = new Pet("Pimpuś", r.nextInt(9)+1);
        Pet pet2 = new Pet("Tuptuś", r.nextInt(9)+1);
        Pet pet3 = new Pet("Bimbuś", r.nextInt(9)+1);
        Pet pet4 = new Pet("Klapciuś", r.nextInt(9)+1);

        List<Person> people = new ArrayList<>();

            people.add(new Person("Wojtek", new ArrayList<>(List.of(pet1, pet3, pet4))));
            people.add(new Person("Ala", new ArrayList<>(List.of(pet2))));
            people.add(new Person("Zbyszek", new ArrayList<>()));


        System.out.println(people);

        //stream1
        people.stream()
                .map(person-> person.getName())
                .sorted()
                .toList()
                .forEach(name -> System.out.print(name + ", "));
        System.out.println();

        //stream2
        people.stream()
                .mapToInt(person -> person.getBirthdayMonth())
                .forEach(month -> System.out.print(month + ", "));
        System.out.println();

        //stream3
        people.stream()
                .map(person -> person.getPets())
                .mapToInt(pets -> pets.size())
                .forEach(petSize -> System.out.print(petSize + ", "));
        System.out.println();

        //stream3 alternative z flatMap
        people.stream()
                .flatMap(person -> Stream.of(person.getPets().size()))
                .forEach(petList -> System.out.print(petList + ", "));
        System.out.println();

        //stream4
        System.out.println(people.stream()
                .flatMap(person -> person.getPets().stream())
                .mapToInt(pet -> pet.getAge())
                .sum());

        //zad5
        for (Person person : people) {
            System.out.print(person.getAge() + ", ");
        }
        System.out.println();

        //stream6
        System.out.printf("%.2f", people.stream()
                .mapToDouble(person -> person.getAge())
                .average().orElse(-1));

    }




}

   /* Stwórz klasę Pet z polem name oraz age. Stwórz 4 instancje tej klasy (obiekty) w main.
        Stwórz prostą klasę Person z polami name, birthday oraz listą zwierząt pets (List<Pet>).
        Stwórz 3 osoby, jedna z 3 zwierzętami jedna z jednym a ostatnie bez zwierząt. Zbierz te osoby do listy.
        Wykorzystując metodę map wygeneruj listę imion osób w kolejności alfabetycznej
        Wykorzystując metodę map wygeneruj listę zawierającą miesiące (liczbowo) w których urodziły się te osoby
        Wykorzystaj metodę flatMap aby policzyć ilość zwierząt tych osób
        Wykorzystaj metodę flatMap aby wyliczyć łączny wiek wszystkich zwierząt
        Stwórz w klasie Person metodę która zwraca wiek osoby wyliczając go na podstawie daty
        Wykorzystaj metodę mapToInt i wylicz średni wiek osób na liście*/

