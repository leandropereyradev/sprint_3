package s3_02.n1_observer.observer;

public class Agency extends ClientObserver {
    private String agency;

    public Agency(String agency) {
        this.agency = agency;
    }

    @Override
    public void updateObserver(int change) {
        if (change > 0) {
            System.out.println(agency + ": The stock market has risen " + change + " points.");
        } else if (change < 0) {
            System.out.println(agency + ": The stock market has dropped " + Math.abs(change) + " points.");
        } else {
            System.out.println(agency + ": The stock market remains unchanged.");
        }
    }
}
