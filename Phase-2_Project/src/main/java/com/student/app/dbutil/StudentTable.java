package com.student.app.dbutil;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
import java.sql.*;  

public class StudentTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static Connection connection;
    public StudentTable() {
        super();
        // TODO Auto-generated constructor stub
    }
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
          {  
        	 
             PrintWriter out = res.getWriter();  
             res.setContentType("text/html");  
             out.println("<html><body>");  
             try 
             {  
                Class.forName("com.mysql.cj.jdbc.Driver");
         		String url="jdbc:mysql://localhost:3306/project";
         		String username="root";
         		String password="root";
         		connection=DriverManager.getConnection(url, username, password);
         		Statement stmt = connection.createStatement(); 
         	//	return connection;
         		
                 ResultSet rs = stmt.executeQuery("select * from student");
                 out.println("<h1>Student List</h1>");
                 out.println("<table border=1 width=30% height=30%>");  
                 out.println("<tr><th>Overall Student List</th><tr>");  
                 while (rs.next()) 
                 {  
                      
                     String nm = rs.getString("student_name");  
                     
                     out.println("<tr><td>" + nm + "</td></tr>");   
                 }  
                 out.println("</table>");  
                 out.println("</html></body>");  
                 connection.close();  
                }  
                 catch (Exception e) 
                {  
                 out.println("please solve the problem");  
             }  
         }  
     }  



