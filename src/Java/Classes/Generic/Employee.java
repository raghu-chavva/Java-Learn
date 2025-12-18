package Java.Classes.Generic;

public class Employee <K,V>{

     public void print(K emp, V empID){
         System.out.println("emp: "+emp+"EmpID:: "+empID);
     }

     public static void main(String[] args){
         Employee<String,Integer> empObj = new Employee<String,Integer>();
         empObj.print("raghu",1200);
         empObj.print("Dev",1300);

     }
}
