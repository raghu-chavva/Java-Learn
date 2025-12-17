package Java.Classes;

public abstract class Car {

    int mileage;
    Car(int mileage){
        this.mileage=mileage;
    }

    public abstract void pressBreak();
    public abstract void pressClutch();
    public int getNumberofWheels(){
        return 4;
    }
}
