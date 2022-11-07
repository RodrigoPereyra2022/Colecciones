/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8_extra3_jugadores.Entidades;

/**
 *
 * @author Your Name <Rodrigo Pereyra>
 */
public class Jugadores {
    
    private String nombres;

    public Jugadores() {
    }

    public Jugadores(String nombres) {
        this.nombres = nombres;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombres=" + nombres + '}';
    }
    
    
    
}
