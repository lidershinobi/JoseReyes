package com.mycompany.mavenproject1;


public class Ciudadano {
    private String Nombre;
    private int Edad;
    private int Experiencia;
    
    public Ciudadano(){}
    
    public Ciudadano(String Nombre, int Edad, int Experiencia){
        this.SetNombre(Nombre);
        this.SetEdad(Edad);
        this.SetExperiencia(Experiencia);
        
    }
    
    public String GetNombre(){
        return Nombre;
    }
    
    public int GetEdad(){
       return Edad;
    }
    
    public int GetExperiencia(){
       return Experiencia;
    }
    
    
    public void SetNombre(String _nombre){
       this.Nombre = _nombre;
    }   
    
    public void SetEdad(int _edad){
        this.Edad = _edad;
    }
    
    public void SetExperiencia(int _experiencia){
       this.Experiencia = _experiencia;
    }
    

    
}
