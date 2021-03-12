/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.shmat.ShmatKateryna2021;

import org.obrii.mit.dp2021.shmat.ShmatKateryna2021.dao.Dao;
import org.obrii.mit.dp2021.shmat.ShmatKateryna2021.dao.DaoFactory;
import org.obrii.mit.dp2021.shmat.ShmatKateryna2021.dao.UserDao;
import org.obrii.mit.dp2021.shmat.ShmatKateryna2021.dao.impl.UserDaoImpl;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class InformServlet extends HttpServlet {
    UserDao userDao = DaoFactory.createUserDao();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 
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

        if (request.getParameter("filter") != null && !request.getParameter("filter").equals("")) {
            System.out.println("." + request.getParameter("filter") + ".");
            request.setAttribute("data", userDao.filterByLogin(request.getParameter("filter")));
        } else {
            request.setAttribute("data", userDao.findAll());
        }
        request.getRequestDispatcher("Lab3.jsp").forward(request, response);
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
        Data data = new Data();
        data.setNumber(Integer.parseInt(request.getParameter("number")));
        data.setName(request.getParameter("name"));
        data.setFamilyname(request.getParameter("familyname"));
        data.setAge(Integer.parseInt(request.getParameter("age")));
        data.setEmail(request.getParameter("email"));
        userDao.create(data);
            doGet(request, response);
            
    }
    
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Data data = new Data();
        data.setNumber(Integer.parseInt(request.getParameter("number")));
        data.setName(request.getParameter("name"));
        data.setFamilyname(request.getParameter("familyname"));
        data.setAge(Integer.parseInt(request.getParameter("age")));
        data.setEmail(request.getParameter("email"));
        System.out.println(data);
        userDao.update(data);
        doGet(request, response);
    }
    
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int ownnumber = Integer.parseInt(request.getParameter("number"));
        userDao.delete(ownnumber);

        doGet(request, response);

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