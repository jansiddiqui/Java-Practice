// You are using Java
// You are using Java
import java.sql.*;
import java.util.Scanner;
class JDBC{
    public static void main(String[] arg){
        String constr = "jdbc:mysql://localhost/ri_db";
        String user="test";
        String pwd= "test123";
        Scanner sc = new Scanner(System.in);
        
        
        try{
            Connection cn = DriverManager.getConnection(constr,user,pwd);
            Statement st = cn.createStatement();
            System.out.println("Statement Created");
            st.executeUpdate("create table Students(roll int, name varchar(15), cgpa int)");
            System.out.println("Table created");
            System.out.println("Enter the number of student: ");
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                int roll = sc.nextInt();
                sc.nextLine();
                String name = sc.nextLine();
                int cgpa = sc.nextInt();
                st.executeUpdate("insert into Students values(" + roll + ", '" + name + "', " + cgpa + ")");
            }
            System.out.println("Data Entered");
            ResultSet rs = st.executeQuery("Select * from Students");
            while(rs.next()){
                System.out.println("Student Roll number is "+rs.getInt(1)+" Name is "+rs.getString(2) + " and CGPA is "+rs.getInt(3)+".");
            }
            rs.close();
            st.close();
            cn.close();
        }catch(Exception e){
        }
        
    }
}