package s3_01.n3_command;

import s3_01.n3_command.command.ActionType;
import s3_01.n3_command.command.VehicleCommand;
import s3_01.n3_command.vehicle.*;
import s3_01.n3_command.invoker.Invoker;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        VehicleCommand carStart = new VehicleCommand(car, ActionType.START);
        VehicleCommand carAccelerate = new VehicleCommand(car, ActionType.ACCELERATE);
        VehicleCommand carBrake = new VehicleCommand(car, ActionType.BRAKE);

        Invoker carInvoker = new Invoker();
        carInvoker.addCommand(carStart);
        carInvoker.addCommand(carAccelerate);
        carInvoker.addCommand(carBrake);

        System.out.println("Execution of the Car commands.");
        carInvoker.executeCommands();

        Bike bike = new Bike();

        VehicleCommand bikeStart = new VehicleCommand(bike, ActionType.START);
        VehicleCommand bikeAccelerate = new VehicleCommand(bike, ActionType.ACCELERATE);
        VehicleCommand bikeBrake = new VehicleCommand(bike, ActionType.BRAKE);

        Invoker bikeInvoker = new Invoker();
        bikeInvoker.addCommand(bikeStart);
        bikeInvoker.addCommand(bikeAccelerate);
        bikeInvoker.addCommand(bikeBrake);

        System.out.println("\nExecution of the Bike commands.");
        bikeInvoker.executeCommands();

        Plane plane = new Plane();

        VehicleCommand planeStart = new VehicleCommand(plane, ActionType.START);
        VehicleCommand planeAccelerate = new VehicleCommand(plane, ActionType.ACCELERATE);
        VehicleCommand planeBrake = new VehicleCommand(plane, ActionType.BRAKE);

        Invoker planeInvoker = new Invoker();
        planeInvoker.addCommand(planeStart);
        planeInvoker.addCommand(planeAccelerate);
        planeInvoker.addCommand(planeBrake);

        System.out.println("\nExecution of the Plane commands.");
        planeInvoker.executeCommands();

        Ship ship = new Ship();

        VehicleCommand shipStart = new VehicleCommand(ship, ActionType.START);
        VehicleCommand shipAccelerate = new VehicleCommand(ship, ActionType.ACCELERATE);
        VehicleCommand shipBrake = new VehicleCommand(ship, ActionType.BRAKE);

        Invoker shipInvoker = new Invoker();
        shipInvoker.addCommand(shipStart);
        shipInvoker.addCommand(shipAccelerate);
        shipInvoker.addCommand(shipBrake);

        System.out.println("\nExecution of the Ship commands.");
        shipInvoker.executeCommands();
    }
}
