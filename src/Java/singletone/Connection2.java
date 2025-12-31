package Java.singletone;

public class Connection2 {
    private static volatile Connection2 conObj;
    private Connection2(){}

    public static Connection2 getInstance(){
        if(conObj==null){
            synchronized(Connection2.class){
                if(conObj==null){
                    conObj=new Connection2();
                }
            }
        }
        return conObj;
    }
}
