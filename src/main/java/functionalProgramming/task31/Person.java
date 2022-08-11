package functionalProgramming.task31;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person {
    String name;
    LocalDate birthday;
    List<Pet> pets = new ArrayList<>();
    Random r = new Random();

    public Person(String name, List<Pet> pets) {
        this.name = name;
        this.birthday = LocalDate.now().minusYears(r.nextInt(10, 40)).minusDays(r.nextInt(364));
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public int getBirthdayMonth() {
        return birthday.getMonthValue();
    }
    public int getAge(){
        return LocalDate.now().getYear() - birthday.getYear();
    }

    public List<Pet> getPets() {
        return pets;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", pets=" + pets +
                '}';
    }
}
