package com.mycompany.mavenproject1;

import Figuras.Circulo;
import Figuras.Cuadrado;
import Figuras.Linea;
import Figuras.Triangulo;


public class NewMain {

  
    public static void main(String[] args) {
        
    Circulo circulo = new Circulo();
    Linea linea = new Linea();
    Triangulo triangulo = new Triangulo();
    Cuadrado cuadrado = new Cuadrado();
    
    System.out.println("Formas");
    System.out.println("-----------------");
    System.out.println("");
    
    //Circulo
    circulo.SetRadio(30);
    circulo.Dibujar();
    circulo.GetRadio();
    
    System.out.println("");
    
    //Linea
    linea.SetLargo(70);
    linea.Dibujar();
    linea.GetLargo();
    
    System.out.println("");
    
    //Triangulo
    triangulo.SetAltura(70);
    triangulo.SetBase(40);
    triangulo.Dibujar();
    triangulo.GetArea();
    
    System.out.println("");
    
    //Cuadrado
    cuadrado.SetAncho(48);
    cuadrado.SetLargo(90);
    cuadrado.Dibujar();
    cuadrado.GetArea();
    
    
    }

    
}
