/*
Clase Cliente
*/

package proyectoclase;

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
  
  private final String TEXTO="data.fbi";//nombre archivo donde guardamos datos
  
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
    
    
    
}
