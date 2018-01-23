/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;


import daoImpl.LibroDAOImpl;
import java.io.IOException;

import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Libro;

/**
 *
 * @author DS
 */
public class ServletLibro extends HttpServlet {

    LibroDAOImpl libroDAO=new LibroDAOImpl();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion=request.getParameter("accion");
        
        if (accion.equalsIgnoreCase("AgregarLibro")) {
            agregarLibro(request,response);
        }
        if (accion.equalsIgnoreCase("EliminarLibro")) {
            eliminarLibro(request,response);
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

    private void agregarLibro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            
            String titulo=request.getParameter("txtTitulo");
            
            SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date fecha=f.parse(request.getParameter("txtFP"));
            Date fechaSQL=new Date(fecha.getTime());
            
            double precio=Double.parseDouble(request.getParameter("txtPrecio"));
            int stock=Integer.parseInt(request.getParameter("txtStock"));
            
            Libro libro=new Libro(0, titulo, fechaSQL, precio, stock);
            String mensaje=libroDAO.agregar(libro);
            
            if (mensaje.equalsIgnoreCase("Agregado")) {
                String no="<script>alert('"+mensaje+"').window.location.href='./appLibreria18/frmAgregarLibro.jsp';</script>";
                request.setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("frmAgregarLibro.jsp").forward(request, response);
            } else {
                request.setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("frmAgregarLibro.jsp").forward(request, response);
            }
        } catch (Exception e) {
            request.setAttribute("mensaje", e);
            request.getRequestDispatcher("frmAgregarLibro.jsp").forward(request, response);
        }
    }

    private void eliminarLibro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int codigo=Integer.parseInt(request.getParameter("codigo"));
            Libro libro=new Libro();
            libro.setCodigo(codigo);
            
            String mensaje=libroDAO.eliminar(codigo);
            if (mensaje.equalsIgnoreCase("Eliminado")) {
                request.setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("frmListarLibro.jsp").forward(request, response);
            } else {
                request.setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("frmListarLibro.jsp").forward(request, response);
            }
        } catch (Exception e) {
            request.setAttribute("mensaje", e);
            request.getRequestDispatcher("frmListarLibro.jsp").forward(request, response);
        }
    }

}
