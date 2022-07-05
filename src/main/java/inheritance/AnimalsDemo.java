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
        animalsList.add(whale);
        animalsList.add(monkey);

        for (Animal animal : animalsList) {
            animal.goToSleep();
            animal.eat();
        }

        System.out.println("-------------Animal Guide -----------");
        AnimalGuide animalGuide = new AnimalGuide();
        // animalGuide.feedMonkey(monkey);
        //  animalGuide.feedWhale(whale);

        animalGuide.feedAnimal(monkey);
        animalGuide.feedAnimal(whale);



        //polimorfizm
        System.out.println("--------Polymorphysm--------------");
        Animal animal = new Whale(); //najpierw szuka dzialanie w hale, w animal metoda jest pusta
        animal.makeSound();
        animal = new Monkey();
        animal.makeSound();
        animal = new Cow();
        animal.makeSound();
        animal = new Goat();
        animal.makeSound();



        for (Animal anAnimal : animalsList) {
            anAnimal.makeSound();
        }




        //metody sie dostosowuja do obiektu ktory napdisuje metode
        //zdolnosc jezyka obiektowego do umieszczania we wspolnej zmiennej roznych
        //typow obiektow metody takiej zmiennej dostosowuja swoje dzialanie w zaleznosci jak dany obiekt ja nadpisuje


        //Z abstrakcyjnej klasy nie mozna robic obiektow - nie dziala new
        //klasy abstrakcyjne moga miec abstrakcyjne metody
        //animal = new Animal();







    }
}
