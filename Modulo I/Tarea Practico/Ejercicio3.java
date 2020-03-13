package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;


public class Ejercicio3 {
    static int M = 6;
    static int T = 1;
    static int K = -5;
    static boolean validar1;
    static boolean validar2;
    static boolean validar3;
    static String resultado1;
    static String resultado2;
    static String resultado3;
    
    
    public static void Principal(){
    
        Validar();
        Convertir();
        
    JOptionPane.showMessageDialog(null,"\n M= 6 "
                                      +"\n T= 1 "
                                      +"\n K= -5 "
                                      +"\n-------------------------------------------"
                                      +"\n M > T = "+resultado1
                                      +"\n T / K == -5 = "+resultado2
                                      +"\n (M+T == 7) || (M-T == 5) = "+resultado3
                                      +"\n-------------------------------------------");
    }
    
    public static void Validar(){
        validar1 = M > T;
        validar2 = T / K == -5;
        validar3 = (M+T == 7) || (M-T == 5);
    }
    
    public static void Convertir(){
        resultado1 = String.valueOf(validar1);
        resultado2 = String.valueOf(validar2);
        resultado3 = String.valueOf(validar3);
    }
      
    
}



