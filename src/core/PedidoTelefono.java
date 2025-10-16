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
public class PedidoTelefono extends Pedido{
    private String telefono;

    public PedidoTelefono(Cliente cliente,String telefono, ArrayList<Item> items) {
        super(cliente, items);
        this.telefono = telefono;
    }
    
    
}
