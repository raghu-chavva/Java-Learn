package Java.singletone;

public class Connection3 {
    private Connection3(){}
    private static class Connection3Helper{
        private static final Connection3 INSTANCE_OBJECT =new Connection3();
    }

    public static Connection3 getInstance(){
        return Connection3Helper.INSTANCE_OBJECT;
    }
}
//🧠 How it Works (MOST IMPORTANT)
//1️⃣ Class Loading Rule
//
//Outer class (DBConnection) loads first
//
//Inner class (SingletonHelper) does NOT load immediately
//
//2️⃣ Lazy Initialization
//
//SingletonHelper loads only when getInstance() is called
//
//JVM creates INSTANCE at that moment
//
//3️⃣ Thread Safety
//
//Class loading in JVM is thread-safe
//
//No need for synchronized