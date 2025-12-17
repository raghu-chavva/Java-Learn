package Java.Classes.Nested;

public class Outer1 {
    // Private inner class
    private class Inner1 {
        public void method() {
            System.out.println("hello i am inner private");
        }
    }

    // Public method to access Inner1
    public void display() {
        Inner1 inner = new Inner1();  // create instance of private inner class
        inner.method();               // call its method
    }
}

class Main {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();  // create outer class object
        outer.display();              // indirectly access inner class
    }
}