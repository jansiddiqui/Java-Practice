import java.io.*;

public class DeserializeStudent {
    public static void main(String[] args) {
        try {
            // Read from the file
            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Deserialize
            Student deserializedStudent = (Student) ois.readObject();

            // Close streams
            ois.close();
            fis.close();

            // Display the object data
            System.out.println("Object deserialized from student.txt");
            deserializedStudent.display();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
