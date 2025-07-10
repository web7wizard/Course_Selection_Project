import java.sql.*;
import java.util.Scanner;

class insert
{
public void inc() throws ClassNotFoundException,SQLException
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("\nlets select your elective subject for cm6k\n");
    System.out.print("enter the rollno : ");
    int roll=sc.nextInt();
    System.out.print("enter the name   : ");
    String name=sc.next();
    System.out.println("\nchoose any one course you have interest in, please dont press any wrong choice .");
    System.out.println("\n~~   1: Data Analytics   2: Cloud Computing   3: Advanced Computer Network   ~~\n");
    int ch=sc.nextInt();
    String CO="";
    if(ch==1)
    {  CO="Data Analytics"; } 
    
    if(ch==2)
    {  CO="Cloud Computing"; }  
   
    if(ch==3)
    {  CO="Advanced Computer Network"; }  
    
    
        System.out.println("\nCourse selection successful, rollno  "+roll+"  "+name+"  Hope you enjoy studying "+" ' "+CO+" ' \n");
        String url="jdbc:postgresql://localhost:5433/course";
        String user="postgres";
        String passward="1234";
                                                             
        try{
            Class.forName ("org.postgresql.Driver");
            Connection conn=DriverManager.getConnection(url, user, passward);
            String q="insert into course values(?,?,?)";
            PreparedStatement ps=conn.prepareStatement(q);
            ps.setInt(1,roll);
            ps.setString(2,name);
            ps.setString(3,CO);
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
