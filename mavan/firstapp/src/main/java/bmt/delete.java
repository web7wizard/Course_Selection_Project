import java.sql.*;
import java.util.Scanner;

class delete
 {
 public void del() throws ClassNotFoundException,SQLException
  {
     Scanner sc=new Scanner(System.in);
    System.out.println("\nlets delete your imfo ..\n");
    System.out.print("enter the rollno : ");
    int roll=sc.nextInt();
    System.out.print("enter the name   : ");
    String name=sc.next();
    System.out.println("\nimfo deleted successful for rollno  "+roll+"  "+name+"  Hope you select correct next time "+" \n");

        String url="jdbc:postgresql://localhost:5433/course";
        String user="postgres";
        String passward="1234";

        try{
            Class.forName("org.postgresql.Driver");
            Connection conn=DriverManager.getConnection(url, user, passward);
            String q="delete from student where rollo=rollno";
            PreparedStatement ps=conn.prepareStatement(q);
            ps.executeUpdate();
            ps.close();
            conn.close();
        }

        catch(SQLException e)
        {
            System.out.println(e);
        }
        sc.close();
  }
 }

