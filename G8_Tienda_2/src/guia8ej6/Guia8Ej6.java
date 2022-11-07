

package guia8ej6;

//@author Usuario

import Servicio.TiendaService;
import java.util.Scanner;


public class Guia8Ej6 {

    public static void main(String[] args) {
        int opcion;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        TiendaService ts = new TiendaService();
          do {
            System.out.println("Menu:");
            System.out.println("1 - cargar producto");
            System.out.println("2 - modificar precio");
            System.out.println("3 - eliminar producto");
            System.out.println("4 - mostrar lista");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    ts.agregar();
                    break;
                case 2:
                    ts.modificar();
                    break;
                case 3:
                    ts.eliminar();      
                    break;
                case 4:
                    ts.mostrar();
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
