package Java.singletone;

enum Connection4 {
    INSTANCE;
    public void connect(){
        System.out.println("Connected");
    }

}

class main{
    public static void main(String[] args){
        Connection4 con=Connection4.INSTANCE;
        con.connect();
    }
}