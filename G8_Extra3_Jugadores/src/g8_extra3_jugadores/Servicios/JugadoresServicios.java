
package g8_extra3_jugadores.Servicios;

import g8_extra3_jugadores.Entidades.Jugadores;
import java.util.Scanner;



public class JugadoresServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    
    public Jugadores crearJugador(){
        Jugadores j1= new Jugadores();
        
        System.out.println("Ingresar nombre");
        j1.setNombres(leer.next());
        
        return j1;
        
    }
}
