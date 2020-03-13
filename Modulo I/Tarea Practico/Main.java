package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;


public class Main {
    static String Elejir;
    static int Elejir2;
    
    
    
    public static void main(String[] args) {
      
        for(int R=0; R<=1; R++){
            
            Elejir = JOptionPane.showInputDialog("\n Elija Una Opcion"
                                                 +"\n 1 Imprimir Mensaje"
                                                 +"\n 2 Operaciones Aritméticas"
                                                 +"\n 3 Evaluacion Verdadero o Falso"
                                                 +"\n 4 Arreglo 10 Nombres"
                                                 +"\n 5 Matriz 5 Registros"
                                                 +"\n 6 Nota Estudiante"
                                                 +"\n 7 Ciclo 2 al 100"
                                                 +"\n 0 Salir");
            
        Elejir2 = Integer.parseInt(Elejir);
        if(Elejir2 == 1){Ejercicio1.Mensaje(); R=0;}
        if(Elejir2 == 2){Ejercicio2.Matematicas(); R=0;}
        if(Elejir2 == 3){Ejercicio3.Principal(); R=0;}
        if(Elejir2 == 4){Ejercicio4.Principal(); R=0;}
        if(Elejir2 == 5){Ejercicio5.Principal(); R=0;}
        if(Elejir2 == 6){Ejercicio6.Principal(); R=0;}
        if(Elejir2 == 7){Ejercicio7.Principal(); R=0;}
        if(Elejir2 == 0){R=1;}
        }
    }
    
}
