import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class IOFile {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            FileOutputStream fos = new FileOutputStream("Jan.txt", true);
            fos.write(sc.nextLine().getBytes(), 3, 6);
            System.out.println("Data stored");


            FileInputStream fis = new FileInputStream("Jan.txt");
            int i = fis.read();
            while (i != -1) {
                System.out.print((char)i);
            }
        }catch(IOException e){
            System.out.println("Not Stored");
        }
    }
}
