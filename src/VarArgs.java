public class VarArgs {
    public static void sum(int... numbers) {
        int total=0;
        for(int n:numbers) {
            total+=n;
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
     sum(1,2,3,4,5,6);
    }
}

