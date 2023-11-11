package Lab9.interfaces;

import Lab9.classes.*;

public interface VisitorIF {
    Double visitRetangulo(Retangulo retangulo);
    Double visitTriangulo(Triangulo triangulo);
    Double visitCirculo(Circulo circulo);
    Double visitTrapezio(Trapezio trapezio);
}
