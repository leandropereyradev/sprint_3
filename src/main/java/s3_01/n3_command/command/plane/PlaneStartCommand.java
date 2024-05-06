package s3_01.n3_command.command.plane;

import s3_01.n3_command.command.Command;
import s3_01.n3_command.vehicle.Plane;

public class PlaneStartCommand implements Command {
    private final Plane PLANE;

    public PlaneStartCommand(Plane plane) {
        this.PLANE = plane;
    }

    @Override
    public void execute() {
        PLANE.start();
    }
}
