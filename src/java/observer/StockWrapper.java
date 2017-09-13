package observer;

import java.text.DecimalFormat;
import java.util.Objects;

public class StockWrapper implements Runnable {

    private int start;
    private String stock;
    private double price;
    private Subject stockGrabber;


    public StockWrapper(int start, String stock, double price, Subject stockGrabber) {
        this.start = start;
        this.stock = stock;
        this.price = price;
        this.stockGrabber = stockGrabber;
    }

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
        for (int index = 0; index < 20; index++) {
            try {
                Thread.sleep(2000);
            }catch (InterruptedException ignored){}

            double randStep = (Math.random() * (.06)) - .03;

            DecimalFormat df = new DecimalFormat("#.##");

            price = Double.valueOf(df.format(price+randStep));

            if(stockGrabber instanceof StockGrabber){

                if(Objects.equals(stock, "IBM")) ((StockGrabber) stockGrabber).setIBMPrice(price);

                if(Objects.equals(stock, "App")) ((StockGrabber) stockGrabber).setAppPrice(price);

                if(Objects.equals(stock, "GooG")) ((StockGrabber) stockGrabber).setGooglePrice(price);

                System.out.println(String.format("%s: %s  %s\n",stock,df.format(price - randStep),df.format(randStep)));

            }

        }
    }
}
