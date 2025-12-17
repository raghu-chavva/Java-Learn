package Java.Classes.Nested;


//static nested class
public class Outer {
    int outVar=20;
    static class Inner{
        int invar=20;
        public void method(){
            System.out.println("hello i am inner class");
            System.out.println(invar);
            //System.out.println(outVar); Static inner class can access only static fields
        }
    }


    public static void main(String[] args) {
          Outer.Inner obj =new Outer.Inner();
          obj.invar=30;
          obj.method();
    }
}
