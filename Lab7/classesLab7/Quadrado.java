package Lab7.classesLab7;
import Lab7.exceptionsLab7.AtributoNaoPositivoException;

public class Quadrado {

    private double lado;

    public Quadrado(double lado) throws AtributoNaoPositivoException{
        if (lado <= 0){
            throw new AtributoNaoPositivoException("O lado precisa ser positivo!");            
        }
        this.lado = lado;
    }

    //  Gets
    public double getLadoQuadrado(){
        return lado;
    }
    public double getAreaQuadrado(){
        return Math.floor(lado * lado * 100) / 100;
    }
    public double getPerimetroQuadrado(){
        return Math.floor(4 * lado * 100) / 100;
    }

    //  toString
    @Override
    public String toString() {
        return "Quadrado [Lado: " + lado + ", Area: " + getAreaQuadrado()
        + ", Perimetro: " + getPerimetroQuadrado() + "]";
    }

}