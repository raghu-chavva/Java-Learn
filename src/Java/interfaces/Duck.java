package Java.interfaces;

public class Duck implements Bird,Swimmable{
    @Override
    public void fly() {
        System.out.println("Duck is Flying..");
    }

    @Override
    public void swim() {
        System.out.println("Duck is Swimming..");
    }
}
