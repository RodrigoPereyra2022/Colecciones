

package razaperros;

//@author Your Name <Rodrigo Pereyra>

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class RazaPerros {

    public static void main(String[] args) {
        
        /*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/
        
         ArrayList<String> razaPerros = new ArrayList();
         Iterator <String> iterador;
         String var=" ";
         Scanner leer = new Scanner(System.in);
        
        //ingresar razas
        do {           
            System.out.println("Ingrese una raza de perro.");
            razaPerros.add(leer.next());
            System.out.println("Desea ingresar otro perro(S/N)");
            var = leer.next();
        } while (var.equalsIgnoreCase("S"));
        
        //mostrar razas
        System.out.println("-----------------------------------------");
        System.out.println("total de razas cargadas "+razaPerros.size());
        for (String aux : razaPerros) {
           System.out.println(aux);
        }   
        
        /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
        
        //eliminar razas       
        System.out.println("-----------------------------------------");
        iterador = razaPerros.iterator();
        
        System.out.println("ingrese raz a aliminar ");
        String razaEliminada=leer.next();
        while(iterador.hasNext() ){
         if (iterador.next().equals(razaEliminada)) {
            iterador.remove();
            
        }
        
    }
        System.out.println("-----------------------------------------");
        System.out.println("quedan "+razaPerros.size()+" razas");
        for (String aux1 : razaPerros) {
            System.out.println(aux1);
        }
        
    }

}

        
        
        
    

