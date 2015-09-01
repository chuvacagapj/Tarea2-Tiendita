package mx.uach.desrarrollorapidoaplicacionesweb.tarea2.dao;

import java.util.List;

/**
 *
 * @author User1
 */
public interface Crud <T>{
    
    public List<T> list();
    
    public void create(T t);
    
    public void update(T t);
    
    public void eliminar(Integer id);
}
