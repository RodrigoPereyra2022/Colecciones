/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Tienda {
    private String producto;
    private Integer precio;

    public Tienda(String producto, Integer precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public Tienda() {
    }

    public String getProducto() {
        return producto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "producto=" + producto + ", precio=" + precio + '}';
    }
    
}
