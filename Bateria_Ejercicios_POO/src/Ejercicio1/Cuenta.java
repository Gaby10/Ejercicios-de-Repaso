package Ejercicio1;

public class Cuenta {

	private float titular;
	private float cantidad;
	
	public Cuenta(float titular) {
		this.titular = titular;
	}
	
	public Cuenta(float titular, float cantidad) {
		this(titular);
		this.cantidad = cantidad;
	}

	
	public float getTitular() {
		return titular;
	}

	public void setTitular(float titular) {
		this.titular = titular;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	
	public String toString() {
		String r = "El titular es: "+ this.titular;
		if(this.cantidad != 0) {
			r+="\nLa cantidad es: " + this.cantidad;
		}
		
		return r;
	}
	
	public void ingresar(double cantidad) {
		if(cantidad>=0) {
			this.cantidad+=cantidad;
		}
	}
	
	public void retirar(double cantidad) {
		
		if (this.cantidad - cantidad < 0) {
			this.cantidad = 0;
		} else {
			this.cantidad -= cantidad;
		}
		
	}
	
}
