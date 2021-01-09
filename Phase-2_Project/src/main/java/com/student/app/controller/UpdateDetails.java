package com.student.app.controller;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.student.app.exception.BusinessException;
import com.student.app.model.User;
import com.student.app.service.StudentService;
import com.student.app.service.impl.StudentServiceImpl;
/**
 * Servlet implementation class UpdateDetails
 */
public class UpdateDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		User user=new User();
		String teachername=request.getParameter("teacher_name");
		String subjectname=request.getParameter("subject_name");
		StudentService studentService=new StudentServiceImpl();
		RequestDispatcher rd=null;
		try {
			if(studentService.isValidLoginCredentials(user)) {
				//navigate to success
				//rd=request.getRequestDispatcher("success");
				//rd.forward(request, response);
				HttpSession session=request.getSession();
				//.print("teachername"+teachername);
				
				session.setAttribute("teacher_name", user.getTeacher_name());
				response.sendRedirect("thankyou.html");
				
			}
		} catch (BusinessException e) {
			//communicate error to client
		//	rd=request.getRequestDispatcher("login.html");
		//	rd.include(request, response);
			//out.print("<center><span style='color:red;'>"+e.getMessage()+"</span></center>");
			rd=request.getRequestDispatcher("teacher.html");
			request.setAttribute("error", e.getMessage());
			rd.forward(request, response);
		}

	}
}


