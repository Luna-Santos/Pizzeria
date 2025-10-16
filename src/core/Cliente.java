/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Luna
 */
public class Cliente {
    private String nombre;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        pedidos = new ArrayList<Pedido>();
    }
    
    public boolean addPedido(Pedido pedido){
        if(!this.pedidos.contains(pedido)){
            this.pedidos.add(pedido);
            return true;
        }
        return false;
        
    }

    public String getNombre() {
        return nombre;
    }
    
    public HashMap<String, Integer> getFrecuenciaPedidos(ArrayList<String> items){
        HashMap<String, Integer> frecuenciaItems = new HashMap<String, Integer>();
        
        //pone los items en una tabla, les pone fecuencia 0
        for (String item : items) {
            frecuenciaItems.put(item, 0);
        }
        
        for (Pedido ped : this.pedidos) {
            if(ped instanceof PedidoOnLine){
                for (Item i : ped.getItems()) {
                    frecuenciaItems.put(i.getNombre(), frecuenciaItems.get(i.getNombre()) + 1 );
                }
        }
        }
        
        return frecuenciaItems;
    }
}
    
    

