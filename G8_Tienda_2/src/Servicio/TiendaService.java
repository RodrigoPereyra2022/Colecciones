/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TiendaService {

    HashMap<String, Integer> tiendita = new HashMap();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void agregar() {
        String opc;
        do {
            Tienda t = new Tienda();
            System.out.println("ingrese un producto: ");
            t.setProducto(leer.next());
            System.out.println("ingrese el precio: ");
            t.setPrecio(leer.nextInt());
            tiendita.put(t.getProducto(), t.getPrecio());

            System.out.println("desea seguir agregando productos? s / n ");
            opc = leer.next();
        } while ("s".equalsIgnoreCase(opc));
    }

    public void modificar() {
        if (tiendita.isEmpty()) {
            System.out.println("la tienda esta vacía");
        } else {
            System.out.println("ingrese el nombre del prodcucto a modicar precio");
            String nombre = leer.next().toLowerCase();
            if (tiendita.containsKey(nombre)) {
                System.out.println("ingresar el nuevo precio");
                tiendita.replace(nombre, leer.nextInt()); //metodo para sobreescribir
            } else {
                System.out.println("ese producto no esta en la lista");

            }

        }
    }

    public void eliminar() {
        if (tiendita.isEmpty()) {
            System.out.println("la tienda esta vacía");
        } else {
            System.out.println("ingrese el nombre del producto a eliminar");
            String nombre = leer.next().toLowerCase();
            if (tiendita.containsKey(nombre)) {
                System.out.println("ingresar el nuevo precio");
                tiendita.remove(nombre); //metodo para borrar
            } else {
                System.out.println("ese producto no esta en la lista");

            }

        }
    }

    public void mostrar() {
        if (tiendita.isEmpty()) {     //retorna si esta vacia o no
            System.out.println("la tienda esta vacía");
        } else {
            for (Map.Entry<String, Integer> entry : tiendita.entrySet()) {
                System.out.println("producto: " + entry.getKey() + "\n $" + entry.getValue());

            }
        }
    }
}
