package timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerPurge {

    public static void main(String[] args) {

//        Timer timer = new Timer("MyTimer",true);
        Timer timer = new Timer();

        timer.schedule(new MyFirstTimerTask(),0,100);
        timer.schedule(new MySecondTimerTask(),0,1000);

        try{
            Thread.sleep(2300);
        }catch (InterruptedException ignored){

        }

        System.out.println(Thread.currentThread().getName()+ ": "+System.currentTimeMillis());
        timer.cancel();
        System.out.println(Thread.currentThread().getName()+ ": "+System.currentTimeMillis());

        //timer.purge();
        System.out.println(Thread.currentThread().getName() + ": "+System.currentTimeMillis());

    }

}


class MyFirstTimerTask extends TimerTask {

    /**
     * The action to be performed by this timer task.
     */
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(String.format("Thread:%5s,Time:%d,task:%5d",Thread.currentThread().getName() ,System.currentTimeMillis(),i));

            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {

            }
        }
    }
}

class MySecondTimerTask extends TimerTask {

    /**
     * The action to be performed by this timer task.
     */
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(String.format("Thread:%5s,Time:%d,taskIndex:%5d",Thread.currentThread().getName() ,System.currentTimeMillis(),i));

            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {

            }
        }
    }
}


