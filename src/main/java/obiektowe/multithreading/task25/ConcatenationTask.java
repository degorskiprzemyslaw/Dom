package obiektowe.multithreading.task25;

public class ConcatenationTask implements Runnable{

private int count;
private String text;
private String result = "";
private Thread thread;
private boolean running = true;

    public ConcatenationTask(int count, String text) {
        this.count = count;
        this.text = text;
        thread = new Thread(this); //w sumie po co tworzy sie nowy thread?
    }


    public void startTask(){
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            result += text;
            if(!running){
                System.out.println("Aborting");
                break;
            }

        }
    }

    public String getResult() {
        return result;
    }

    public void abort(){
        running = false;
    }

    public void waitUntilEnd() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace(); //w sumie nic nie wyrzuca
        }
    }

    @Override
    public String toString() {
        return "ConcatenationTask{" +
                "result='" + result + '\'' +
                '}';
    }
}
