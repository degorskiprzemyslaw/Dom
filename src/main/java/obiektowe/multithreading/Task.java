package obiektowe.multithreading;

public class Task implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Działanie klasy Task. Iteracja numer: " + i);
        }

    }
}
