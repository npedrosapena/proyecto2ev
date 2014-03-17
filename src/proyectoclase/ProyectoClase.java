
package proyectoclase;

/**
 *
 * @author nelson
 */
public class ProyectoClase 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Habitacion hab = new Habitacion();
        Cliente cli=new Cliente();
      /*  
        System.out.println(hab.verNumeroHabitaciones());
        hab.habitacionesDespachadas(2, 'S');
        System.out.println(hab.verNumeroHabitaciones());
        System.out.println(hab.getMascotas());
        hab.datosHabitacion();
        System.out.println(hab.getMascotas());
        System.out.println(hab.getTipoHabitacion());
        System.out.println(hab.verNumeroHabitaciones());*/
        
        
        System.out.println(cli.recogerFecha());
        cli.tomaDatos();
        
    }
    
}
