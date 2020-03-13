package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class Ejercicio4 {
   static String Nombres[] = new String[11];
   static String resultado ="";

    public static void Principal(){
        
       for(int Ingresar=1; Ingresar<=10; Ingresar++){
              Nombres[Ingresar] = JOptionPane.showInputDialog("Ingrese El Nombre "+Ingresar);    
       }  
       
       MostrarArreglo();  
    }
    
    public static void MostrarArreglo(){
       
         for(int Mostrar=1; Mostrar<=10; Mostrar++){
             resultado += Mostrar+ " " +Nombres[Mostrar] + "\n";
         }

         JOptionPane.showMessageDialog(null,resultado);       
    }
    
    
    
}
