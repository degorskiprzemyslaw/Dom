package inheritance;

public class Monkey extends Animal {

    private String name;
    private int age;
    private int tailLength;

    public Monkey(String name, int age, int tailLength) {
        this.name = name;
        this.age = age;
        this.tailLength = tailLength;
    }

    public Monkey(){
        name = "Jacek";
        age = 8;
        tailLength = 20;
    }

    public void uhaha(){
        System.out.println("Uhahaha!!!");
    }

    public void jump(){
        System.out.println(name + " skacze w poszukiwaniu banana!");
    }

    public void eat(){ //NADPISYWANIE METODY - TAKA JUZ JEST W ANIMAL
        System.out.println("Małpa je banana!");
    }

    @Override
    public void makeSound() {
        uhaha();
    }
}
