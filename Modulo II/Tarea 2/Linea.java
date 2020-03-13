
package Figuras;


public class Linea extends Formas{
    int Largo;
    
    public Linea(){
        EstablecerColor("Azul");
        EstablecerForma("LINEA");
        
    }
    
        public void SetLargo(int largo){
        this.Largo = largo;
        }
        
        public void GetLargo(){
            System.out.println("Largo: " + Largo + "cm");
        }
    
}
