package Ejercicio2;

import java.util.Random;

public class Persona {

	private String nombre, dni;
	private char sexo;
	private int edad;
	private float peso, altura;
	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = 'H';
		this.peso = 0;
		this.altura = 0;
		generaDNI();
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public Persona(String nombre, int edad, char sexo, float peso, float altura) {
		this();
		this.peso = peso;
		this.altura = altura;
	}
	
	public int calcularIMC() {
		
		double peso = this.peso/Math.pow(this.altura, 2);
		
		if(peso < 20) {
			return -1;
		} else if (peso > 25) {
			return 1;
		}
		
		return 0;
	}
	
	public boolean esMayorDeEdad() {
		if(this.edad>=18) {
			return true;
		} else {
			return false;
		}
	}
	
	private void comprobarSexo(char sexo) {
		switch(sexo) {
			case 'H':
				this.sexo = sexo;
				break;
			case 'M':
				this.sexo = sexo;
				break;
			default:
				this.sexo = 'H';
				break;
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
	private void generaDNI() {
		Random r = new Random();
		int dni = r.nextInt(99999999+1 - 10000000) + 10000000;
		this.dni = "" + dni + letra(dni);
	}
	
	private char letra(int dni) {
		
		char [] l = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
			
		return l[dni%23];
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	
	
	
	
}
