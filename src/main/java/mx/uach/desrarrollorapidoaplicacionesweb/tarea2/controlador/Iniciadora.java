/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.desrarrollorapidoaplicacionesweb.tarea2.controlador;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import mx.uach.desrarrollorapidoaplicacionesweb.tarea2.dao.Conexion;
import mx.uach.desrarrollorapidoaplicacionesweb.tarea2.dao.ProductoDAO;
import mx.uach.desrarrollorapidoaplicacionesweb.tarea2.datos.Producto;

/**
 *
 * @author jesus
 */
public class Iniciadora {

    public static void main(String[] args) {
//        List<Producto> lista = new ArrayList();
//        String[] lista1 = {
//            "cotonetes",
//"desodorante en barra",
//"Tampones",
//"Papel higienico"
//        };
//        
//        for (String string : lista1) {
//            Producto p = new Producto();
//            p.setDecripcion(string);
//            lista.add(p);
//        }
//        
//        Pobladora.poblar(lista, "Sanitarios");
        
        ProductoDAO dao = new ProductoDAO();
        
        System.out.println("Número de productos con existencia mayor a 20.");
        System.out.println(dao.list()
                .stream().filter(p ->{ return p.getExistencias() > 20;})
                .count());
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Número de productos con existencia menos a 15");
        System.out.println(dao.list()
                .stream().filter(p ->{ return p.getExistencias() < 15;})
                .count());
        
        System.out.println("");
        System.out.println("");
        
        System.out.println
        ("Lista de productos con la misma clasificación y precio mayor 15.50");
        dao.list().stream().map(Producto::getClasificacion).distinct()
                .forEach(c -> { System.out.println("");
                    System.out.println(String.format("  Lista de %s", c));
                dao.list().stream().filter(p -> { return p.getClasificacion().equals(c);}  )
                        .filter(p -> { return p.getPrecio() > 15.50;})
                        .forEach(p ->{System.out.println(String.format("   %s", p));});});
        
        System.out.println("");
        System.out.println("");
        
        System.out.println
        ("Lista de productos con precio mayor a 20.30 y menor a 45.00");
        dao.list().stream().filter(p ->{ return p.getPrecio() > 20.30 && 
                        p.getPrecio() < 45;}).forEach(p -> {System.out.println(String.format("  %s", p));});
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Número de productos agrupados por su clasificación");
        dao.list().stream().map(Producto::getClasificacion).distinct()
                .forEach(c -> {
                    long n = dao.list().stream().filter(p ->{return p.getClasificacion().equals(c);}).count();
                    System.out.println(String.format("  Hay %s de %s", n, c));
                });
        
    }
}
