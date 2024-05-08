package s3_02.n1_observer.observable;

import s3_02.n1_observer.observer.ClientObserver;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketObservable {

    List<ClientObserver> observerSet = new ArrayList<>();
    private int currentSharePrice;

    public void setPrice(int newPrice) {
        int change = newPrice - this.currentSharePrice;
        this.currentSharePrice = newPrice;
        notifyObserver(change);
    }

    @Override
    public void addObserver(ClientObserver observer) {
        observerSet.add(observer);
    }

    @Override
    public void deleteObserver(ClientObserver observer) {
        observerSet.remove(observer);
    }

    @Override
    public void notifyObserver(int change) {
        observerSet.forEach(observer -> observer.updateObserver(change));
    }
}
