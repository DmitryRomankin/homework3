package OCP;

public class Bus extends Vehicle{
    public Bus(int maxspeed){
        super("Bus", maxspeed);
    }

    @Override
    public double calculateAllowedSpeed(){
        return super.maxspeed * 0.2;
    } 
}
