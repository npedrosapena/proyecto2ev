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
public class Escribir
{
    public static void escribir(File ficheiro, ArrayList datosCliente)
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
}
