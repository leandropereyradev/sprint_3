package s3_01.n3_command.vehicle;

public class Plane implements Vehicle{
    @Override
    public void start() {
        System.out.println("Start vehicle: Plane");
    }

    @Override
    public void brake() {
        System.out.println("Brake vehicle: Plane");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate vehicle: Plane");
    }
}
