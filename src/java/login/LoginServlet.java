// Kyle Snitko 2349076
package login;



import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class LoginServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String url = "/login.html";
        String message;
        String user = request.getParameter("userid");
        String pass = request.getParameter("pass");
        
        if(user.equals("jsmith@toba.com") && pass.equals("letmein"))
        {
            url = "/account_activity.jsp";
            message = "";
        }
        else    
        {
            url = "/login_failure.html";
            message = "";
        }
        request.setAttribute("message", url);
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

