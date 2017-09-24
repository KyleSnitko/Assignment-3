package user;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


import data.UserDB;
import business.User;


public class NewCustomerServ extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
       
        
        String url = "/New_Customer.jsp";
        
        
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  
        }
        
        
        if (action.equals("join")) {
            url = "/New_Customer.jsp";    
        } 
        else if (action.equals("add")) {
            
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String num = request.getParameter("num");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zipcode = request.getParameter("zipCode");
            
            User user = new User(firstName, lastName, email, num, address, city,
                    state, zipcode);
            
                        
            String message;
            // validate
            if (UserDB.emailExists(user.getEmail())){
                message = "This email address alread exists.<br>" +
                          "Please enter antoher email address";
                url = "/New_Customer.jsp";           
            } 
           
            else {
                    
               request.setAttribute("username", String.format("%s%s", user.getLastName(), user.getZipCode()) );
                request.setAttribute("password", "welcome1");
                session.setAttribute("user", user);

                message = null;
                url = "/success.jsp";
                //insert user 
                UserDB.insert(user);
                
            }
            request.setAttribute("user", user);
            request.setAttribute("message", message);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    
      
        
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }  
    
}