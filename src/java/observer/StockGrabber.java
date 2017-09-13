package observer;

import java.util.ArrayList;

/**
 *
 */
public class StockGrabber implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private double ibmPrice;
    private double appPrice;
    private double googlePrice;



    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unRegister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex + 1) + " deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        observers.parallelStream().forEach(observer -> observer.update(ibmPrice,appPrice,googlePrice));
    }

    public void setIBMPrice(double ibmPrice){
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }
    public void setAppPrice(double appPrice){
        this.appPrice = appPrice;
        notifyObserver();
    }
    public void setGooglePrice(double googlePrice){
        this.googlePrice = googlePrice;
        notifyObserver();
    }

}
