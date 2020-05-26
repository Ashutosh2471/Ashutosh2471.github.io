package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Timestamp;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class imageServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet imageServlet</title>");
            out.println("</head>");
            out.println("<body>");
//            step2= index page se sara data yaha par aakar temporary variable me save ho jayega
            String name = request.getParameter("name");
            
            Part profileimage = request.getPart("file");
            
            String profileName = profileimage.getSubmittedFileName();
            
            
//            Step4= Ab Entities me ek User Defined data Type bana hoga.Jisme Constructor ke through step 2 ka data save kar dege
            Test t = new Test(name, profileName);

//           DAO object
//            step6=Ab last me Dao ke method ko yaha call karege aur use Entities ka data de dege
                testDAo dao=new testDAo(connectionProvider.getConnection());
                if (dao.savetest(t)) {
                out.println("Project Saved");
            } else {
                    out.println("Project Not saved");
            }
            

            out.println("</body>");
            out.println("</html>");
        }
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
