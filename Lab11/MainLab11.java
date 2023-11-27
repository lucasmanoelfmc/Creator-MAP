package Lab11;
import Lab11.model.*;

public class MainLab11 {
    public static void main(String[] args) {
        Hamburger h1 = new Hamburger1();
        h1.montaHamburger();
        System.out.println(h1.toString());

        Hamburger h2 = new Hamburger2();
        h2.montaHamburger();
        System.out.println(h2.toString());

        Hamburger3 h3 = new Hamburger3();
        h3.montaHamburger();
        System.out.println(h3.toString());
    }
}
