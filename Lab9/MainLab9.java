package Lab9;
import Lab9.classes.*;
import Lab9.interfaces.*;
import Lab9.visitors.*;

public class MainLab9 {
    public static void main(String[] args) {

        VisitorIF area = new VisitorCalcularArea();
        VisitorIF perimetro = new VisitorCalcularPerimetro();
        VisitorIF desenho = new VisitorDesenhar();
        VisitorIF maximo = new VisitorMaximizar();

        Retangulo retangulo = new Retangulo(3.0, 5.0);
        Trapezio trapezio = new Trapezio(6.0, 12.0, 5.0, 5.0,11.0);
        Circulo circulo = new Circulo(3.0);
        Triangulo triangulo = new Triangulo(3.0, 4.0, 5.0, 5.0, 5.0);

        System.out.println("Área das figuras:");
        System.out.print("Retangulo: ");
        triangulo.acceptVisit(area);
        System.out.print("Trapezio: ");
        trapezio.acceptVisit(area);
        System.out.print("Circulo: ");
        circulo.acceptVisit(area);
        System.out.print("Triangulo: ");
        triangulo.acceptVisit(area);

        System.out.println("\n************");

        System.out.println("Perímetro das figuras:");
        System.out.print("Retangulo: ");
        triangulo.acceptVisit(perimetro);
        System.out.print("Trapezio: ");
        trapezio.acceptVisit(perimetro);
        System.out.print("Circulo: ");
        circulo.acceptVisit(perimetro);
        System.out.print("Triangulo: ");
        triangulo.acceptVisit(perimetro);

        System.out.println("\n************");

        System.out.println("Desenho das figuras:");
        retangulo.acceptVisit(desenho);
        trapezio.acceptVisit(desenho);
        circulo.acceptVisit(desenho);
        triangulo.acceptVisit(desenho);

        System.out.println("\n************");

        System.out.println("Maximização das figuras:");
        retangulo.acceptVisit(maximo);
        trapezio.acceptVisit(maximo);
        circulo.acceptVisit(maximo);
        triangulo.acceptVisit(maximo);

    }
}
