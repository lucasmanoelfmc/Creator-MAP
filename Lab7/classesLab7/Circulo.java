package Lab7.classesLab7;
import Lab7.exceptionsLab7.AtributoNaoPositivoException;

public class Circulo {

    private double raio;

    private static Circulo uniqueInstance = null;

    private Circulo(double raio){
        this.raio = raio;
    }

    public static Circulo getInstance(double raio) throws AtributoNaoPositivoException{
        if (uniqueInstance == null){
            if (raio <= 0){
                throw new AtributoNaoPositivoException("O raio precisa ser positivo!");
            }
            uniqueInstance = new Circulo(raio);
        }
        else{
            System.out.println("Círculo já foi criado!");
        }
        return uniqueInstance;
    }

    //  Gets
    public double getRaio() {
        return raio;
    }
    public double getAreaCirculo(){
        return Math.floor(3.14 * raio * raio * 100) / 100;
    }
    public double getCircunferenciaCirculo(){
        return Math.floor(2 * 3.14 * raio * 100) / 100;
    }

    //  toString
    @Override
    public String toString() {
        return "Circulo [Raio: " + raio + ", Area: " + getAreaCirculo()
        + ", Circunferencia: " + getCircunferenciaCirculo() + "]";
    }

}