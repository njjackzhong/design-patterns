package concurrent.thread01.demo01;

class Runner extends Thread{


    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println(String.format("%s, Index:%5d",Thread.currentThread(),i));

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        
    }
}

public class App {

    public static void main(String[] args) {

        Runner runner1 = new Runner();

        runner1.start();

        Runner runner2 = new Runner();

        runner2.start();


    }

}
