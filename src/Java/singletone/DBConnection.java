package Java.singletone;


//🔹 What is a Singleton Class?
//A Singleton ensures that only ONE object of a class is created in the entire JVM.
//        🔑 Key Rules
//Private constructor
//Private static instance
//Public static method to access instance

//Egar Initialization
public class DBConnection {
    private static DBConnection conObj =new DBConnection();
    private DBConnection(){} //outside classes can not create obj
    public static DBConnection getInstance(){
        return conObj;
    }
}

