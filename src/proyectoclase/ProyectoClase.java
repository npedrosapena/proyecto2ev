/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoclase;

import java.io.*;

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
        // TODO code application logic here
        File fichero1 = new File("DatosPersonas.dat");
        File fichero2 = new File("EntradaSalida.dat");
        Menu menu = new Menu();
        menu.menu();
    }
    
}
