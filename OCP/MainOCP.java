package OCP;

public class MainOCP {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Train",  250);
        printVehicleMaxSpeed(vehicle);
        vehicle = new Car(180);
        printVehicleMaxSpeed(vehicle);
        vehicle = new Bus(90);
        printVehicleMaxSpeed(vehicle);
    }

    public static void printVehicleMaxSpeed(Vehicle vehicle){
        System.out.println(vehicle.type + " max_speed -> " + vehicle.calculateAllowedSpeed());
    }
}
