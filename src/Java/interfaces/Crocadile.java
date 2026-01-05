package Java.interfaces;

public class Crocadile implements LandAnimal,WaterAnimal{
    @Override
    public void canBreathe(){
        System.out.println("Crocadile is Breathing");
    }
}
