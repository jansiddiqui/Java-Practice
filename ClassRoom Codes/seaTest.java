import java.io.*;
class Student implements Serializable {
    String name;
    int rollno;
    String branch;
    String college;

    public Student(String name, int rollno, String branch, String college) {
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
        this.college = college;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Branch: " + branch);
        System.out.println("College: " + college);
    }
}
public class seaTest {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 1, "CSE", "ABC College");
        try{
            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            System.out.println("Object serialized and saved to student.txt");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
    }
    
}
