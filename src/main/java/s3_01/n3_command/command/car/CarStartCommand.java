package s3_01.n3_command.command.car;

import s3_01.n3_command.command.Command;
import s3_01.n3_command.vehicle.Car;

public class CarStartCommand implements Command {
    private final Car CAR;

    public CarStartCommand(Car car) {
        this.CAR = car;
    }

    @Override
    public void execute() {
        CAR.start();
    }
}
