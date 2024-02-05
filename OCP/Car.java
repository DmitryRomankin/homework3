package OCP;


public class Car extends Vehicle {
    public Car(int maxspeed){
        super("Car", maxspeed);
    }
    @Override
    public double calculateAllowedSpeed() {
        return super.maxspeed * 0.5;
    }
}
    
