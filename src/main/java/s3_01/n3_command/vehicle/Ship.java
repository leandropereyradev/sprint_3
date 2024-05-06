package s3_01.n3_command.vehicle;

public class Ship implements Vehicle{

    @Override
    public void start() {
        System.out.println("Start vehicle: Ship");
    }

    @Override
    public void brake() {
        System.out.println("Brake vehicle: Ship");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate vehicle: Ship");
    }
}