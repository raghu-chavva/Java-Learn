package Java.Classes.Generic;

public class Print<T> {
    private T value;
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value=value;
    }
    public void print(){
        System.out.println("Value is::: "+value);
    }

    public static void main(String[] args){
        Print<String> objString = new Print<String>();
        Print<Integer> objInt = new Print<Integer>();
        objString.setValue("Hello");
        objInt.setValue(0123);

        objString.print();
        objInt.print();

    }
}
