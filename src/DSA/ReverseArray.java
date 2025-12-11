package DSA;

public class ReverseArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int n=a.length;
        int i=0;
        int j=n-1;

        while(i<j){
            int temp =a[i];
            a[i]=a[j];
            a[j] = temp;

            i++; j--;
        }
        for (int x:a){
            System.out.println(x);
        }
    }
}

