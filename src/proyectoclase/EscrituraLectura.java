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
 * @author Nelson & Carlos
 */
public class EscrituraLectura
{
    public void escribir(File fichero1, Cliente cliente)
    {
        PrintWriter fich = null;
        FileWriter f = null;
        try
        {
            f = new FileWriter (fichero1,true);
            fich = new PrintWriter(f);

            fich.println(cliente);
        }catch(IOException ex)
        {
            System.out.println("Erro de escritura" + ex.getMessage());
        }
        finally
        {
            if(fich != null)
            {
                fich.close();
            }
        }
       
    }
    public void leer(File fichero1)
    {
        
        
         Scanner sc = null;
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        try
        {
            sc = new Scanner(fichero1);
            while(sc.hasNext())
            {
                String cadea = sc.nextLine();
                String[] datos = cadea.split(",");
                Cliente p = new Cliente(datos[0],datos[1],datos[2],Integer.parseInt(datos[3]),datos[4],datos[5],datos[6],datos[7],datos[8],datos[9],Boolean.parseBoolean(datos[10]),datos[11],datos[12]);
                            //String nombre0, String apellidos1,String provincia2,Integer telefono3,String nacionalidad4, String dni5, String direccion6, String fechaEntrada7, String fechaSalida8,String formaPago9, Boolean mascota10, String sexo11,String codigoCliente12
                lista.add(p);
                  
            }
        }catch (Exception ex)
        {
            System.out.println("Error de lectura " + ex.getMessage());
            
        }finally
        {
            if(sc != null)
            {
                sc.close();
            }
        }
        for(int i = 0; i<lista.size(); i++)
        {
            System.out.println(lista.get(i));
        }
       
    }
                
}
