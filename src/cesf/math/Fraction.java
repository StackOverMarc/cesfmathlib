package cesf.math;

/** 
 * classe immutable per a representar fraccions enteres.
 */

public class Fraction {

	private final int num;
	private final int den;
	
	/**
	 *  constructor per defecte.
	 */
	public Fraction() { 
		num=0; 
		den=1;
		/**
		 *  @param num
		 *  @param den
		 */
	}
	/** 
	 * constructor amb paràmetres.
	 */
	public Fraction(int num, int den) { 
		
		if (den == 0) 
			throw new IllegalArgumentException("Denominator can not be zero!"); 
			/**
			 * @throw No pot ser zero complexions limits no aplicables.
			 */
		this.num = num;
		this.den = den; 
	}

	/** 
	 * getters
	 */
	public int getNum() { return this.num; }
	public int getDen() { return this.den; }
	
	/** 
	 * retorna el valor numèric de la fracció.
	 */
	public double valueOf() {
		double x = (double)(this.num) / this.den; 
		return x;
	}
	
	/** 
	 * retorna el valor numèric d'una fracció (versió estàtica).
	 */
	public static double valueOf(Fraction a) {
		double x = (double)(a.num) / a.den; 
		return x;	
		/**
		 * @return Retorna double de fracció(divisio)
		 */
	}
	
	/** 
	 * retorna una representació en cadena de text.
	 */
	public String toString() {
		return this.num + "/" + this.den;
		/**
		 * @return Retorna el string
		 */
	}
	
	/** 
	 * simplifica la fracció al màxim.
	 */
	public Fraction reduce() {
		int mcd = mcd(this.num, this.den);
		int n = this.num / mcd;
		int d = this.den / mcd;
		if (d < 0) { n = -n; d = -d; }
		return new Fraction(n, d);
		/**
		 * @return Retorna double de fracció(reduccio)
		 */
	}
	
	/** 
	 * retorna F1 + F2
	 */
	public Fraction add(Fraction b) {
		int n = this.num * b.den + this.den * b.num;
		int d = this.den * b.den;
		return new Fraction(n, d).reduce();
		/**
		 * @return Retorna double de fracció(suma)
		 */
	}
	
	/**
	 * Retorna f1 - f2
	 */
	public Fraction substract(Fraction b) {
		int n = this.num * b.den - this.den * b.num;
		int d = this.den * b.den;
		return new Fraction(n, d).reduce();
		/**
		 * @return Retorna double de fracció(resta)
		 */
	}
	
	/** 
	 * retorna F1 * F2
	 */
	public Fraction multiply(Fraction b) {
		int n = this.num * b.num;
		int d = this.den * b.den;
		return new Fraction(n, d).reduce();
		/**
		 * @return Retorna double de fracció(producte)
		 */
	}
	
	/** 
	 * retorna F1 * x
	 */
	public Fraction multiply(int x) {
		int n = this.num * x;
		int d = this.den;
		return new Fraction(n, d).reduce();
		/**
		 * @return Retorna double de fracció(multiple)
		 */
	}
	
	/** 
	 * retorna F1 / F2
	 */
	public Fraction divide(Fraction b) {
		return this.multiply(b.reciprocal());
		/**
		 * @return Retorna double de fracció(divisio de 2 fraccions)
		 */
	}

	/** 
	 * retorna 1 / F
	 */
	public Fraction reciprocal() {
		return new Fraction(this.den, this.num).reduce();
		/**
		 * @return Retorna (1/Fraccio)
		 */
	}
	
	/**
	 * Troba el maxim comú divisor
	 */
	protected int mcd(int a, int b) {
		int d; 
		while (b != 0) {
			d = b;
			b = a % b;
			a = d;
		}
		return a;
		/**
		 * @return Retorna el maxim.
		 */
	}

	/** 
	 * compara dos fraccions
	 */
	public boolean equals(Fraction b) {
		Fraction f1 = this.reduce();
		Fraction f2 = b.reduce();
		if (f1.num != f2.num) return false;
		if (f1.den != f2.den) return false; 
		return true;
		/**
		 * @return Compara dos equacions
		 */
	}
}
