package proyectoclase;

/**
 *
 * @author nelson
 */
public interface iHabitaciones
{
    final Float PRECIOMASCOTA=10f;
    final Float PRECIOHABITACION=30f;
    
    public abstract Float calcularPrecio();
    public abstract Float getPrecioMascota();
    public abstract Float getPrecioHabitacion();
}
