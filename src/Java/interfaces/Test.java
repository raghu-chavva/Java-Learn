package Java.interfaces;

public class Test {
    public static void main(String[]args){
        Eagle eagle=new Eagle();
        Peacock peacock=new Peacock();
        eagle.fly();
        peacock.fly();
        Bird.category();
    }
}
