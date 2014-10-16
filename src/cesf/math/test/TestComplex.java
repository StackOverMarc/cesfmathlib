package cesf.math.test;

import cesf.math.Complex;

public class TestComplex {

    /** 
     * programa de prova per a complexos
     */
    public static void main(String[] args) {
    	/**
         * @param complex a es una entrada de complex.
         * @param compex b es una entrada de compex.
         */
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 4.0);
        /**
         * @link Complex.java
         */
        System.out.println("a            = " + a);
        System.out.println("b            = " + b);
        System.out.println("Re(a)        = " + a.getReal());
        System.out.println("Im(a)        = " + a.getImag());
        System.out.println("b + a        = " + b.add(a));
        System.out.println("a - b        = " + a.substract(b));
        System.out.println("a * b        = " + a.multiply(b));
        System.out.println("b * a        = " + b.multiply(a));
        System.out.println("a / b        = " + a.divide(b));
        System.out.println("(a / b) * b  = " + a.divide(b).multiply(b));
        System.out.println("conj(a)      = " + a.conjugate());
        System.out.println("|a|          = " + a.abs());
        System.out.println("tan(a)       = " + a.tan());
    }

}
