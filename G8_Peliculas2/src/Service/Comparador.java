/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * Mostrar en pantalla todas las películas. • Mostrar en pantalla todas las
 * películas con una duración mayor a 1 hora. • Ordenar las películas de acuerdo
 * a su duración (de mayor a menor) y mostrarlo en pantalla. • Ordenar las
 * películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
 * pantalla. • Ordenar las películas por título, alfabéticamente y mostrarlo en
 * pantalla. • Ordenar las películas por director, alfabéticamente y mostrarlo
 * en pantalla.s
 */
public class Comparador {

    public static Comparator<Pelicula> paabajo = (Pelicula t, Pelicula t1) -> t1.getTiempo().compareTo(t.getTiempo());
    public static Comparator<Pelicula> paarriba = (Pelicula t, Pelicula t1) -> t.getTiempo().compareTo(t1.getTiempo());
     public static Comparator<Pelicula> directores = (Pelicula t, Pelicula t1) -> t.getDirec().compareToIgnoreCase(t1.getDirec());
     public static Comparator<Pelicula> titulos = (Pelicula t, Pelicula t1) -> t.getTitulo().compareToIgnoreCase(t1.getTitulo()); 
}
