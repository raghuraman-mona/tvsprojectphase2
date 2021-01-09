package com.student.app.dbutil;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TeacherTable
 */
public class TeacherTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private static Connection connection;
    public TeacherTable() {
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
   		
           ResultSet rs = stmt.executeQuery("select * from teacher");  
           out.println("<table border=1 width=30% height=30%>");  
           out.println("<tr><th>Teachers List</th></tr>");  
           while (rs.next()) 
           {  
             
               String nm = rs.getString("teacher_name");  
                  
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






