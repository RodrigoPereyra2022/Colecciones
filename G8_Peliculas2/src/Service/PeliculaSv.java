/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * Mostrar en pantalla todas las películas. • Mostrar en pantalla todas las
 * películas con unor) y mostrarlo en pantalla. • Ordenar las películas de
 * acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla. • Ordenar
 * las películas por título, alfabéticamente y mostrarlo en pantalla. • Ordenar
 * las películas por director, alfabéticamente y mostrarlo en pantalla.s
 */
public class PeliculaSv {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
 
    public Pelicula crearPelicula() {

        System.out.println("Ingrese el titulo de la película");
        String t = sc.next();
        System.out.println("ingrese el director de la película");
        String d = sc.next();
        System.out.println("ingrese la cantidad de horas que dura la película");
        Double h = sc.nextDouble();
        return new Pelicula(t, d, h);
    }

    public void Mostrar(ArrayList<Pelicula> pelcs) {
        for (Pelicula pelc : pelcs) {
            System.out.println(pelc);
        }
    }

    public void Mostraruh(ArrayList<Pelicula> pelcs) {
        pelcs.stream().filter((pelc) -> (1 < pelc.getTiempo())).forEachOrdered((pelc) -> {
            System.out.println(pelc);
        });
    }

    public void HMm(ArrayList<Pelicula> pelcs) {
        Collections.sort(pelcs, Comparador.paabajo);
        System.out.println("peliculas de mayor a menor (tiempo)");
        Mostrar(pelcs);
    }

    public void HmM(ArrayList<Pelicula> pelcs) {
        Collections.sort(pelcs, Comparador.paarriba);
        System.out.println("Películas de menor a mayor(tiempo)");
        Mostrar(pelcs);
    }

    public void DA(ArrayList<Pelicula> p) {
        Collections.sort(p, Comparador.directores);
        System.out.println("Directores ordenados alfabéticamente");
        Mostrar(p);
    }

    public void TA(ArrayList<Pelicula> pel) {
    Collections.sort(pel, Comparador.titulos);
        System.out.println("Títulos ordenados alfabéticamente");
    }
}
