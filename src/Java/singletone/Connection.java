package Java.singletone;

//public class Connection {
//    private static Connection con;
//
//    private Connection(){}
//
//    public static Connection getInstance(){
//        if(con==null){
//           con=new Connection();// created only once
//        }
//        return con;
//    }
//}
//What is Lazy Initialization?
//
//The Singleton object is created only when it is needed (on first request) — not at class loading time.

// it is not thread safe if 2 threads come it will create 2 objeccts to prevent this we use synchronized method

public class Connection {
    private static Connection con;

    private Connection(){}

    public static synchronized Connection getInstance(){  //❌ Slower (method locking every call)
        if(con==null){
            con=new Connection();// created only once
        }
        return con;
    }
}