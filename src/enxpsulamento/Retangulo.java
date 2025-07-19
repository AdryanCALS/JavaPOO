package enxpsulamento;

public class Retangulo {
	private double base;
	private double altura;
	
	public Retangulo(double b, double a) {
		this.base = b;
		this.altura = a;
	}
	
	public double calcularArea() {
		return this.base*this.altura;
	}
	
	public double calcularPerimetro() {
		return this.base*2 + this.altura*2;
	}
}
