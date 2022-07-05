package inheritance;

public class Goat extends Animal{

    private String name;
    private int age;

    public Goat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Goat(){
        name = "Felicja";
        age = 3;
    }

    public void sayMee(){
        System.out.println("Meeeee!");
    }
    public void ramWithHorns(){
        System.out.println(name + " rozpędza się i nastawia rogi");
    }

    public void giveMilk(){
        System.out.println(name + " jest dojona");
    }

    @Override
    public void makeSound() {
        System.out.println("Meeeeeee");
    }
}
