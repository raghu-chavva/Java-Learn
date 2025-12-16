package Java.Constructors;

public class chain {
    int i,j;
    public chain(){
        this(10);
    }
    public chain(int a){
        this(10,20);
    }
    public chain(int a, int b){
        System.out.println("I am chain constuctor");
    }

    public static void main(String[] args) {
        chain chain = new chain();
    }
}
