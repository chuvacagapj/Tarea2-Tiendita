/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.uach.desrarrollorapidoaplicacionesweb.tarea2.controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import mx.uach.desrarrollorapidoaplicacionesweb.tarea2.dao.ProductoDAO;
import mx.uach.desrarrollorapidoaplicacionesweb.tarea2.datos.Producto;

/**
 *
 * @author jesus
 */
public class Pobladora {
    public static void poblar( List<Producto> poblacion, String clacificacion ){
        Random r = new Random();
        ProductoDAO pdao = new ProductoDAO();
        poblacion.stream().forEach(p ->{
            float pr;
            List <Integer> h = new ArrayList();
            
            p.setClasificacion(clacificacion);
            h.add(r.nextInt(100) +1);
            h.add(r.nextInt(100) +1);
            h.add(r.nextInt(100) +1);
            h = h.stream().sorted().collect(Collectors.toList());
            pr = r.nextInt(200) /2.0f +1;
            p.setPrecio(pr);
            p.setExistenciaMenor(h.get(0));
            p.setExistencias(h.get(1));
            p.setExistenciaMayor(h.get(2));
            
            pdao.create(p);
            
        });
    }
}
