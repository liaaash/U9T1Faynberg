public class VehicleRunner {
    public static void main(String[] args)
    {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn(90);
        myVehicle.brake(0.25);

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(-90); // inherited method
        myCar.brake(0.50); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        Bicycle myBike = new Bicycle("terry", 2, 30);
        System.out.println(myBike.getName());
        System.out.println(myBike.getWheels());
        myBike.move(10);
        myBike.turn(90);
        myBike.brake(0.25);
        myBike.ringBell();
        System.out.println(myBike.getGears());

        // ---- WRITE YOUR TEST CODE BELOW! ----
        // testing all available methods on a Bicycle object
        FoodTruck foodTruck = new FoodTruck("bakery", 4, 5);
        System.out.println(foodTruck.getName());
        System.out.println(foodTruck.getWheels());
        foodTruck.move(10);
        foodTruck.turn(90);
        foodTruck.brake(0.25);
        foodTruck.displayMenu();
        System.out.println(foodTruck.getMenuItems());

    }
}
