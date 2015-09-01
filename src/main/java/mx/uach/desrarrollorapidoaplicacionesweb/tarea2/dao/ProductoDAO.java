/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.uach.desrarrollorapidoaplicacionesweb.tarea2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.uach.desrarrollorapidoaplicacionesweb.tarea2.datos.Producto;

/**
 *
 * @author jesus
 */
public class ProductoDAO implements Crud <Producto>{

    @Override
    public List<Producto> list() {
        List<Producto> lista = new ArrayList();
        try{
            Statement st = Conexion.getInstance().getConexion()
                    .createStatement();
            ResultSet rs = st.executeQuery(String.format
        ("SELECT %s FROM %s;", Producto.fieldsToString(), Producto.TABLE));
            
            while (rs.next()) {
                Integer id = rs.getInt(Producto.FIELD[0]);
                String decripcion = rs.getNString(Producto.FIELD[1]);
                Float precio = rs.getFloat(Producto.FIELD[2]);
                String clasificacion = rs.getNString(Producto.FIELD[3]);
                Integer existencias = rs.getInt(Producto.FIELD[4]);
                Integer existenciaMenor = rs.getInt(Producto.FIELD[5]);
                Integer existenciaMayor = rs.getInt(Producto.FIELD[6]);
                
                Producto p = new Producto(id, decripcion, precio, clasificacion,
                        existencias, existenciaMenor, existenciaMayor);
                lista.add(p);
            }
        }catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }

    @Override
    public void create(Producto t) {
        
    }

    @Override
    public void update(Producto t) { //TODO Esta funcionalidad
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Integer id) { //TODO Esta funcionalidad
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
