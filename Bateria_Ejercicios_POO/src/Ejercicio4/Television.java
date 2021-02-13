package Ejercicio4;

public class Television extends Electrodomestico {

	private double resolucion;
	private boolean sintonizadorTDT;
	
	private final int RESOLUCION = 20;
	private final boolean SINTONIZADOR = false;
	
	public Television() {
		super();
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADOR;
	}
	
	public Television(double precio, double peso) {
		this();
		this.precioBase = precio;
		this.peso = peso;
	}
	
	public Television(double precio, double peso, double resolucion, boolean sintonizador, String color, char consumo) {
		super(precio,peso,color,consumo);
		this.sintonizadorTDT = sintonizador;
		this.resolucion = resolucion;
	}

	
	
	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	
	
	public double precioFinal() {
		
		double res = super.precioFinal();
		
		if(this.resolucion > 40) {
			res += res*0.3;
		}
		
		if(this.sintonizadorTDT) {
			res += 50;
		}
		
		return res;
	}
	
	
}
