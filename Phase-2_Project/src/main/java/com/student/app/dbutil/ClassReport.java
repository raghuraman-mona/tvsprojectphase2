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
 * Servlet implementation class ClassReport
 */
public class ClassReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private static Connection connection;
    public ClassReport() {
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
   		
           ResultSet rs = stmt.executeQuery("select * from student where standard='6th'"); 
           //ResultSet rs1 = stmt.executeQuery("select * from student where standard='7th'"); 
          // out.println("input type='submit' name='6th'");
           out.println("<table border=1 width=30% height=30%>");  
           out.println("<tr><th>6th Student List:</th></tr>");  
           while (rs.next()) 
           {  
             
               String nm = rs.getString("student_name");  
                  
               out.println("<tr><td>" + nm + "</td></tr>");  
           }  
           out.println("</table>");  
           out.println("</html></body>");  
         
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
