package s3_02.n1_observer.observable;

import s3_02.n1_observer.observer.ClientObserver;

public interface MarketObservable {
    void addObserver(ClientObserver observer);

    void deleteObserver(ClientObserver observer);

    void notifyObserver(int change);
}
