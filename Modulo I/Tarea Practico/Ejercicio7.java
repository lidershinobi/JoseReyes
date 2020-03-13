package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;


public class Ejercicio7 {
    static String resultado = "";
    
    
    public static void Principal(){
        
        for(int Mostrar=2; Mostrar<=100; Mostrar=Mostrar+2){
            resultado += Mostrar + "\n";
        }
    
    JOptionPane.showMessageDialog(null,resultado);
    }
    
    
    
}
