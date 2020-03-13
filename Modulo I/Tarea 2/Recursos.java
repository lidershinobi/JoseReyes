package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

public class Recursos {
     private static String Mensaje = "Estoy aprendiendo, pero seré el mejor programador del mundo";
     private static int X;
     private int division;
     private int Repetir=0;


public String UnMemsaje(){
    JOptionPane.showMessageDialog(null, Recursos.Mensaje);
    
    return Mensaje;
}


public int CalcularPromedio(){
    String Ingresar = JOptionPane.showInputDialog("Ingrese Nota");
    X = Integer.parseInt(Ingresar);
    
    if(X >= 70){
        JOptionPane.showMessageDialog(null, "Aprobado");
    }else{
        JOptionPane.showMessageDialog(null, "Reprobado");
    }
    
    return X;
}

public int Division(){
    String Nominador = JOptionPane.showInputDialog("Ingrese Numero 1 Entero");
    int N = Integer.parseInt(Nominador);
    
    String Denominador;
    int D=0;
    
    for(int R=0; R<=1; R++){
         
    Denominador = JOptionPane.showInputDialog("Ingrese Numero 2 Entero");
    D = Integer.parseInt(Denominador);
 
    if(D == 0){
        JOptionPane.showMessageDialog(null,"Ingrese Un Entero que No Sea 0");
        R=0;
    }else{R=1;}}
    
    division = N/D;
    
    JOptionPane.showMessageDialog(null, "\n Resultado Division"
                                       +"\n"+ N +" / "+ D +"= " +division);
 
    return division;
}

public int Repeticion(){
    String Dato = JOptionPane.showInputDialog("Ingrese un Numero");
    Repetir = Integer.parseInt(Dato);
    
    String MostrarVista="";
    
for(int R=0; R<=Repetir; R++){  
    MostrarVista += R+"\n";
}

JOptionPane.showMessageDialog(null,"\n"+MostrarVista); 

return Repetir;
}


}