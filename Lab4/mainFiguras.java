import figuras.Circulo;
import figuras.Quadrado;
import figuras.Retangulo;

public class mainFiguras {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(3);

        Retangulo retangulo1 = new Retangulo(3, 3);
        
        Quadrado quadrado1 = new Quadrado(5);

        System.out.println(circulo1.toString());
        System.out.println(retangulo1.toString());
        System.out.println(quadrado1.toString());
        System.out.println("Area circulo:" + circulo1.areaCirculo());
        System.out.println("Perimetro circulo:" + circulo1.perimetroCirculo());
        System.out.println("Area retangulo:" + retangulo1.areaRetangulo());
        System.out.println("Perimetro retangulo:" + retangulo1.perimetroRetangulo());
        System.out.println("Area quadrado:" + quadrado1.areaQuadrado());
        System.out.println("Perimetro quadrado:" + quadrado1.perimetroQuadrado());
    }
    
}