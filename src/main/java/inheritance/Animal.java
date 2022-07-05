package inheritance;

public abstract class Animal { //nie mozna stworzyc obiektu z klasy abstrakcyjnej -> nie dziala new Animal, ale moze byc w liscie



    public void eat(){
        System.out.println("Zwierzę je jedzonko");
    }

    public void goToSleep(){
        System.out.println("Zwierze spi");
    }

    public abstract void makeSound(); //metoda abstrakcyjna NIE MA CIALA (KLAMER)
    //TRZEBA JA NADPISYWAC


}
