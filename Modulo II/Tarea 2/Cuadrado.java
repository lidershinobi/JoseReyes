
package Figuras;


public class Cuadrado extends Formas{
    int Largo;
    int Ancho;
    int Area;
    
    public Cuadrado(){
        EstablecerColor("Amarillo");
        EstablecerForma("Cuadrado");
    }
    
    public void SetLargo(int largo){
        this.Largo = largo;
    }
    
    public void SetAncho(int ancho){
        this.Ancho = ancho;
    }
    
    public void GetArea(){
        Area = (Largo*Largo);
        System.out.println("Area: " + Area + "cm2");
    }
    
    
}
