package observer;

public class GrabStocks {

    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();
/*
        StockObserver observer1 = new StockObserver(stockGrabber);


        stockGrabber.setIBMPrice(101.00);
        stockGrabber.setAppPrice(601.00);
        stockGrabber.setGooglePrice(701.00);


        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(102.00);
        stockGrabber.setAppPrice(702.00);
        stockGrabber.setGooglePrice(802.00);

        stockGrabber.unRegister(observer1);
        stockGrabber.setIBMPrice(103.00);
        stockGrabber.setAppPrice(603.00);
        stockGrabber.setGooglePrice(703.00);*/


        StockObserver stockObserver = new StockObserver(stockGrabber);


        stockGrabber.setIBMPrice(104.00);
        stockGrabber.setAppPrice(604.00);
        stockGrabber.setGooglePrice(704.00);

        System.out.println("---------------");

        Runnable ibmStockWrapper = new StockWrapper(2,"IBM",104.00,stockGrabber);
        Runnable appStockWrapper = new StockWrapper(2,"App",604.00,stockGrabber);
        Runnable googleStockWrapper = new StockWrapper(2,"GooG",704.00,stockGrabber);


        new Thread(ibmStockWrapper).start();
        new Thread(appStockWrapper).start();
        new Thread(googleStockWrapper).start();

    }
}
