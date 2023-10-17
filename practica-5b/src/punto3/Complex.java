package punto3;

public class Complex {
	private double re;
	private double im;
	
	public Complex(double re, double im) {
		this.im = im;
		this.re = re;
	}

	public double realPart() {
		return re;
	}

	public double imaginaryPart() {
		return im;
	}
	
	public Complex add(Complex c) {
		return new Complex(this.re + c.realPart(), this.im + c.imaginaryPart());
	}
	
	public Complex subtract(Complex c) {
		return new Complex(this.re - c.realPart(), this.im - c.imaginaryPart());
	}
	
	public Complex multiply(Complex c) {
		double real = (this.re * c.realPart()) + (this.im + c.imaginaryPart());
		double imaginary = (this.im * c.realPart()) + (this.re + c.imaginaryPart());
		return new Complex(real, imaginary);
	}
	
	public Complex divide(Complex c) {
		Complex conjugate = new Complex(c.realPart(), -c.imaginaryPart());
		Complex denom = c.multiply(conjugate);
		// the imaginary part of a conjugate is 0
		return new Complex((this.re / denom.realPart()), (this.im / denom.realPart()));
	}
	
	@Override
	public String toString() {
		String res = this.re + " " + this.im + "" + "i";
		return res;
	}
}
