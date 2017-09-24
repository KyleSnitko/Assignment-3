
package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "password_reset", urlPatterns = {"/password_reset"})
public class password_reset extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {    };
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String newpass  = request.getParameter("newpass");
       String renewpass  = request.getParameter("renewpass");
       
       HttpSession session = request.getSession();
       String message = "";
       String url = "";
       
       
       // make sure that fields are filled out
        if(null != newpass && !newpass.equals(renewpass)){
            
            message = "Passwords must match";
            url = "/password_reset.jsp";
            
        }
                
        else
        {
            
            request.setAttribute("user", session.getAttribute("user"));
            session.setAttribute("password", renewpass);
            url = "/account_activity.jsp";
        }
        
        request.setAttribute("message", message);
        
    
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
