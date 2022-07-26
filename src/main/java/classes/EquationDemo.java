package classes;

public class EquationDemo {

    public static void main(String[] args) {

        Equation addition = new Equation() {
            @Override
            public int execute(int a, int b) {
                return a + b;
            }
        };

        Equation subtraction = new Equation() {
            @Override
            public int execute(int a, int b) {
                return a - b;
            }
        };

    }
}

interface Equation{
    public int execute(int a, int b);
}
