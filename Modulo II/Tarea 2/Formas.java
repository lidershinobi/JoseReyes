package Figuras;


public class Formas {
    String Color;
    String Forma;
    
    
    //constructor
    public Formas(){
    }


public void Dibujar(){
    System.out.println(Forma);
    System.out.println("Color: " + Color);
}

public void EstablecerColor(String NuevoColor){
    this.Color = NuevoColor;
}

public void EstablecerForma(String NuevaForma){
    this.Forma = NuevaForma;
}

}
