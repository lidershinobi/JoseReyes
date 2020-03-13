package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class Main {

   
    public static void main(String[] args) {
        Estudiantes Datos = new Estudiantes();
        Datos.DarNombre("jose");
        Datos.DarEdad(26);
        Datos.DarCarrera("Computacion");
        
        IngenieriaComputacion Datos2 = new IngenieriaComputacion();
        
        
        JOptionPane.showMessageDialog(null,"\n Informacion Del Estudiante       "
                                          +"\n --------------------------------------"
                                          +"                                       "
                                          +"\n Nombre: "+Datos.ObtenerNombre()
                                          +"\n Edad: "+Datos.ObtenerEdad()
                                          +"\n Carrera: "+Datos.ObtenerCarrera()
                                          +"                                          "
                                          +"\n ---------------------------------------"
                                          +"\n Iformacion Carrera             "
                                          +"\n                                         "
                                          +"\n Carrera: "+Datos2.ObtenerNombreCarrera()
                                          +"\n Años: "+Datos2.ObtenerAños());
        
    }
    
}
