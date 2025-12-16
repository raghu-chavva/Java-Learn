package Java.Constructors;

public class Parent {
    int a=20;
    Parent(int b){
        b=300;
        System.out.println("parent constructor");
    }
    {
        System.out.println(a);
    }
}
