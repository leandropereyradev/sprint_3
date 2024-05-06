package s3_01.n3_command.command.bike;

import s3_01.n3_command.command.Command;
import s3_01.n3_command.vehicle.Bike;

public class BikeAccelerateCommand implements Command {

    private final Bike BIKE;

    public BikeAccelerateCommand(Bike bike) {
        this.BIKE = bike;
    }

    @Override
    public void execute() {
        BIKE.accelerate();
    }
}
