package obiektowe.multithreading;

public class ThreadsDemo { //wielowątkowosć to równoczesne wykonywanie procesów
    //np. do obsługi sieci i klientów na serwerze
    //robi się też to dla responsywoności aplikacji - np. interfejsy graficzne - można anulować instalacji w trakcie instalowania plików

    public static void main(String[] args) {
        Runnable task = new Runnable(){ //runnable jest interfejsem -> ma abstrakcyjna metode run
            @Override
            public void run(){
                for (int i = 0; i < 10_000; i++) {
                    System.out.println("Pozdrowienia z osobnego wątku");
                }

            }
        };
        Thread worker = new Thread(task);
        worker.start(); //start nie run -> start to jest tylko sygnał do zrobienia zadania
        for (int i = 0; i < 10_000; i++) { //BĘDĄ SIĘ PRZEPLATAĆ
            System.out.println("POZDROWIENIA Z MAIN");
        }


    }
}
