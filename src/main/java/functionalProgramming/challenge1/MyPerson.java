package functionalProgramming.challenge1;

import java.time.LocalDate;
import java.util.Random;

public class MyPerson extends Person{
    public MyPerson(String name) {
        super(name);
    }

    @Override
    protected int getRandomCash() {
        Random random = new Random();
        return random.nextInt(101);
    }

    @Override
    public LocalDate getRandomBirthDate() {
        Random random = new Random();

        LocalDate localDate = LocalDate.of(LocalDate.now().getYear() - random.nextInt(101),
                LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth());
        return localDate;
        //LocalDate.now().minusYears(random.nextInt(101).minusDays(random.nextInt(365));
    }

    @Override
    public int getAge() {
        return LocalDate.now().getYear() - getBirthDate().getYear();

        //return (int) birthDate.until(LocalDate.now(), ChronoUnit.YEARS);
    }


}
