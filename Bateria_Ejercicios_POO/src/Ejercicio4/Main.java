package Ejercicio4;

public class Main {

	public static void main(String[] args) {

		Electrodomestico [] elec = new Electrodomestico[10];
		
		elec[0] = new Lavadora();
		elec[1] = new Lavadora(15.5,80.5);
		elec[2] = new Electrodomestico(50,30);
		elec[3] = new Lavadora(15.5,80.5,50.3,"blanco",'A');
		elec[4] = new Electrodomestico();
		elec[5] = new Lavadora(70.4,15.65,34,"azul",'D');
		elec[6] = new Television();
		elec[7] = new Electrodomestico(14,17.3,"verde",'C');
		elec[8] = new Television(15.3,65.3,45,true,"gris",'B');
		elec[9] = new Television(43.3,17.3,25,false,"negro",'E');
		
		double sumaElec = 0;
		double sumaTele = 0;
		double sumaLava = 0;
		
		for (int i = 0; i < elec.length; i++) {
			if(elec[i] instanceof Electrodomestico) {
				sumaElec += elec[i].precioFinal();
			}
			if(elec[i] instanceof Television) {
				sumaTele += elec[i].precioFinal();
			}
			if(elec[i] instanceof Lavadora) {
				sumaLava += elec[i].precioFinal();
			}
		}
		
		System.out.println("Suma televisiones: "+sumaTele + "\nSuma lavadoras: "+sumaLava+"\nSuma electrodomésticos: "+sumaElec);

	}

}
