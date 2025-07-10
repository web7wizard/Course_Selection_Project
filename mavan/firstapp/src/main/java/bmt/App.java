package bmt;
import java.sql.*;
import java.util.Scanner;

public class App 
{
  public static void main(String args[]) throws ClassNotFoundException,SQLException
  {
    
    Scanner sc=new Scanner(System.in);
    insert i=new insert();
    updateC u=new updateC();
    delete d=new delete();
    updateR r=new updateR();
    updateN n=new updateN();

    int ch=0;
    System.out.println("-------------------------------------------------------------------------------------------");  
    System.out.println("-------------------------------------------------------------------------------------------\n");   
    System.out.println("--------------------- wellcome to course selection programme for CM6K ---------------------\n");
    System.out.println("please enter valid correct rollno name and course, subject cant be changed after deadline..\n");
    while(ch!=6)
    { 
      
      System.out.println("-------------------------------------------------------------------------------------------\n");   
      System.out.println("1:  select course  2:  update selected course                3:  update rollno  \n");
      System.out.println("4:  update name    5:  i submit wrong data wanna delete it   6:  exit           \n");
      ch=sc.nextInt();
      switch(ch)
      {
        case 1:
               i.inc(); break;
        case 2:
               u.upd(); break;
        case 3:
               d.del(); break;
        case 4:
               r.updr(); break;
        case 5:
               n.updn(); break;
        case 6:
               System.out.println("no issue come next time when you decide  your priority ~~~ \n");
      }
    }
     
  }
  
} 







 

 



