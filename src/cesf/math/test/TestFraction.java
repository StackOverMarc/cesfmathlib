package cesf.math.test;

import cesf.math.Fraction;

public class TestFraction {
    /** 
     * Test de fraccio.
     */
	public static void main(String[] args) {
		
		Fraction f1 = new Fraction(24, -42);
		f1 = f1.reduce();
		System.out.println(f1);
		System.out.println();
		
		Fraction f2 = new Fraction(5, 7);
		System.out.println(f1 + " + " + f2 + " = " + f1.add(f2));		
		System.out.println(f1 + " - " + f2 + " = " + f1.substract(f2));		
		System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));		
		System.out.println(f1 + " / " + f2 + " = " + f1.divide(f2));		
	}
}
