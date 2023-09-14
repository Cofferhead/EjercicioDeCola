/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase9sept;

/**
 *
 * @author felix
 */
public class Pedido {
    int cantidad;
    String nombre;

    public Pedido(int cantidad, String nombre) {
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }
    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString ()
    {
        String salida = "";
        salida += "Nombre: " + nombre + "\n";
        salida += "Número de productos: " + cantidad + "\n";
        return salida;
    }

}
