package cgwapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cgwapp.model.LoginModel;
import cgwapp.repository.DBParent;
import cgwapp.service.ValidateEmployeeServiceImpl;


@WebServlet("/EmpController")
public class ValidateEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String path=request.getServletContext().getRealPath("/").concat("resources//db.properties");
		PrintWriter out=response.getWriter();
		DBParent.path=path;
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		
		LoginModel model=new LoginModel();
		model.setUserName(uname);
		model.setUserPass(pass);
		
		ValidateEmployeeServiceImpl eservice=new ValidateEmployeeServiceImpl();
		
		if(eservice.isValidateEmp(model)) {
			
			RequestDispatcher rd=request.getRequestDispatcher("MainAdmin.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("loginFailed.jsp");
			rd.forward(request, response);
		}
		
		out.println(path);
	}

}
