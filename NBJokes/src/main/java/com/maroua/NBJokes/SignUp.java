package com.maroua.NBJokes;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	
      
    
    public SignUp( ) {
        super();
     
    }
    
	
	protected void doGet(HttpServletRequest Req, HttpServletResponse Res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  
	
	}

	
	protected void doPost(HttpServletRequest Req, HttpServletResponse Res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String name = Req.getParameter("First name");
		 String lastname = Req.getParameter("Last name");
		 String birthday = Req.getParameter("birthday");
		 String address = Req.getParameter("adress");
		 String city = Req.getParameter("city");
		 String email = Req.getParameter("email");
		 String pass1 = Req.getParameter("password1");
		 String zip = Req.getParameter("zip");
		 String pass2 = Req.getParameter("password2");
	     

	     try {
	    	   Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://127.0.0.1:3306/jeeproject_db?autoReconnect=true&serverTimezone=UTC&useSSL=False&allowPublicKeyRetrieval=true";
				String user="root";
				String password="Najatelfrougui789";
				Connection conn= DriverManager.getConnection(url, user, password);
				Statement stm= conn.createStatement();

				int i=stm.executeUpdate("INSERT INTO jeeproject_db.user ()  VALUES ('"+email.toLowerCase()+"','"+name+"','"+lastname+"','"+birthday+"','"+address+"','"+city+"','"+zip+"','"+pass1+"')");

				
	     }catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     
	  

		 

		
	}

}
