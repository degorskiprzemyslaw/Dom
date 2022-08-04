package obiektowe.multithreading.task25;

public class Demo {
    public static void main(String[] args) {
        /*ConcatenationTask concatenationTask = new ConcatenationTask(20, "D");
        concatenationTask.startTask();
        String result = concatenationTask.getResult();
        System.out.println(result); // dlaczego nie wyświetla się result po wykonaniu wątku?*/

        ConcatenationTask concatenationTask = new ConcatenationTask(20000000, "D");
        concatenationTask.startTask();

        Runnable abortingTask = new Runnable(){
            @Override
            public void run(){
                try {
                    Thread.sleep(1000);
                    concatenationTask.abort();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e); //dlaczego runtimea?
                }
            }
        };
        Thread thread = new Thread(abortingTask);
        thread.start();
        concatenationTask.waitUntilEnd();
        String result = concatenationTask.getResult();
        System.out.println(result.length());
        System.out.println(result);
    }
}
