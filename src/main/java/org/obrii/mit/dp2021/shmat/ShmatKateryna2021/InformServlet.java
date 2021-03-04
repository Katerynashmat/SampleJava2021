/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.shmat.ShmatKateryna2021;

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
    
    Files dataCrud = new Files(new File(Extra.getFileName()));
//    FilesCrud CRUD = new FilesCrud(new File(Config.getFileName())

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
        
            if (Extra.getFileName().equals("")) {
            Extra.setFileName(this.getServletContext().getRealPath("") + "data.txt");
            dataCrud = new Files(new File(Extra.getFileName()));
        }
                
                if(request.getParameter("filter")!=null){
                request.setAttribute("data", dataCrud.filterData(request.getParameter("filter")));
                }
                else{
                request.setAttribute("data", dataCrud.readData());
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
            dataCrud.createData(
            new Data(
                    Integer.parseInt(request.getParameter("number")),
                    request.getParameter("name"),
                    request.getParameter("familyname"),
                    Integer.parseInt(request.getParameter("age")),
                    request.getParameter("email")
            ));
            doGet(request, response);
            
    }
    
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            int ownnumber = Integer.parseInt(request.getParameter("number"));
            dataCrud.updateData(ownnumber,
            new Data(
                    ownnumber,
                    request.getParameter("name"),
                    request.getParameter("familyname"),
                    Integer.parseInt(request.getParameter("age")),
                    request.getParameter("email")
            ));
            doGet(request, response);
    }
    
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int ownnumber = Integer.parseInt(request.getParameter("number"));
            dataCrud.deleteData(ownnumber);
                    
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