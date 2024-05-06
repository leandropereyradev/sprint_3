package s3_01.n3_command.command.car;

import s3_01.n3_command.command.Command;
import s3_01.n3_command.vehicle.Car;

public class CarBrakeCommand implements Command {
    private final Car CAR;

    public CarBrakeCommand(Car bike) {
        this.CAR = bike;
    }

    @Override
    public void execute() {
        CAR.brake();
    }
}
