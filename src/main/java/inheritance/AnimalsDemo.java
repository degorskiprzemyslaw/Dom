package inheritance;

import java.util.ArrayList;

public class AnimalsDemo {
    public static void main(String[] args) {

        Monkey monkey = new Monkey(); //NAZWA KLASY MOGLABY BYC ANIMAL LUB OBJECT - mozna dziedziczyc tylko po jednej klasie
        Monkey monkey2 = new Monkey("Filutek", 4, 15);

        Whale whale = new Whale();
        Whale whale2 = new Whale("Radek", 45, 7);

        monkey.jump();
        monkey.uhaha();

        whale.booing();
        whale.swim();

        //wspólna metoda
        monkey.eat(); //(metoda znajduje sie w klasie animal a dziala - bo dziedzicecznie)
        whale.eat();

        Cow cow = new Cow("Balbina", 12);
        Goat goat = new Goat("Miroslawa", 5);


        ArrayList <Animal> animalsList = new ArrayList<>();
        animalsList.add(cow);
        animalsList.add(goat);

        for (Animal animal : animalsList) {
            animal.goToSleep();
        }




    }
}
