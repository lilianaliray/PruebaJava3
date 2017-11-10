/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana1;
import javax.swing.*;
import java.awt.*;
/*****************************************************************
 *nombre:liliana hevia valenzuela
 * fecha:10-11-17
 * clase:pruebajava3
 * responsabilidad:
 * @author LAB04
 */
// paso 2 aca se heredar
public class  ventana1 extends JFrame 
{
  // Paso 3- declarar los elementos a utilizar
    JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton;
    JCheckBox ticket;
    JRadioButton elegir;
    
    //Paso 4-definir el constructor
    public ventana1()
    {
        
      //Paso 5- crear inicializa los objetos
       panel  = new JPanel();// creo un objeto tipo JPanel
       label = new JLabel();
       text = new JTextField(20);//20 es la cantidad de caracteres
       boton = new JButton();
       ticket = new JCheckBox();
       elegir = new JRadioButton();
       
        // Paso 6- agregar los elementos al JFrame
       this.add(panel);
       panel.add(label);
       panel.add(text);
       panel.add(boton);
       panel.add(ticket);
       panel.add(elegir);
       
        
        
     }
}

      