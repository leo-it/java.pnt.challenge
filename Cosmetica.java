package paquete;

public class Cosmetica extends Producto {

	private String contenido;

	public Cosmetica(String nombre, String contenido, int precio) {
		super(nombre, precio);
		this.contenido = contenido;
	}

	public String getContenido() {
		return contenido;
	}

	public String toString() {
		return "Nombre: " + getNombre() + " /// Contenido: " + getContenido() + " /// Precio: $" + getPrecio();
	}

}
