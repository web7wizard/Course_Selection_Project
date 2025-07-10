import java.sql.*;
import java.util.Scanner;

class updateR
{
public void updr() throws ClassNotFoundException,SQLException
  {
     Scanner sc=new Scanner(System.in);
    System.out.println("\nlets update your rollno for cm6k\n");
   // System.out.print("enter the rollno : ");
   // int roll=sc.nextInt();
    System.out.print("enter the name   : ");
    String nam=sc.next();
    System.out.println("\nchoose any one course you have interest in, please dont press any wrong choice  .");
    System.out.println("\n~~   1: Data Analytics   2: Cloud Computing   3: Advanced Computer Network   ~~\n");
    
    int ch=sc.nextInt();
    String CO="";
    if(ch==1)
    {  CO="Data Analytics"; } 
    
    if(ch==2)
    {  CO="Cloud Computing"; }  
   
    if(ch==3)
    {  CO="Advanced Computer Network"; }  

     System.out.print("enter correct rollno : ");
     int roll=sc.nextInt();
    
    System.out.println("\nCourse selection successful, rollno  "+roll+"  "+nam+"  Hope you enjoy studying "+" ' "+CO+" ' \n");

        String url="jdbc:postgresql://localhost:5433/course";
        String user="postgres";
        String passward="1234";

        try{
            Class.forName("org.postgresql.Driver");
            Connection conn=DriverManager.getConnection(url, user, passward);
            String q="update student set rollo=roll where name=nam";
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
