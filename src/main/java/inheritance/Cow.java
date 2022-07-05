package inheritance;

public class Cow extends Animal{

    private String name;
    private int age;

    public Cow(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayMoo(){
        System.out.println("Moooo!");
    }
    public void waveFliesWithTail(){
        System.out.println(name + " odpedza muchy ogonem");
    }

    public void giveMilk(){
        System.out.println(name + " jest dojona");
    }
}
