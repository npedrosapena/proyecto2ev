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
    public void escribir(File ficheiro, ArrayList datosCliente)
    {
        ObjectOutputStream fich = null;
        try
        {
            
            fich = new ObjectOutputStream(new FileOutputStream(ficheiro));
            for(int i = 0; i < datosCliente.size(); i++)
            {
                fich.writeObject(datosCliente.get(i));
            }
        }catch(IOException ex)
        {
            System.out.println("Erro escritura" + ex.getMessage());
        }finally
        {
            if(fich != null)
            {
                try
                {
                    fich.close();                    
                }catch(IOException ex)
                {
                    System.out.println("Erro o pechar o ficheiro" + ex.getMessage());
                }

            }
        }
        
    }
    public static void leer(File ficheiro)
    {
        ObjectInputStream fich = null;
        try
        {
            fich = new ObjectInputStream (new FileInputStream (ficheiro));
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
