package HomeWork5;

public class Transport {
    int maxSpeed ;
   String  brand;
   int power;
    int mass;
    double kvValue=0;

    double kvValue(){

        kvValue = ((double)power*0.74);
        return kvValue;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getKvValue() {
        kvValue = ((double)power*0.74);
        return kvValue;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
