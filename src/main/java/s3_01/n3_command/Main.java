package s3_01.n3_command;

import s3_01.n3_command.vehicle.*;
import s3_01.n3_command.command.bike.*;
import s3_01.n3_command.command.car.*;
import s3_01.n3_command.command.plane.*;
import s3_01.n3_command.command.ship.*;
import s3_01.n3_command.invoker.Invoker;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        CarStartCommand carStart = new CarStartCommand(car);
        CarAccelerateCommand carAccelerate = new CarAccelerateCommand(car);
        CarBrakeCommand carBrake = new CarBrakeCommand(car);

        Invoker carInvoker = new Invoker();
        carInvoker.start(carStart);
        carInvoker.accelerate(carAccelerate);
        carInvoker.brake(carBrake);

        System.out.println("Execution of the Car commands.");
        carInvoker.executeCommands();

        Bike bike = new Bike();

        BikeStartCommand bikeStart = new BikeStartCommand(bike);
        BikeAccelerateCommand bikeAccelerate = new BikeAccelerateCommand(bike);
        BikeBrakeCommand bikeBrake = new BikeBrakeCommand(bike);

        Invoker bikeInvoker = new Invoker();
        bikeInvoker.start(bikeStart);
        bikeInvoker.accelerate(bikeAccelerate);
        bikeInvoker.brake(bikeBrake);

        System.out.println("\nExecution of the Bike commands.");
        bikeInvoker.executeCommands();

        Plane plane = new Plane();

        PlaneStartCommand planeStart = new PlaneStartCommand(plane);
        PlaneAccelerateCommand planeAccelerate = new PlaneAccelerateCommand(plane);
        PlaneBrakeCommand planeBrake = new PlaneBrakeCommand(plane);

        Invoker planeInvoker = new Invoker();
        planeInvoker.start(planeStart);
        planeInvoker.accelerate(planeAccelerate);
        planeInvoker.brake(planeBrake);

        System.out.println("\nExecution of the Plane commands.");
        planeInvoker.executeCommands();

        Ship ship = new Ship();

        ShipStartCommand shipStart = new ShipStartCommand(ship);
        ShipAccelerateCommand shipAccelerate = new ShipAccelerateCommand(ship);
        ShipBrakeCommand shipBrake = new ShipBrakeCommand(ship);

        Invoker shipInvoker = new Invoker();
        shipInvoker.start(shipStart);
        shipInvoker.accelerate(shipAccelerate);
        shipInvoker.brake(shipBrake);

        System.out.println("\nExecution of the Ship commands.");
        shipInvoker.executeCommands();
    }
}
