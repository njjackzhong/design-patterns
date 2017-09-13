package observer;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double appPrice;
    private double googlePrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;

        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);

        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double appPrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.appPrice = appPrice;
        this.googlePrice = googlePrice;

        print();
    }


    @Override
    public String toString() {
        return "StockObserver{" +
                "observerID=" + observerID +
                ", ibmPrice=" + ibmPrice +
                ", appPrice=" + appPrice +
                ", googlePrice=" + googlePrice +
               // ", stockGrabber=" + stockGrabber +
                '}';
    }

    private void print(){
        System.out.println(this);
    }
}
