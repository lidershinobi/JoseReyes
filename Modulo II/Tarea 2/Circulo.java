package Figuras;

public class Circulo extends Formas{
    int Radio;
    
    
    public Circulo(){
        EstablecerColor("Rojo");
        EstablecerForma("CIRCULO");
    }
    
    public void SetRadio(int radio){
        this.Radio = radio;
    }
    
    public void GetRadio(){
        int radio;
        radio = (Radio/2);
        System.out.println("Radio: " + radio +"r");
    }
}
