package s3_01.n3_command.vehicle;

public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Start vehicle: Bike");
    }

    @Override
    public void brake() {
        System.out.println("Brake vehicle: Bike");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate vehicle: Bike");
    }
}
