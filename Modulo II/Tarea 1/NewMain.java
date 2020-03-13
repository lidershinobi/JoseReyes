package com.mycompany.mavenproject1;
import Contenido.Guatemala;
import Contenido.Honduras;
import Contenido.Nicaragua;
import javax.swing.JOptionPane;

public class NewMain {

  
    public static void main(String[] args) {
        Ciudadano P = new Ciudadano();
        P.SetNombre("Jose Reyes");
        P.SetEdad(26);
        P.SetExperiencia(7);
        
        Guatemala G = new Guatemala();
        Honduras H = new Honduras();
        Nicaragua N = new Nicaragua();
        
        
        JOptionPane.showMessageDialog(null,"\n Nombre: "+P.GetNombre()
                                          +"\n Años: "+P.GetEdad()
                                          +"\n Experiencia: "+P.GetExperiencia()
                                          +"\n"
                                          +"\n Pais               Presidente"        
                                          +"\n"+G.getPais()+":   "+G.getPresidente()
                                          +"\n"+H.getPais()+":   "+H.getPresidente()
                                          +"\n"+N.getPais()+":   "+N.getPresidente());
        
        
    }
    
}
