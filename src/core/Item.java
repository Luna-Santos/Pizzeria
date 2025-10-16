/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author Luna
 */
public class Item {
    private int valor;
    private int id;
    private String nombre;

    public Item(String nombre, int valor) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
