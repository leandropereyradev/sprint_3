package s3_01.n3_command.command;

import s3_01.n3_command.vehicle.Vehicle;

public class VehicleCommand implements Command {
    private final Vehicle vehicle;
    private final ActionType actionType;

    public VehicleCommand(Vehicle vehicle, ActionType actionType) {
        this.vehicle = vehicle;
        this.actionType = actionType;
    }

    @Override
    public void execute() {
        switch (this.actionType) {
            case START -> vehicle.start();
            case BRAKE -> vehicle.brake();
            case ACCELERATE -> vehicle.accelerate();
            default -> System.out.println("Invalid action type.");
        }
    }
}

