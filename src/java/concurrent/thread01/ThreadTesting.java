package concurrent.thread01;

public class ThreadTesting {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();


        ThreadGroup tg = new ThreadGroup("ThreadGroup A");

        Thread thread01 = new Thread(tg,myRunnable,"thread1");
        Thread thread02 = new Thread(tg,myRunnable,"thread2");
        Thread thread03 = new Thread(tg,myRunnable,"thread3");



//        System.out.println("thread01  getUncaughtExceptionHandler() is :" + thread01.getUncaughtExceptionHandler()+" ,ThreadGroup is : "+thread01.getThreadGroup()+",thread priority is:"+thread01.getPriority());
//        System.out.println("thread02  getUncaughtExceptionHandler() is :" + thread02.getUncaughtExceptionHandler()+" ,ThreadGroup is : "+thread02.getThreadGroup()+",thread priority is:"+thread02.getPriority());

//        thread01.setPriority(Thread.MIN_PRIORITY);
//        thread02.setPriority(Thread.MIN_PRIORITY);
//        thread03.setPriority(Thread.MAX_PRIORITY);

        thread01.start();
        thread02.start();
        thread03.start();
//        thread03.start();


        //Thread.currentThread().getThreadGroup().interrupt();

        tg.list();

    }




}
