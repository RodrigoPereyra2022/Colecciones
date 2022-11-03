/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Comparador {

    public static Comparator<String> ordenarAZ = new Comparator<String>() {
        @Override
        public int compare(String t, String t1) {
            return t.toLowerCase().compareTo(t1.toLowerCase());
        }
    };
}
