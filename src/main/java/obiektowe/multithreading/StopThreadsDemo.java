package obiektowe.multithreading;

public class StopThreadsDemo {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask);
        thread.start();
        //myTask.stopRunning();// jak to działa?
        thread.interrupt(); //przerywa przed ostatnim?

    }
}
