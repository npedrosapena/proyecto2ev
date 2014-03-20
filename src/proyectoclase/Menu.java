/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoclase;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Nelson & Carlos
 */
public class Menu
{
    File fichero1 = new File("DatosPersonas.txt");
    Habitacion habitacion = new Habitacion();
    correo correos = new correo("titulo",500,500);
    Cliente cliente = new Cliente();
    EscrituraLectura insertar = new EscrituraLectura();
    

    public void menu()
    {
        
        int opcion = 0;
        int verifica =0;
        do
        {
            
        
            Object seleccion =  new Object[] { "Verificacion de habitaciones", "Ver salidas", "Comprobantes para la policía", "Ofertas disponibles", "Salir"};
            seleccion = JOptionPane.showInputDialog(null,"Hotel NPCP","Elija una opción",JOptionPane.QUESTION_MESSAGE,null, (Object[]) seleccion, "Salir");
        
            if(seleccion == "Verificacion de habitaciones")
            {
                opcion = 1;
            }
            else if (seleccion == "Ver salidas")
            {
                opcion = 2;
            }
            else if(seleccion == "Comprobantes para la policía")
            {
                opcion = 3;
            }
            else if(seleccion == "Ofertas disponibles")
            {
                opcion = 4;
            }
            else if (seleccion == "Salir")
            {
                opcion = 5;
            }
        
            switch (opcion)
            {
                case 1:
                {
                    this.verificar();
                    verifica = 1;
                    break;
                }
                case 2:
                {
                    this.verSalidas();
                    verifica = 1;
                    break;
                }
                case 3:
                {
                    this.policia();
                    verifica = 1;
                    break;
                }
                case 4:
                {
                    this.ofertas();
                    verifica = 1;
                    break;
                }
                case 5:
                {
                    System.out.println("Gracias ");
                    verifica = 0;
                    break;
                }
            }
        }while(verifica !=0);
    }
    public void verificar()
    {
        int opcion = habitacion.verNumeroHabitaciones();
        if(opcion == 0)
        {
            JOptionPane.showMessageDialog(null, "Los sentimos no quedan habitaciones disponibles");
            
        }
        else
        {
            int seleccion = JOptionPane.showOptionDialog(null, "Tenemos disponibles en estos momentos: " + opcion+"\n"+habitacion.getHABITACIONSIMPLE()+" Simple\n"+habitacion.getHABITACIONDOBLE()+" Doble\n"+habitacion.getHABITACIONSUITE()+" Suite", "Nuevo cliente", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Continuar", "Regresar","Cancelar"}, "Continuar");
            
            if (seleccion == 0)
            {

                cliente = cliente.tomaDatos();
                insertar.escribir(fichero1, cliente);
            }
        }
        
        
    }
    public void verSalidas()
    {
        insertar.leer(fichero1);
       
    }
    public void ofertas()
    {
    }
    public void policia()
    {

            correo correo = new correo("mensaje",500,500);
            correo.mostrar();

    }
}
