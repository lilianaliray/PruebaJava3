/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana2;
// Paso 8- importar la clase con la ventana
import Ventana2.ventana2;// import paquete.clases
import javax.swing.JFrame;

/**************************************************************************
 * nombre:liliana hevia valenzuela
 * fecha:10-11-17
 * clase:pruebajava3
 * responsabilidad:
 *
 * @author LAB04
 */
public class ventana2 {
    public static void main(String[] args)
    {
         // TODO code application logic here
        //Paso 9- llamado a la clase JFrame
      
        ventana2 ventana2 = new ventana2();// crea un objeto tipo ventana2
        ventana2.setVisible(true);
        ventana2.setBounds(0, 0,600, 800);
        // la siguiente inst. le pone titulo a la ventana
        ventana2.setTitle("Mi primer interfaz grafica");
        // la siguiente sentencia es para finalizar el proyecto al cerrar
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}


    

