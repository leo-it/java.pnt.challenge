package paquete;

public class Frutas extends Producto {

	private String unidad;

	public Frutas(String nombre, int precio, String unidad) {
		super(nombre, precio);
		this.unidad = unidad;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String toString() {
		return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: " + getUnidad();
	}

}
