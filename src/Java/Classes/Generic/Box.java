package Java.Classes.Generic;

public class Box<T> {
    T value;
    public T getPrintValue(){
        return value;
    }
    public void setValue(T value){
         this.value=value;
    }
    public static void main(String[] args) {
        Box<Integer> obj = new Box<Integer>(); //if we want we can make make it to String
        obj.setValue(30);
    }
}
