/*
Clase Cliente
*/

package proyectoclase;

import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author nelson
 */

public class Cliente
{
    // DECLARACIÓN DE VARIABLES
  private char sexo;
  private String nombre,apellidos,dni,direccion,codigoCliente,fechaEntrada,formaPago;
  private Integer telefono,contadorFidelidad;
  private Boolean mascotas;
  //nuevas variables de clase
  private String nacionalidad,provincia,fechaSalida;
  private String TEXTO="data.fbi";//nombre archivo donde guardamos datos
  
  //CONTRUCTORES
  
  public Cliente(){}
  public Cliente(String nombre, String apellidos, String dni, String direccion, String codigoCliente, String fechaEntrada, String formaPago)
  {
      this.nombre=nombre;
      this.apellidos=apellidos;
      this.dni=dni;
      this.direccion=direccion;
      this.codigoCliente=codigoCliente;
      this.fechaEntrada=fechaEntrada;
      this.formaPago=formaPago;
  }
  
  //ZONA SETS

  
    /**
     * @return the nacionalidad
     */
    public String getNacionalidad()
    {
        return nacionalidad;
    }

    /**
     * @return the provincia
     */
    public String getProvincia()
    {
        return provincia;
    }

    /**
     * @return the fechaSalida
     */
    public String getFechaSalida()
    {
        return fechaSalida;
    }
  
    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni)
    {
        this.dni = dni;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    /**
     * @param codigoCliente the codigoCliente to set
     */
    public void setCodigoCliente(String codigoCliente)
    {
        this.codigoCliente = codigoCliente;
    }

    /**
     * @param fechaEntrada the fechaEntrada to set
     */
    public void setFechaEntrada(String fechaEntrada)
    {
        this.fechaEntrada = fechaEntrada;
    }

    /**
     * @param formaPago the formaPago to set
     */
    public void setFormaPago(String formaPago)
    {
        this.formaPago = formaPago;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(Integer telefono)
    {
        this.telefono = telefono;
    }

    /**
     * @param contadorFidelidad the contadorFidelidad to set
     */
    public void setContadorFidelidad(Integer contadorFidelidad)
    {
        this.contadorFidelidad = contadorFidelidad;
    }

    /**
     * @param mascotas the mascotas to set
     */
    public void setMascotas(Boolean mascotas)
    {
        this.mascotas = mascotas;
    }
  
  
    //ZONA GETS

    /**
     * @return the sexo
     */
    public char getSexo()
    {
        return sexo;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos()
    {
        return apellidos;
    }

    /**
     * @return the dni
     */
    public String getDni()
    {
        return dni;
    }

    /**
     * @return the direccion
     */
    public String getDireccion()
    {
        return direccion;
    }

    /**
     * @return the codigoCliente
     */
    public String getCodigoCliente()
    {
        return codigoCliente;
    }

    /**
     * @return the fechaEntrada
     */
    public String getFechaEntrada()
    {
        return fechaEntrada;
    }

    /**
     * @return the formaPago
     */
    public String getFormaPago()
    {
        return formaPago;
    }

    /**
     * @return the telefono
     */
    public Integer getTelefono()
    {
        return telefono;
    }

    /**
     * @return the contadorFidelidad
     */
    public Integer getContadorFidelidad()
    {
        return contadorFidelidad;
    }

    /**
     * @return the mascotas
     */
    public Boolean getMascotas()
    {
        return mascotas;
    }

    /**
     * @return the TEXTO
     */
    public String getTEXTO()
    {
        return TEXTO;
    }
    
    
    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad)
    {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia)
    {
        this.provincia = provincia;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(String fechaSalida)
    {
        this.fechaSalida = fechaSalida;
    }

    /**
     * @param TEXTO the TEXTO to set
     */
    public void setTEXTO(String TEXTO)
    {
        this.TEXTO = TEXTO;
    }

    
    //zona programación
    
  @Override
    public String toString()
    {
        return (this.getNombre()+","
                +this.getApellidos()
                +","+this.getDni()
                +","+this.getDireccion()
                +","+this.getCodigoCliente()
                +","+this.getFechaEntrada()
                +","+this.getFormaPago()
                +","+this.getSexo()
                +","+this.getTelefono()
                +","+this.getContadorFidelidad());
    }
    
    /**
     *Devuelve una cadena con la fecha actual
     * 
     * @return 
     */
    public String recogerFecha()
    {
        Calendar fecha= Calendar.getInstance();
       
        return (fecha.get(Calendar.DATE)+"/"+fecha.get(Calendar.MONTH)+"/"+fecha.get(Calendar.YEAR));
    }
    
    public String codificado(String DNI)
    {
        Integer aleatorio=(int)Math.floor(Math.random()*50);
        return (DNI+aleatorio);
    }
    
    /**
     * Nos devuelve la fecha de salida
     * 
     * @return 
     */
    public String fechaSalida()
    {
        Calendar calendario=Calendar.getInstance();
        
        int valor=0;
        String fechaCadena;
        
        while(valor<=0)
        {
            valor=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca día", "Introducción datos cliente", JOptionPane.INFORMATION_MESSAGE));
            if ((valor<1 || valor>31)|| (valor<=calendario.get(Calendar.DAY_OF_MONTH)))
            {
                JOptionPane.showMessageDialog(null, "El valor introducido no es correcto", "Introducción datos cliente", JOptionPane.ERROR_MESSAGE);
                valor=-1;
            }
        }
        
        fechaCadena=valor+"/";
        valor=0;
        
        while(valor<=0)
        {
            valor=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca mes", "Introducción datos cliente", JOptionPane.INFORMATION_MESSAGE));
            if ((valor<1 || valor>12) || (valor<=calendario.get(Calendar.MONTH)))
            {
                JOptionPane.showMessageDialog(null, "El valor introducido no es correcto", "Introducción datos cliente", JOptionPane.ERROR_MESSAGE);
                valor=-1;
            }
        }
        
         fechaCadena=fechaCadena+valor+"/";
         valor=0;
         
         while(valor<=0)
        {
            valor=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca año (YYYY)", "Introducción datos cliente", JOptionPane.INFORMATION_MESSAGE));
            if (valor<calendario.get(Calendar.YEAR))
            {
                JOptionPane.showMessageDialog(null, "El valor introducido no es correcto", "Introducción datos cliente", JOptionPane.ERROR_MESSAGE);
                valor=-1;
            }
        }
         
         
         
        System.out.println(fechaCadena+valor);
        return fechaCadena+valor;
    }
    
    public void tomaDatos()
    {

        Object pago[] ={"Efectivo","Tarjeta"};
        Object mascotas[]={"Sí","No"};
        Object sexo[]={'V','F'};
        
        Integer formaPago;
        
        this.setNombre(JOptionPane.showInputDialog(null, "Introduzca nombre", "Introducción datos cliente", JOptionPane.INFORMATION_MESSAGE));
        this.setApellidos(JOptionPane.showInputDialog(null, "Introduzca apellidos", "Introducción datos cliente", JOptionPane.INFORMATION_MESSAGE));
        this.setProvincia(JOptionPane.showInputDialog(null, "Introduzca provincia", "Introducción datos cliente", JOptionPane.INFORMATION_MESSAGE));
        this.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca teléfono", "Introducción datos cliente", JOptionPane.INFORMATION_MESSAGE)));
        this.setNacionalidad(JOptionPane.showInputDialog(null, "Introduzca nacionalidad", "Introducción datos cliente", JOptionPane.INFORMATION_MESSAGE));
        this.setDni(JOptionPane.showInputDialog(null, "Introduzca dni", "Introducción datos cliente", JOptionPane.INFORMATION_MESSAGE));
        this.setDireccion(JOptionPane.showInputDialog(null, "Introduzca dirección", "Introducción datos cliente", JOptionPane.INFORMATION_MESSAGE));
        this.setFechaEntrada(this.recogerFecha());
        
        this.setFechaSalida(fechaSalida);
        
        formaPago=JOptionPane.showOptionDialog(null, " Tipo de pago", "Datos habitación", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, pago,null);
        this.setFormaPago((String) pago[formaPago]);
        
        //aprobecho la variable formaPago
        formaPago=JOptionPane.showOptionDialog(null, " Tipo de pago", "Datos habitación", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, mascotas,null);
        
        if (formaPago>0)
        {
            this.setMascotas(false);
        }else
        {
            this.setMascotas(true);
        }
        
        formaPago=JOptionPane.showOptionDialog(null, " Sexo ", "Datos habitación", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, sexo,null);
        
        if (formaPago>0)
        {
            this.setSexo('V');
        }else
        {
             this.setSexo('F');
        }
        
        this.setCodigoCliente(this.codificado(this.getDni()));
        
        
    }

}
