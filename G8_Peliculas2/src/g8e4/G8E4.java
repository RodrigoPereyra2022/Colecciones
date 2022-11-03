/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8e4;

import Service.PeliculaSv;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HJS Informatica
 */
public class G8E4 {

    /**
     * Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.s
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
       ArrayList <Pelicula> peliculas= new ArrayList();
       PeliculaSv sv= new PeliculaSv();
       do{
          peliculas.add(sv.crearPelicula());
           System.out.println("desea ingresar otra pelicula? (s/n)");
       }while(!sc.next().equalsIgnoreCase("n"));
        System.out.println("Peliculas:");
        sv.Mostrar(peliculas);
        sv.Mostraruh(peliculas);
        sv.HmM(peliculas);
        sv.HMm(peliculas);
        sv.DA(peliculas);
        sv.TA(peliculas);
    }
    
    
}
