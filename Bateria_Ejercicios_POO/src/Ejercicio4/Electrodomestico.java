package Ejercicio4;

public class Electrodomestico {
		
	protected double precioBase;
	protected double peso;
	
	protected String color;
	
	protected char consumo;
	
	
	private final String COLOR = "blanco";
	private final char CONSUMO = 'F';
	private final double PRECIOBASE = 100;
	private final double PESO = 5;
	
	public Electrodomestico() {
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.precioBase = PRECIOBASE;
		this.peso = PESO;
	}
	
	public Electrodomestico(double precio, double peso) {
		this();
		this.precioBase = precio;
		this.peso = peso;
	}
	
	public Electrodomestico(double precio, double peso, String color, char consumo) {
		this(precio,peso);
		comprobarColor(color);
		comprobarConsumoEnergetico(consumo);
		
	}

	
	public double getPrecioBase() {
		return precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo() {
		return consumo;
	}
	
	
	private void comprobarConsumoEnergetico(char letra) {
		if (letra >= 'A' && letra <= 'F') {
			this.consumo = letra;
		} else {
			this.consumo = CONSUMO;
		}
	}
	
	private void comprobarColor(String color) {
		
		String [] colores = {"blanco", "negro", "azul", "gris", "rojo"};
		
		boolean encontrado = false;
		
		for (int i = 0; i < colores.length && !encontrado; i++) {
			if(colores[i].equalsIgnoreCase(color)) {
				this.color = color;
				encontrado = true;
			}
		}
		if (!encontrado) {
			this.color = COLOR;
		}
	}
	
	public double precioFinal() {
		double consum = 10, tama = 10;
		
		switch(this.consumo) {
			case 'A':
				consum = 100;
				break;
			case 'B':
				consum = 80;
				break;
			case 'C':
				consum = 60;
				break;
			case 'D':
				consum = 50;
				break;
			case 'E':
				consum = 30;
				break;
			case 'F':
				consum = 10;
				break;
		}
		
		if(this.peso>=0 && this.peso <= 19) {
			tama = 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			tama = 50;
		} else if (this.peso >= 50 && this.peso <= 79) {
			tama = 80;
		} else if (this.peso >= 80) {
			tama = 100;
		}
		
		
		return this.precioBase + consum + tama;
	}
	
	
}
