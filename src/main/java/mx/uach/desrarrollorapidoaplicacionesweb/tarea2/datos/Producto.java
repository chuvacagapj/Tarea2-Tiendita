/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.uach.desrarrollorapidoaplicacionesweb.tarea2.datos;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jesus
 */
public class Producto {
    
    public static final String TABLE = "productos";
    public static final String[] FIELD = {"id", "descripcion", "precio", 
        "clasificacion", "existencias", "existencias_maximas", 
        "existencias_minimas"};
    
    private Integer id;
    private String decripcion;
    private Float precio;
    private String clasificacion;
    private Integer existencias;
    private Integer existenciaMenor;
    private Integer existenciaMayor;
    
    public Producto(){}

    public Producto(Integer id, String decripcion, Float precio, 
            String clasificacion, Integer existencias, Integer existenciaMenor,
            Integer existenciaMayor) {
        
        this.id = id;
        this.decripcion = decripcion;
        this.precio = precio;
        this.clasificacion = clasificacion;
        this.existencias = existencias;
        this.existenciaMenor = existenciaMenor;
        this.existenciaMayor = existenciaMayor;
    }
    
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the decripcion
     */
    public String getDecripcion() {
        return decripcion;
    }

    /**
     * @param decripcion the decripcion to set
     */
    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    /**
     * @return the precio
     */
    public Float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    /**
     * @return the clacificacion
     */
    public String getClasificacion() {
        return clasificacion;
    }

    /**
     * @param clasificacion the clacificacion to set
     */
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * @return the existencias
     */
    public Integer getExistencias() {
        return existencias;
    }

    /**
     * @param existencias the existencias to set
     */
    public void setExistencias(Integer existencias) {
        this.existencias = existencias;
    }
    
    public static String fieldsToString(){
        String columnas = "";
        
        for (String string : FIELD) {
            columnas = String.format("%s, %s", columnas, string);
        }
        
        return columnas.replaceFirst(", ", "");
    }
    
    /**
     * @return the existenciaMenor
     */
    public Integer getExistenciaMenor() {
        return existenciaMenor;
    }

    /**
     * @param existenciaMenor the existenciaMenor to set
     */
    public void setExistenciaMenor(Integer existenciaMenor) {
        this.existenciaMenor = existenciaMenor;
    }

    /**
     * @return the existenciaMayor
     */
    public Integer getExistenciaMayor() {
        return existenciaMayor;
    }

    /**
     * @param existenciaMayor the existenciaMayor to set
     */
    public void setExistenciaMayor(Integer existenciaMayor) {
        this.existenciaMayor = existenciaMayor;
    }
    
    public String toString(){
        return String.format("%s %s %s %s %s %s %s", this.id, this.decripcion, 
                this.precio, this.clasificacion, this.existencias, 
                this.existenciaMayor, this.existenciaMenor);
    }
    
}
