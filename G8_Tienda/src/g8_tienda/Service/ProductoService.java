/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8_tienda.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    HashMap<String, Integer> productos = new HashMap();

    public void crearProductos() {

        String resp = "SI";
        while ("SI".equals(resp)) {

            System.out.println("Ingresar nombre del producto ");
            String nombre = leer.next().toLowerCase();
            if (productos.containsKey(nombre)) { //cheque si si se encuentra en el mapa
                System.out.println("ese producto ya existe");
            } else {
                System.out.println("ingresar precio");
                productos.put(nombre, leer.nextInt());
            }

            System.out.println("¿Deseas cargar otro producto?(Si/No)");
            resp = leer.next().toUpperCase();

        }
    }

    public void mostrarProductos() {

        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            String producto = entry.getKey();
            Integer precio = entry.getValue();
            System.out.println("producto = " + producto + " precio = " + precio);

        }

    }

    public void modificarPrecio() {
        System.out.println("ingrese el nombre del prodcucto a modicar precio");
        String nombre = leer.next().toLowerCase();
        if (productos.containsKey(nombre)) {
            System.out.println("ingresar el nuevo precio");
            productos.replace(nombre, leer.nextInt()); //metodo para sobreescribir
        } else {
            System.out.println("ese producto no esta en la lista");

        }

    }

    public void eliminarProducto() {
        System.out.println("ingrese el nombre del prodcucto a eliminar");
        String nombre = leer.next().toLowerCase();
        if (productos.containsKey(nombre)) {

            productos.remove(nombre); //metodo para eliminar
        } else {
            System.out.println("ese producto no esta en la lista");

        }
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("\tMenu ");
            System.out.println("1 - Cargar Producto 1");
            System.out.println("2 - Mostrar todos los productos");
            System.out.println("3 - Cambiar precios");
            System.out.println("4 - Eliminar productos");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    crearProductos();
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    modificarPrecio();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 5));
    }

}
