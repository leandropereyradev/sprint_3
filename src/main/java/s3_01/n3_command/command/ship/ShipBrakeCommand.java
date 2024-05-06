package s3_01.n3_command.command.ship;

import s3_01.n3_command.command.Command;
import s3_01.n3_command.vehicle.Ship;

public class ShipBrakeCommand implements Command {
    private final Ship SHIP;

    public ShipBrakeCommand(Ship ship) {
        this.SHIP = ship;
    }

    @Override
    public void execute() {
        SHIP.brake();
    }
}
