package s3_01.n3_command.command.plane;

import s3_01.n3_command.command.Command;
import s3_01.n3_command.vehicle.Plane;

public class PlaneAccelerateCommand implements Command {

    private final Plane PLANE;

    public PlaneAccelerateCommand(Plane plane) {
        this.PLANE = plane;
    }

    @Override
    public void execute() {
        PLANE.accelerate();
    }
}
