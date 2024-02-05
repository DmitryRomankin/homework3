package OCP;

public class Vehicle {
    public int maxspeed;
    public String type;
    

    public Vehicle(String type, int maxspeed){
        this.type = type;
        this.maxspeed = maxspeed;
    }
    
    public double calculateAllowedSpeed(){
        return maxspeed;
    }
}
