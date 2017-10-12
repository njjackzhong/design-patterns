package concurrent.thread01.demo03;

public class App {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            for (int index = 0; index < 10; index++) {

                System.out.println(String.format("%s  Index:%5d",Thread.currentThread(),index));

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        t1.start();

    }
}
