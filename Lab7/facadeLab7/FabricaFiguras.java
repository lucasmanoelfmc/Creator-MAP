package Lab7.facadeLab7;
import Lab7.classesLab7.*;

public class FabricaFiguras {

    public String criarCirculo(double raio){
        Circulo circulo = Circulo.getInstance(raio);
        return circulo.toString();
    }

    public String criarTriangulo(double lado1, double lado2, double lado3){
        Triangulo triangulo = Triangulo.getInstance(lado1, lado2, lado3);
        return triangulo.toString();
    }
    
    public String criarQuadrado(double lado){
        Quadrado quadrado = new Quadrado(lado);
        return quadrado.toString();
    }

}
