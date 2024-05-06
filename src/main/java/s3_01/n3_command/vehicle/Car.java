package s3_01.n3_command.vehicle;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Start vehicle: Car");
    }

    @Override
    public void brake() {
        System.out.println("Brake vehicle: Car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate vehicle: Car");
    }
}
