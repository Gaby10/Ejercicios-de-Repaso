package Ejercicio4;

public class Lavadora extends Electrodomestico {

	private double carga;
	
	private final double CARGA = 5;
	
	public Lavadora() {
		super();
		this.carga = CARGA;
	}
	
	public Lavadora(double precio, double peso) {
		this();	
		this.precioBase = precio;
		this.peso = peso;
	}
	
	public Lavadora(double precio, double peso, double carga, String color, char consumo) {
		super(precio,peso,color,consumo);
		this.carga = carga;
	}

	
	public double getCarga() {
		return carga;
	}
	
	public double precioFinal() {
		
		double res = super.precioFinal();
		if(this.carga > 30) {
			res += 50;
		}

		return res;
	}
	
	
}
