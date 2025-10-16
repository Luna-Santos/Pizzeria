/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Luna
 */
public class Pizzeria {
    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Item> items;
    private ArrayList<Pedido> pedidos;

    public Pizzeria() {
        nombre = new String();
        clientes = new ArrayList<Cliente>();
        items = new ArrayList<Item>();
        pedidos = new ArrayList<Pedido>();
    }
    
    public void addItem(Item item){
        this.items.add(item);
    }
    
    public void addCliente(Cliente client){
        this.clientes.add(client);
    }
    
    public void addPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }
    public Cliente getCliente(int index) {
        return this.clientes.get(index);
    }

    public Item getItem(int index) {
        return this.items.get(index);
    }

    
     public int calcProdMasVendidoCliente(int numCliente) {
        System.out.println("num_cliente = " + numCliente);
        
        ArrayList<String> itemsName = new ArrayList<>();
        for (Item item : this.items) {
            itemsName.add(item.getNombre());
        }
        
        HashMap<String, Integer> frecuenciaPedidos = this.clientes.get(numCliente).getFrecuenciaPedidos(itemsName);
        for (String name : itemsName) {
            System.out.println("El producto " + name + " se vendio " + frecuenciaPedidos.get(name));
        }
        
        if ((new ArrayList<>(frecuenciaPedidos.values())).stream().mapToInt(Integer::intValue).sum() > 0) {
            String itemName = Collections.max(frecuenciaPedidos.entrySet(), Map.Entry.comparingByValue()).getKey();
            for (Item item : this.items) {
                if (item.getNombre().equals(itemName)) {
                    return this.items.indexOf(item);
                }
            }
        }
        return -1;
    }

    
    

}
