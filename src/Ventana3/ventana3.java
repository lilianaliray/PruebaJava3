/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana3;
//PASO 10 - Necesario para conexion con MySQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**********************************************************************
 * nombre:liliana hevia valenzuela
 * fecha:10-11-17
 * clase:pruebajava3
 * responsabilidad:
 * @author LAB04
 */
public class ventana3 
{
     //PASO 11 - DECLARANDO OBJETOS PARA LA CONEXION
    private static Connection conex;//Objeto tipo Connection
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String URL = "jdbc:mysql://localhost:3306/conexion";
    
}
