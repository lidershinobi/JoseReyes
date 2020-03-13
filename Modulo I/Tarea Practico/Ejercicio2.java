package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;

public class Ejercicio2 {
  static int Num1;
  static int Num2;
  static int suma;
  static int resta;
  static int multiplicar;
  static int dividir;
          
          
   public static void Matematicas(){
       String Entrada = JOptionPane.showInputDialog("Ingrese Primer Numero Entero");
       Num1 = Integer.parseInt(Entrada);
       
       String Entrada2 = JOptionPane.showInputDialog("Ingrese Segundo Numero Entero");
       Num2 = Integer.parseInt(Entrada2);
       
      Suma();
      Resta();
      Multiplicar();
      Dividir();
       
       JOptionPane.showMessageDialog(null, 
                                           "\n Num1= "+Num1
                                          +"\n Num2= "+Num2
                                          +"\n---------------------------------------------"   
                                          +"\n "+Num1+" + "+Num2+" ="        
                                          +"\n La Suma Total Es:  "+suma
                                          +"\n---------------------------------------------"
                                          +"\n "+Num1+" - "+Num2+" ="          
                                          +"\n La Resta Total Es:  "+resta
                                          +"\n---------------------------------------------" 
                                          +"\n "+Num1+" * "+Num2+" ="        
                                          +"\n La Multiplicacion Total Es:  "+multiplicar
                                          +"\n---------------------------------------------"   
                                          +"\n "+Num1+" / "+Num2+" ="        
                                          +"\n La Division total Es:  "+dividir
                                          +"\n---------------------------------------------");
   }
   
   public static void Suma(){
       suma = Num1+Num2;
   }
   
   public static void Resta(){
       resta = Num1-Num2;   
   }
   
   public static void Multiplicar(){
       multiplicar = Num1*Num2;
   }
   
   public static void Dividir(){
       dividir = Num1/Num2;
   }
   
   
  
  
}
