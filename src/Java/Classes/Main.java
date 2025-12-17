package Java.Classes;

public class Main extends Car {


    public static void main(String[] args) {

       Car obj = new Main(30);// we can't create object for abstact class but we can use as reference
    }

    Main(int mileage){
        super(mileage);
    }

    @Override
    public void pressBreak() {
        System.out.println("Break Applied");
    }

    @Override
    public void pressClutch() {
        System.out.println("Clutch Applied");
    }
}
