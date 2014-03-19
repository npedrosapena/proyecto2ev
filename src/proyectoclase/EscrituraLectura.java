/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoclase;

import java.io.*;
import java.util.*;

/**
 *
 * @author findag
 */
public class EscrituraLectura
{
    public void escribir(File fichero1, Cliente cliente)
    {
        ObjectOutputStream fich = null;
        
        
        try
        {
            
            fich = new ObjectOutputStream(new FileOutputStream(fichero1));
           
            fich.writeObject(cliente.getNombre() + cliente.getApellidos() + cliente.getProvincia() + cliente.getTelefono() + cliente.getNacionalidad() + cliente.getDni() +cliente.getDireccion() + cliente.getFechaEntrada() + cliente.getFechaSalida() + cliente.getFormaPago() + cliente.getMascotas() + cliente.getSexo() + cliente.getCodigoCliente());

        }catch(IOException ex)
        {
            System.out.println("Error de escritura " + ex.getMessage());
        }finally
        {
            if(fich != null)
            {
                try
                {
                    fich.close();                    
                }catch(IOException ex)
                {
                    System.out.println("Error al cerrar el fichero" + ex.getMessage());
                }

            }
        }
        
    }
    public void leer(File fichero1)
    {
        ObjectInputStream fich = null;
        try
        {
            fich = new ObjectInputStream (new FileInputStream (fichero1));
            Cliente datos = (Cliente)fich.readObject();
            while(datos != null)
            {
                System.out.println(datos);
                datos = (Cliente)fich.readObject();
            }
        }catch(Exception e)
        {
            System.out.println("erro lectura" + e.getMessage());
            
        }
        
    }
}
