package functionalProgramming.challenge1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamService implements StreamService{
    @Override
    public void sortAndPrint(List<String> names) {
        names.stream()
                .sorted()
                .forEach(name -> System.out.println(name));

        }



    @Override
    public int distinctAndCountNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .distinct()
                .sum();
    }

    @Override
    public List<String> computeFemaleNames(List<String> names) {
        return names.stream()
                .filter(name -> name.charAt(name.length() - 1) == 'a') //endsWith("a")
                .toList();
    }

    @Override
    public void printNumbersOfRange(int[] numbers, int minValue, int maxValue) {
        Arrays.stream(numbers)
                .filter(number -> (number >= minValue && number <= maxValue))
                .forEach(number -> System.out.println(number));

    }

    @Override
    public List<Integer> computeNamesLength(List<String> names) {
        return names.stream()
                .map( (name) -> name.length())
                .toList();

    }

    @Override
    public List<Person> buildPeopleWithNames(List<String> names) {
        return names.stream()
                .map(name -> new MyPerson(name))
                .collect(Collectors.toList()); //uzywajac toList trzeba rzutowac
    }

    @Override
    public List<Person> findPeopleOfIdGreaterThan(List<Person> people, int id) {
        return people.stream()
                .filter(person -> person.getId() >= id)
                .toList();

    }

    @Override
    public boolean hasSenior(List<Person> people) {
        return people.stream()
                .filter(person -> person.getAge() == 60)
                .toList().isEmpty();
    }

    @Override
    public double sumTotalCash(List<Person> people) {
         return people.stream()
                .mapToDouble(person -> person.getCash())
                .sum();

    }

    @Override
    public Person findRichestPerson(List<Person> people) {
        if(people.isEmpty()) return null;
        return people.stream()
                .sorted((person1, person2) -> (int) (person2.getCash() - person1.getCash()))
                .findFirst().get();
    }

    @Override
    public double computeAverageAge(List<Person> people) {
        if(people.isEmpty()) return -1;
        return (double) people.stream()
                .mapToInt(person -> person.getAge())
                .sum() / people.size();
    }
}
