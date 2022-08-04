package obiektowe.multithreading;

public class MainTask24 {
    public static void main(String[] args) {
        Task task1 = new Task();
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("Działanie threada z klasy anonimowej. Iteracja numer: " + i);

                }
            }
        };
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}
