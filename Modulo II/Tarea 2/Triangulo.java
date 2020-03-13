
package Figuras;


public class Triangulo extends Formas{
    int Base;
    int Altura;
    
    public Triangulo(){
        EstablecerColor("Verde");
        EstablecerForma("Triangulo");
    }
    
    public void SetBase(int base){
        this.Base = base;
    }
    
    public void SetAltura(int altura){
       this.Altura = altura;
    }
    
    public void GetArea(){
        int area;
        area = (Base*Altura)/2;
        System.out.println("Area: " + area + "cm");
    }
    
}
