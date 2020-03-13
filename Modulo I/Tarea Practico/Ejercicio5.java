package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;


public class Ejercicio5 {
    static String Matriz[][] = new String[6][5];
    static String mensaje;
    static String mostrarMatrizFila = "";
    static String mostrarMatrizColumna = "";
    
    
    public static void Principal(){
        
        for(int Fila=1; Fila<=5; Fila++){
            for(int Columna=1; Columna<=4; Columna++){
                
                if(Columna == 1){mensaje = "Nombre";}
                if(Columna == 2){mensaje = "Apellido";}
                if(Columna == 3){mensaje = "Carrera";}
                if(Columna == 4){mensaje = "Lugar Trabajo";}
                
                Matriz[Fila][Columna] = JOptionPane.showInputDialog( "\n Fila "+Fila+" Columna "+Columna
                                                                    +"\n Ingrese El "+mensaje);
            
            }           
        }
        
        MostrarMatriz();
    }
    
    public static void MostrarMatriz(){
        
        for(int MostrarFila=1; MostrarFila<=5; MostrarFila++){
            for(int MostrarColumna=1; MostrarColumna<=4; MostrarColumna++){
                
                mostrarMatrizColumna += Matriz[MostrarFila][MostrarColumna]+ " ";
                
            }
            
          mostrarMatrizFila += MostrarFila + ") " + mostrarMatrizColumna + "\n"; 
          mostrarMatrizColumna = "";
        } 
        
        JOptionPane.showMessageDialog(null,mostrarMatrizFila); 
    }
    
}
