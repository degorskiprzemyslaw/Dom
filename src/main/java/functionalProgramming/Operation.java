package functionalProgramming;

public interface Operation {
    double executeOperation(double num1, double num2);

    public class Addition implements Operation{

        @Override
        public double executeOperation(double num1, double num2) {
            return num1 + num2;
        }
    }

    public static void main(String[] args) {
        Addition addition = new Addition();

        Operation subtraction = (num1, num2) -> num1 - num2;

        System.out.println(addition.executeOperation(10, 100));
        System.out.println(subtraction.executeOperation(10, 100));
    }
}






    /*Stwórz interfejs Operation, posiadający metodę abstrakcyjną przyjmującą 2 liczby i zwracającą liczbę.

        za pomocą wewnętrznej klasy zaimplementuj dodawanie
        za pomocą lambdy zaimplementuj odejmowanie*/
