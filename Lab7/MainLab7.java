package Lab7;
import Lab7.facadeLab7.FabricaFiguras;

public class MainLab7 {

    public static void main(String[] args) {

        FabricaFiguras fabricaFiguras = new FabricaFiguras();
        
        //  Círculo: pode ser criado apenas uma vez
        System.out.println("---------------------------------------------------------");
        System.out.println(fabricaFiguras.criarCirculo(3));
        System.out.println(fabricaFiguras.criarCirculo(4));

        //  Triângulo: apenas um de cada tipo (equilátero, isósceles ou retângulo)
        //  pode ser criado

        //  Triângulo Equilátero
        System.out.println("---------------------------------------------------------");
        System.out.println(fabricaFiguras.criarTriangulo(2, 2, 2));
        System.out.println(fabricaFiguras.criarTriangulo(3, 3, 3));

        //  Triângulo Isósceles
        System.out.println("---------------------------------------------------------");
        System.out.println(fabricaFiguras.criarTriangulo(2, 2, 3));
        System.out.println(fabricaFiguras.criarTriangulo(3, 3, 5));

        //  Triângulo Retângulo
        System.out.println("---------------------------------------------------------");
        System.out.println(fabricaFiguras.criarTriangulo(3, 4, 5));
        System.out.println(fabricaFiguras.criarTriangulo(6, 8, 10));

        //  Quadrado: pode ser criado indefinidamente
        System.out.println("---------------------------------------------------------");
        System.out.println(fabricaFiguras.criarQuadrado(3));
        System.out.println(fabricaFiguras.criarQuadrado(4));

    }
    
}