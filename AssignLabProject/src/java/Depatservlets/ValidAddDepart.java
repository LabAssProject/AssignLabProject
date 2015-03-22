/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Depatservlets;

import Impl.DepartImpl;
import Interfaces.DepartInt;
import Pojo.Department;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JETS_ITI
 */
public class ValidAddDepart extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GG</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GG at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
        String name = request.getParameter("name");
        String desc = request.getParameter("description");
        if (!name.trim().equals("") && !desc.trim().equals("")) {
            System.out.println("HHHHH");
            PrintWriter out = response.getWriter();
            DepartInt Obj = new DepartImpl();
            Department deprtObj = new Department();
            deprtObj.setName(name);
            deprtObj.setDescription(desc);
            deprtObj.setIsActive(0);
            List depts = null;
            depts = Obj.getDepartByName(deprtObj);
            if (depts.size() > 0) {
                System.out.println("HHHHH22");
                request.setAttribute("chName", "Name exist");
                RequestDispatcher dispatcher1 = request.getRequestDispatcher("/AddDepart.jsp");
                dispatcher1.forward(request, response);
            } else {
                deprtObj.setName(name);
                deprtObj.setDescription(desc);
                deprtObj.setIsActive(0);
                Obj.create(deprtObj);
                response.sendRedirect("SucessPage.jsp");
            }

        } else {
            System.out.println("HHHHH444");
            response.sendRedirect("AddDepart.jsp");
        }
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
        String name = request.getParameter("name");
        String Othername = request.getParameter("Othername");
        PrintWriter out = response.getWriter();
        DepartInt Obj = new DepartImpl();
        Department deprtObj = new Department();
        deprtObj.setName(name);
        List depts = null;
        if (Othername == null) {
            depts = Obj.getDepartByName(deprtObj);
        }
        if (depts.size() > 0) {
            out.println("Department exist"); // exit
        } else {
            out.println(""); // not exist
        }
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
