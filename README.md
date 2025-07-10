# 📘 Course_Selection_Project – CM6K
this is a  simple core java based project that allows student to select and manage their academic courses..
this System helps simulation real life course registration like diploma or college environment
For Diploma CM6K we have elective subjecs to choose  1: Data Analytics   2: Cloud Computing   3: Advanced Computer Network
so in this application student can choose any one of above to learn and can also do changes  until last date .. 
Designed for use in a college course selection process, this system uses JDBC for database operations.

# 🚀 Features
- show list if you wanna select subject or wanna update or delete 
- after display all three course or subject list
- Accept student rollno and name to recognise
- Accept student course
- store data in the data base table (data - rollno,name,course)
- clean , interactive console interface

 # How to run
 -  📘 select what you want to do 
 -  📚 1 Select a course with roll number and name
 -  ✏️ 2 Update selected course, name, or roll number
 -  🗑️ 3 Delete incorrect data
 -  🔐 Data persistence via JDBC and SQL 
 -  📟 Simple and interactive console interface

 # 🛠️ Tool Used
 - java           -    jdk-24_windows-x64_bin  version for Coding support
 - Postgresql     -    for data manegment
 - vs code        -    editor to write code
 - JDBC           -    Jdbc driver for connection between java and postgresql 
 - Scanner        -    for console input
 - mavan          -    this is mavan project created via vs code

 # 📂 mavan dependancy

    <dependency>
              <groupId>org.postgresql</groupId>
              <artifactId>postgresql</artifactId>
              <version>42.7.7</version>
   </dependency>
        
 
 # 📂 Project Structure

    src/
     └── bmt/
                ├── App.java          # Main class with menu
                ├── insert.java       # Handles course selection
                ├── updateC.java      # Updates course
                ├── delete.java       # Updates/deletes roll number
                ├── updateR.java      # Updates roll number
                ├── updateN.java      # Updates name

 # 📂 Schema of table

    CREATE TABLE students (
                   rollno INT PRIMARY KEY,
                   name VARCHAR(100),
                   course VARCHAR(100) );

# ⚙️ requirement to run programme

- install java and any IDE
- Configure the database postgresql
- Create table
- do changes in code your username ad passward

#  📧 output
this is menu driven programme, 

             -------------------------------------------------------------------------------------------  
             -------------------------------------------------------------------------------------------   
            
             --------------------- wellcome to course selection programme for CM6K ---------------------
             please enter valid correct rollno name and course, subject cant be changed after deadline..
      
             -------------------------------------------------------------------------------------------  
             1:  select course  2:  update selected course                3:  update rollno  
             4:  update name    5:  i submit wrong data wanna delete it   6:  exit          

# 🙋‍♂️ Author                   
-    Name              -  javeriya jamadar
-    college           -  sesp 
- 📧 emil account     -  javeriyajamadar@gmail.com
- 🔗 GitHub Profile   -  web7wizard 






 
   

