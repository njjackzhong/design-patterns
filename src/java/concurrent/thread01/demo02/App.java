package concurrent.thread01.demo02;

class Runner implements Runnable{

    @Override
    public void run() {

        for (int index = 0; index < 10; index++) {

            System.out.println(String.format("%-30s  Index:%5d",Thread.currentThread(),index));

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

        Thread t1 = new Thread(new Runner());
        Thread t2 = new Thread(new Runner());

        t1.start();
        t2.start();


    }

}
