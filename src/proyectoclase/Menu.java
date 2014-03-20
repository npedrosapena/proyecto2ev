/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoclase;

import javax.swing.JOptionPane;

/**
 *
 * @author findag
 */
public class Menu
{
    Habitacion habitacion = new Habitacion();
    Cliente cliente = new Cliente();
    

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
            int seleccion = JOptionPane.showOptionDialog(null, "Tenemos disponibles en estos momentos: " + opcion+"\n"+habitacion.getHABITACIONSIMPLE()+" Simple\n"+habitacion.getHABITACIONDOBLE()+" Doble\n"+habitacion.getHABITACIONSUITE()+" Suite", "Nuevo cliente", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Si", "No","Cancelar"}, "Si");
            
            if (seleccion == 0)
            {
                cliente.tomaDatos();
            }
        }
        
        
    }
    public int verSalidas()
    {
        int opcion = 0;
        
        Object seleccion = JOptionPane.showInputDialog(null,"Hotel NPCP","Elija una opción",JOptionPane.QUESTION_MESSAGE,null, (Object[]) new Object[]{"Salidas en el dia", "Todas las salidas"}, "Salir");
        if (seleccion == "Salidas en el dia")
        {
            opcion = 1;
        }
        else if(seleccion == "Todas las salidas")
        {
            opcion = 0;
        }
        return opcion;
    }
    public void ofertas()
    {
        Object seleccion = JOptionPane.showInputDialog(null,"Hotel NPCP","Elija una opción",JOptionPane.QUESTION_MESSAGE,null, (Object[]) new Object[]{"Ofertas del mes", "Ofertas fidelidad"}, "Salir");
        if (seleccion == "Ofertas del mes")
        {
            
        }
        else if(seleccion == "Ofertas fidelidad")
        {
            
        }
        
    }
    public void policia()
    {
        /*int opcion = 0;
        Object seleccion = JOptionPane.showInputDialog(null,"Hotel NPCP","Elija una opción",JOptionPane.QUESTION_MESSAGE,null, (Object[]) new Object[]{"Enviar datos del clientes", "Datos de clientes sin enviar"}, "Salir");
        if(seleccion == "Enviar datos del clientes")
        {
            opcion = 1;
        }
        else if(seleccion == "Datos de clientes sin enviar")
        {
            opcion = 2;
            
        }
        return opcion;*/
            correo correo = new correo("mensaje",500,500);
            correo.mostrar();
    }
    public void conHabitaciones()
    {
    }
    
}
