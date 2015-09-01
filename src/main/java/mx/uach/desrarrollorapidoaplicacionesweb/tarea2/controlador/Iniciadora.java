/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.uach.desrarrollorapidoaplicacionesweb.tarea2.controlador;

import java.sql.Connection;
import mx.uach.desrarrollorapidoaplicacionesweb.tarea2.dao.Conexion;

/**
 *
 * @author jesus
 */
public class Iniciadora {
    public static void main(String[] args) {
        Connection c = Conexion.getInstance().getConexion();
    }
}
