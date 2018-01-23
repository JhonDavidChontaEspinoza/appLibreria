/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Libro;

/**
 *
 * @author DS
 */
public interface LibroDAO {
    public String agregar(Libro libro);
    public String eliminar(int codLibro);
    public List<Libro> lstLibro();
}
