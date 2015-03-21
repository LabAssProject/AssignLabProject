/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets.trainee;

import DAO.GroupDAO;
import DAO.LabDAO;
import DAO.QueueDAO;
import pojo.Group;
import pojo.Lab;
import pojo.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sara
 */
public class TraineeServlet extends HttpServlet {

    

    public List<User> getDeliveryQueueUser(User u,Lab lab){        
        QueueDAO qd=new QueueDAO();
        return qd.getTraineeInDeliveryQueue(lab);
        
    }
    public List<User> getAssQueueUser(User u,Lab lab){
        QueueDAO qd=new QueueDAO();
        return qd.getTraineeInAssQueue(lab);
    }
    public List<Group> getGroups(User u){
        GroupDAO gd=new GroupDAO();
        return gd.selectUserGroups(u);
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
        //get current user from session
        User u =new User();//from session
        LabDAO ld=new LabDAO();       
        Lab lab=ld.getCurrentActiveLab(u);
        List<User> deliveryUsers=getDeliveryQueueUser(u,lab);
        List<User> assUsers=getAssQueueUser(u,lab);
        List<Group> groups=getGroups(u);
        //set all as variable on session
        //forward on main Trainee jsp view  
        //from jsp  use foreach get all lists from session and display it in view 
        
        /////////////////////
        
        
        
        
        
        
        //////////////////////////////
    }
}
