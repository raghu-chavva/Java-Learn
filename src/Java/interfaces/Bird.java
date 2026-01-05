package Java.interfaces;

public interface Bird {
    int LEGS=2;// implicitly public static and final
    public void fly();
    default int getMinimumHeight(){
        return 1000;
    }
    // 3️⃣ Static method (public) we can't call using object
    static void category() {
        System.out.println("Birds are animals");
    }

    // 4️⃣ Private method (Java 9+)
    private void sleep() {
        System.out.println("Bird is sleeping");
    }

    // private method used inside default method
    default void rest() {
        sleep();
    }

}
