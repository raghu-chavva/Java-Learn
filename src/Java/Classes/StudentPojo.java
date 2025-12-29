package Java.Classes;

public class StudentPojo {

    private int age;
    private String name;
    private int studentID;

    public StudentPojo(){

    }
    public StudentPojo(int age, String name, int studentID){
        this.studentID =studentID;
        this.name=name;
        this.age=age;
    }

    //getter and setters
    public int getStudentID(){
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentPojo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", studentID=" + studentID +
                '}';
    }
}
