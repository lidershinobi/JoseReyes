package com.mycompany.mavenproject1;


public class Estudiantes {
    private String Nombre;
    private int Edad;
    private String Carrera;
    
    public Estudiantes(){}
    
    public Estudiantes(String Nombre, int Edad, String Carrera){
        this.DarNombre(Nombre);
        this.DarEdad(Edad);
        this.DarCarrera(Carrera);
    }
    
    public String ObtenerNombre(){
        return Nombre;
    }

    public int ObtenerEdad(){
        return Edad;
    }  
    
    public String ObtenerCarrera(){
        return Carrera;
    }
    
    
    public void DarNombre(String _Nombre){
    this.Nombre = _Nombre;
    }
    
    public void DarEdad(int _Edad){
    this.Edad = _Edad;
    }
    
    public void DarCarrera(String _Carrera){
    this.Carrera = _Carrera;
    }
    
}
