package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class Ejercicio6 {
    static String Nombre1;
    static String Nombre2;
    static String Nota1;
    static String Nota2;
    static String resultado1;
    static String resultado2;
    
    
    public static void Principal(){
               
        Nombre1 = JOptionPane.showInputDialog("Ingrese el Nombre Del Estudiante 1");
        Nota1 = JOptionPane.showInputDialog("Ingrese La Nota Del Estudiante ");
        
        Nombre2 = JOptionPane.showInputDialog("Ingrese el Nombre Del Estudiante 2");
        Nota2 = JOptionPane.showInputDialog("Ingrese La Nota Del Estudiante");

        ValidarNota();
        
        
        JOptionPane.showMessageDialog(null, "\nResultados Estudiantes"
                                           +"\n---------------------------------"
                                           +"\n "
                                           +"\n" + Nombre1 + " " + Nota1 + " " + resultado1
                                           +"\n" + Nombre2 + " " + Nota2 + " " + resultado2);
    }
    
    
    public static void ValidarNota(){
        int ValorNota1;
        int ValorNota2;
        
        ValorNota1 = Integer.parseInt(Nota1);
        ValorNota2 = Integer.parseInt(Nota2);
        
        if(ValorNota1 <70){
            resultado1 = "REPROBADO";
        }else{
            resultado1 = "APROBADO";
        }
        
        if(ValorNota2 <70){
            resultado2 = "REPROBADO";
        }else{
            resultado2 = "APROBADO";
        }        
    }
    
    
}
