/*
clase Habitacion
 */

package proyectoclase;

import javax.swing.JOptionPane;

/**
 *
 * @author nelson
 */

public class Habitacion
{
    //DECARACIÓN DE VARIABLES GLOBALES
    
    private static Integer HABITACIONES=20;
    private static Integer HABITACIONESOCUPADAS=5;//variable que se irá cambiando según clientes en el hotel

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
    
     /**
     * @param aHABITACIONES the HABITACIONES to set
     */
    public static void setHABITACIONES(Integer aHABITACIONES)
    {
        HABITACIONES = aHABITACIONES;
    }

    /**
     * @param aHABITACIONESOCUPADAS the HABITACIONESOCUPADAS to set
     */
    public static void setHABITACIONESOCUPADAS(Integer aHABITACIONESOCUPADAS)
    {
        HABITACIONESOCUPADAS = aHABITACIONESOCUPADAS;
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
    
    /**
     * @return the HABITACIONES
     */
    public static Integer getHABITACIONES()
    {
        return HABITACIONES;
    }
    
    /**
     * @return the HABITACIONESOCUPADAS
     */
    public static Integer getHABITACIONESOCUPADAS()
    {
        return HABITACIONESOCUPADAS;
    }
    
  
    //ZONA FUNCIONES
    
    
    
  /**
   * Método que devuelve el número de habitaciones que tiene el hotel
   * disponibles 
   * 
   * @return número habitaciones
   */
    public Integer verNumeroHabitaciones()
    {
        return (getHABITACIONES()-getHABITACIONESOCUPADAS());
    }
    
    /**
     * Método que devuelve el tipo de habitación
     * 
     * @return tipo de habitación
     */
    public String verTipoHabitacion()
    {
        return this.getTipoHabitacion();
    }
    
    /**
     *Aumentamos/disminuimos el número de habitaciones alquiladas.
     *Para controlas eso le pasamos en modo una 'S'(sumar), cualquier otro caracter
     *se tomará como resta.
     * 
     * @param numeroHabitacionesRestar número de habitaciones en las que alojamos los clientes
     * @param modo indica el modo sumar/restar
     */
    public void habitacionesDespachadas(Integer numeroHabitacionesRestar, char modo)
    {
        if(modo=='S')
        {
            setHABITACIONESOCUPADAS(getHABITACIONESOCUPADAS()+numeroHabitacionesRestar);
        }else
        {
            setHABITACIONESOCUPADAS(getHABITACIONESOCUPADAS()-numeroHabitacionesRestar);
        }
    }
    
    /**
     * Se introducen los datos de la habitación
     */
    public void datosHabitacion()
    {
        Integer opcion=0;
        
        //declaración mensaje botones personalizados
        String simple = "Simple"; //Aqui puede ir cualquier nombre
        String doble = "Doble";
        String suite ="Suite";
        Object options[] ={simple,doble,suite};
        
        this.setCodigoHabitacion(JOptionPane.showInputDialog(null,"Introduzca código de habitación: ","Datos habitación",JOptionPane.INFORMATION_MESSAGE));
        
        opcion=JOptionPane.showConfirmDialog(null, "animales?","Datos",JOptionPane.YES_NO_OPTION);
            
        if(opcion<1)
            {
                this.setMascotas(true);
            }else
            {
                this.setMascotas(false);
            }
        
        this.setNumeroHabitacion(Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de habitación","Datos habitación",JOptionPane.INFORMATION_MESSAGE)));
        
        switch(JOptionPane.showOptionDialog(null, " Tipo de habitación", "Datos habitación", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, simple))
        {
            case 0:this.setTipoHabitacion("simple");
                break;
            case 1: this.setTipoHabitacion("doble");
                break;
            case 2: this.setTipoHabitacion("suit");
                break;
        }
        
        this.setPrecio(Float.parseFloat(JOptionPane.showInputDialog(null,"precio","Datos habitación",JOptionPane.INFORMATION_MESSAGE)));
        
        //sumamos una habitación ocupada
        this.habitacionesDespachadas(1, 'S');
    }
    
    
    
    
}
