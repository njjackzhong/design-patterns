package concurrent.thread01;

public class MyRunnable implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

        try {
            System.out.println("MyRunnable is:" + System.identityHashCode(this)+",Thread name: " + Thread.currentThread().getName());

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            //System.out.println(String.format("%s",e.printStackTrace()));

            System.out.println(String.format("stackTrace:%s,Thread name:%s",e.getMessage(),Thread.currentThread().getName()));

        }

    }
}
