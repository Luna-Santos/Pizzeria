/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author Luna
 */
public class PedidoOnLine extends Pedido{
    private String email;

    public PedidoOnLine(Cliente cliente,String email,  ArrayList<Item> items) {
        super(cliente, items);
        this.email = email;
    }
    
    
}
