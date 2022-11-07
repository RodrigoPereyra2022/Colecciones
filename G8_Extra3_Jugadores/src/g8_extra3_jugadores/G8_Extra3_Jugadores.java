package g8_extra3_jugadores;

//@author Your Name <Rodrigo Pereyra>
import g8_extra3_jugadores.Entidades.Jugadores;
import g8_extra3_jugadores.Servicios.JugadoresServicios;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class G8_Extra3_Jugadores {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        JugadoresServicios js = new JugadoresServicios();

       
        
         Set<String> lista = new HashSet();  
        
        int opcion;
        do {
             
            
            System.out.println("\tMenu ");
            System.out.println("1 - Crear jugador");
            System.out.println("2 - Mostrar lista de jugadores");
            System.out.println("3 - Opcion 3");
            System.out.println("4 - Opcion 4");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:                                    
                    
                    lista.add(js.crearJugador());
                    
                    break;
                case 2:
                    for (String aux : lista) {
                        System.out.println(aux);
                    }
                    break;
                case 3:
                    
                    break;
                case 4:
                    
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
