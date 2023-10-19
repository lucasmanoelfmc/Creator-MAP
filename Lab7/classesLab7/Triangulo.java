package Lab7.classesLab7;
import Lab7.exceptionsLab7.*;

public class Triangulo {
    
    private double lado1, lado2, lado3;

    private static Triangulo err = null;
    private static Triangulo uniqueInstanceEquilatero = null;
    private static Triangulo uniqueInstanceIsosceles = null;
    private static Triangulo uniqueInstanceRetangulo = null;
    private static int cont = 0;


    private Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    private static boolean retanguloChecagem(double lado1, double lado2, double lado3){
        double maior = Math.max(lado1, Math.max(lado2, lado3));

        if (maior == lado1){
            return lado1 * lado1 == lado2 * lado2 + lado3 * lado3;
        }
        else if (maior == lado2){
            return lado2 * lado2 == lado1 * lado1 + lado2 * lado2;
        }
        else {
            return lado3 * lado3 == lado1 * lado1 + lado2 * lado2;
        }

    }

    private static String classificarTriangulo(double lado1, double lado2, double lado3)
    throws AtributoNaoPositivoException, TrianguloImpossivelException{
        
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0){
            throw new AtributoNaoPositivoException("Todos os lados precisam ser positivos!");
        }

        if (!(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1)){
            throw new TrianguloImpossivelException
            ("A soma de dois lados quaisquer deve ser sempre maior que o terceiro lado!");
        }
    
        if (lado1 == lado2 && lado2 == lado3){
            return "equilatero";
        }
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            return "isosceles";
        }
        else if (retanguloChecagem(lado1, lado2, lado3)){
            return "retangulo";
        }
        else {
            return "triangulo indefinido";
        }
    }

    public static Triangulo getInstance(double lado1, double lado2, double lado3) {
        
        if (classificarTriangulo(lado1, lado2, lado3) == "equilatero"){
            return getInstanceEquilatero(lado1, lado2, lado3);
        }
        else if (classificarTriangulo(lado1, lado2, lado3) == "isosceles"){
            return getInstanceIsosceles(lado1, lado2, lado3);
        }
        else if (classificarTriangulo(lado1, lado2, lado3) == "retangulo"){
            return getInstanceRetangulo(lado1, lado2, lado3);
        }
        else {
            return err;
        }
        
    }

    private static Triangulo getInstanceEquilatero(double lado1, double lado2, double lado3){
        if (uniqueInstanceEquilatero == null && cont < 3){
            uniqueInstanceEquilatero = new Triangulo(lado1, lado2, lado3);
            cont++;
        }
        else {
            System.out.println("Triângulo equilátero já foi criado!");
        }
        return uniqueInstanceEquilatero;
    }

    private static Triangulo getInstanceIsosceles(double lado1, double lado2, double lado3){
        if (uniqueInstanceIsosceles == null && cont < 3){
            uniqueInstanceIsosceles = new Triangulo(lado1, lado2, lado3);
            cont++;
        }
        else {
            System.out.println("Triângulo isósceles já foi criado!");
        }
        return uniqueInstanceIsosceles;
    }

    private static Triangulo getInstanceRetangulo(double lado1, double lado2, double lado3){
        if (uniqueInstanceRetangulo == null && cont < 3){
            uniqueInstanceRetangulo = new Triangulo(lado1, lado2, lado3);
            cont++;
        }
        else {
            System.out.println("Triângulo retângulo já foi criado!");
        }
        return uniqueInstanceRetangulo;
    }


    //  toString
    @Override
    public String toString() {

        if (classificarTriangulo(lado1, lado2, lado3) == "equilatero"){
            return "Triangulo Equilátero [Lado1: " + lado1 + ", Lado2: " + lado2 + ", Lado3: " + lado3 + "]";
        }
        else if (classificarTriangulo(lado1, lado2, lado3) == "isosceles"){
            return "Triangulo Isósceles [Lado1: " + lado1 + ", Lado2: " + lado2 + ", Lado3: " + lado3 + "]";
        }
        else if (classificarTriangulo(lado1, lado2, lado3) == "retangulo"){
            return "Triangulo Retângulo [Lado1: " + lado1 + ", Lado2: " + lado2 + ", Lado3: " + lado3 + "]";
        }
        else {
            return "triangulo indefinido";
        }
    }

}