package s3_01.n3_command.command.ship;

import s3_01.n3_command.command.Command;
import s3_01.n3_command.vehicle.Ship;

public class ShipStartCommand implements Command {
    private final Ship SHIP;

    public ShipStartCommand(Ship ship) {
        this.SHIP = ship;
    }

    @Override
    public void execute() {
        SHIP.start();
    }
}
