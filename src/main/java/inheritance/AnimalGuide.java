package inheritance;

public class AnimalGuide {

    public void feedAnimal(Animal animal){ //monza wprowadzic klase po ktorej sie dziedziczy
        System.out.println("Opiekun karmi małpę:");
        animal.eat();
        //animal.uhaha();
        animal.makeSound();
        //zła praktyka
       /* if(animal instanceof Monkey){ //???
            Monkey monkey = (Monkey) animal;
            monkey.uhaha();
        }
        else if(animal instanceof Whale){
            Whale whale = (Whale) animal;
            whale.booing();
        }*/
    }


    /*public void feedWhale(Whale whale){
        System.out.println("Opiekun karmi wieloryba:");
        whale.eat();
        whale.booing();
    }*/
}
