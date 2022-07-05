package inheritance;

public class Whale extends Animal{ //DZIECZENIE PO KLASIE ANIMAL

    private String name;
    private int age;
    private double weight;

    public Whale(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Whale(){
        name = "Kraken";
        age = 60;
        weight = 4.5;
    }

    public void booing(){
        System.out.println("<donośne buczenie wieloryba!>");
    }

    public void swim(){
        System.out.println(name + " płynie majestatycznie");
    }

    public void eat(){
        super.eat(); //wersja z klasy po ktorej dziedziczy
        System.out.println("Czyli je plankton");
    }

    @Override
    public void makeSound() {
        booing();
    }
}
