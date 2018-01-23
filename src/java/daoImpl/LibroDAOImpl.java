/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import dao.LibroDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Libro;
import util.BDConexion;

/**
 *
 * @author DS
 */
public class LibroDAOImpl implements LibroDAO{

    Connection cn=BDConexion.getConnection();
    
    
    @Override
    public String agregar(Libro libro) {
        String mensaje="";
        try {
            String sql="Insert into TBLibro values(null,?,?,?,?)";
            PreparedStatement pstm=cn.prepareStatement(sql);
            
            pstm.setString(1, libro.getTitulo());
            pstm.setDate(2, libro.getFechaPublicacion());
            pstm.setDouble(3, libro.getPrecio());
            pstm.setInt(4, libro.getStock());
            
            pstm.executeUpdate();
            mensaje="Agregado";
            
        } catch (Exception e) {
            mensaje=e.toString();
        }
        return mensaje;
    }

    @Override
    public String eliminar(int codLibro) {
        String mensaje="";
        try {
            String sql="Delete from TBLibro where codigo=?";
            PreparedStatement pstm=cn.prepareStatement(sql);
            
            pstm.setInt(1, codLibro);
            
            pstm.executeUpdate();
            mensaje="Eliminado";
            
        } catch (Exception e) {
            mensaje=e.toString();
        }
        return mensaje;
    }

    @Override
    public List<Libro> lstLibro() {
        List<Libro> lstLibro=new ArrayList<>();
        try {
            String sql="Select * from TBLibro";
            PreparedStatement pstm=cn.prepareStatement(sql);
            ResultSet rs=pstm.executeQuery();
            
            while (rs.next()) {                
                int codigo=rs.getInt(1);
                String titulo=rs.getString(2);
                Date fechaP=rs.getDate(3);
                double precio=rs.getDouble(4);
                int stock=rs.getInt(5);
                
                Libro libro=new Libro(codigo, titulo, fechaP, precio, stock);
                lstLibro.add(libro);
            }
        } catch (Exception e) {
            e.toString();
        }
        return lstLibro;
                
    }
    
    
}
