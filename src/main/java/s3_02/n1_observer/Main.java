package s3_02.n1_observer;

import s3_02.n1_observer.observable.Market;
import s3_02.n1_observer.observer.Agency;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        Agency agency1 = new Agency("Agency 1");
        Agency agency2 = new Agency("Agency 2");

        market.addObserver(agency1);
        market.addObserver(agency2);

        market.setPrice(100);
        market.setPrice(20);

        market.deleteObserver(agency1);

        market.setPrice(50);
    }
}
