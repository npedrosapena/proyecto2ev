/*
clase Habitacion
 */

package proyectoclase;

/**
 *
 * @author nelson
 */

public class Habitacion
{
    //DECLARACIÓN VARIABLES
    
    private Boolean ocupado,mascotas;
    private Integer numeroHabitacion;
    private String tipoHabitacion,codigoHabitacion;
    private Float precio;
    
    //CONSTRUCTORES
    
    public Habitacion(){}
    public Habitacion(Integer numeroHabitacion,String tipoHabitacion, String codigoHabitacion, Float precio, Boolean ocupado, Boolean mascotas)
    {
        this.ocupado=ocupado;
        this.mascotas=mascotas;
        this.numeroHabitacion=numeroHabitacion;
        this.tipoHabitacion=tipoHabitacion;
        this.codigoHabitacion=codigoHabitacion;
        this.precio=precio;
    }
    
 
    //ZONA SETS

    /**
     * @param ocupado the ocupado to set
     */
    public void setOcupado(Boolean ocupado)
    {
        this.ocupado = ocupado;
    }

    /**
     * @param mascotas the mascotas to set
     */
    public void setMascotas(Boolean mascotas)
    {
        this.mascotas = mascotas;
    }

    /**
     * @param numeroHabitacion the numeroHabitacion to set
     */
    public void setNumeroHabitacion(Integer numeroHabitacion)
    {
        this.numeroHabitacion = numeroHabitacion;
    }

    /**
     * @param tipoHabitacion the tipoHabitacion to set
     */
    public void setTipoHabitacion(String tipoHabitacion)
    {
        this.tipoHabitacion = tipoHabitacion;
    }

    /**
     * @param codigoHabitacion the codigoHabitacion to set
     */
    public void setCodigoHabitacion(String codigoHabitacion)
    {
        this.codigoHabitacion = codigoHabitacion;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Float precio)
    {
        this.precio = precio;
    }
    
    
    //ZONA GETS

    /**
     * @return the ocupado
     */
    public Boolean getOcupado()
    {
        return ocupado;
    }

    /**
     * @return the mascotas
     */
    public Boolean getMascotas()
    {
        return mascotas;
    }

    /**
     * @return the numeroHabitacion
     */
    public Integer getNumeroHabitacion()
    {
        return numeroHabitacion;
    }

    /**
     * @return the tipoHabitacion
     */
    public String getTipoHabitacion()
    {
        return tipoHabitacion;
    }

    /**
     * @return the codigoHabitacion
     */
    public String getCodigoHabitacion()
    {
        return codigoHabitacion;
    }

    /**
     * @return the precio
     */
    public Float getPrecio()
    {
        return precio;
    }
    
    
}
