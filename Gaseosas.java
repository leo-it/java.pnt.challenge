package paquete;

public class Gaseosas extends Producto {

	private double litros;

	public Gaseosas(String nombre, double litros, int precio) {
		super(nombre, precio);
		this.litros = litros;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public String toString() {
		return "Nombre: " + getNombre() + " /// Litros: " + getLitros() + " /// Precio: $" + getPrecio();
	}

}
