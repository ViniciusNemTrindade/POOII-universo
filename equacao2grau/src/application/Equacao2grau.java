package application;

import java.lang.Math;

/**
 *
 * @author Vinícius Trindade
 */
public class Equacao2grau {

    public double a, b, c;

    Equacao2grau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double x1() {
        double s = ((((b*(-1)) + Math.sqrt(Math.pow(b, 2) - 4 * a * c))))/ (2 * a) ;
        return s;
    }

    public double x2() {
        double s = ((((b*(-1)) - Math.sqrt(Math.pow(b, 2) - 4 * a * c))))/ (2 * a) ;
        return s;
    }

    public void exibir() {
        System.out.println("X1 = " + x1());
        System.out.println("X2 = " + x2());
    }

}
