package Lab7.classesLab7;
import Lab7.exceptionsLab7.AtributoNaoPositivoException;

public class Quadrado {

    private double lado;

    public Quadrado(double lado) throws AtributoNaoPositivoException{
        if (lado <= 0){
            throw new AtributoNaoPositivoException("Lado precisa ser positivo!");            
        }
        this.lado = lado;
    }

    //  Cálculo de área e perímetro
    private double getAreaQuadrado(){
        return Math.floor(lado * lado * 100) / 100;
    }
    private double getPerimetroQuadrado(){
        return Math.floor(4 * lado * 100) / 100;
    }

    //  toString
    @Override
    public String toString() throws AtributoNaoPositivoException{
        return "Quadrado [Lado: " + lado + ", Area: " + getAreaQuadrado()
        + ", Perimetro: " + getPerimetroQuadrado() + "]";
    }

}