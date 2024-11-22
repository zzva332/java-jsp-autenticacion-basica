/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.sena.moduloauth.pages;

import com.sena.moduloauth.db.RepositorioUsuario;
import com.sena.moduloauth.models.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "RegistroServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

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
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
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
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        if(email == null || email.equals("")){
            request.setAttribute("errorMessage", "El email no puede ser vacio"); 
            processRequest(request, response);
            return;
        } else if(password == null || password.equals("")){
            request.setAttribute("errorMessage", "La clave no puede ser vacia"); 
            processRequest(request, response);
            return;
        }
        
        RepositorioUsuario repo = new RepositorioUsuario();
        Usuario user = repo.get(email, password);
        
        if(user == null){
            
            request.setAttribute("errorMessage", "Hubo un error"); 
            processRequest(request, response);
            return;
        }
        
        request.removeAttribute("errorMessage");
        
        HttpSession session = request.getSession();
        session.setAttribute("isLogged", "S");
        session.setAttribute("email", email);
        
        response.sendRedirect(request.getContextPath() + "/home");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
