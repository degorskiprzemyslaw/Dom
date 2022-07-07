package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //array listy tez przehcowuja dane
        //rozmiar listy dostosowuje sie sam wiec tym sie rozni od tablic
        //array list to tez jest klasa

        String[] names = new String[3]; //classictable
        names[0] = "Marcin";
        names[1] = "Julia";
        names[2] = "Ada";

        ArrayList<String> namesList = new ArrayList<>(); //trzeba okreslic typ danych w ostrych nawiasach
        //ArrayList<int> intList = new ArrayList<>(); // nie dziala to na typach prymitywnych
        System.out.println(namesList);
        System.out.println(namesList.size()); //nie length tylko size
        namesList.add("Marcin"); //dodaje sie METODA add
        namesList.add("Julia");
        namesList.add("Ada");
        namesList.add("Grzegorz");
        System.out.println(namesList);
        System.out.println(namesList.size());

        namesList.add(0, "Grzegorz"); //mozna dodawac do dowolnego miejsca
        System.out.println(namesList);
        System.out.println(namesList.size());

        String element = namesList.get(0);
        System.out.println(element);
        namesList.set(1, "Zofia");
        System.out.println(namesList);

        namesList.remove(0); //usuwanie opisujac obiekt gdy sa 2 obiekty lub wiecej to usunie tylko pierwszy
        System.out.println(namesList);


        //int = Integer
        //char = Character
        //double = Double

        ArrayList<Integer> numbers = new ArrayList<>(); //arraylista na typach prymitywnych - tzreba dzialac na opakowanych
        //danych - obiektowych

        numbers.add(10);
        numbers.add(104);
        numbers.add(-90);

        System.out.println(numbers);
        System.out.println(numbers.size());
        numbers.add(1, 5678);
        System.out.println(numbers);
        int liczba = numbers.get(3);
        System.out.println(liczba);
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(6);
        numbers2.add(7);
        numbers2.add(8);
        numbers.addAll(2, numbers2);
        System.out.println(numbers + "  " + numbers.size());
        Collections.shuffle(numbers);
        System.out.println(numbers);
        numbers.remove(4); //remove dziala tylko dla indeksow

        ArrayList rozne = new ArrayList();
        rozne.add("blabla");
        rozne.add(5483);

        rozne.add(94351);
        System.out.println(rozne);
        Integer element2 = (Integer) rozne.get(1); //trzeba rzutowac przy listach z wielorakim typem danych
        System.out.println(element2);


        for (Integer number : numbers) { //mozna po foreachu wysweitlac
            System.out.println(number);
        }

        List<String> names2 = List.of("Ada", "Ania", "Marta", "Marek"); //tworzy nam liste ale nie array liste - nie mozna przypisac do arraylisty
        //zwraca nam nimodyfikowalna liste
        //names2.add("Daniel"); -> unsupportedOperationException
        //trzeba zrobic tak
        List<String> names3= new ArrayList<>(List.of("Ada", "Ania", "Marta", "Marek"));
        System.out.println(names3);



    }
}
