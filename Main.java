package paquete;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Producto> lista = new ArrayList<Producto>();
		lista.add(new Gaseosas("Coca-Cola Zero", 1.5, 20));
		lista.add(new Gaseosas("Coca-Cola", 1.5, 18));
		lista.add(new Cosmetica("Shampoo Sedal", "500ml", 19));
		lista.add(new Frutas("Frutillas", 64, "Kilo"));

		for (Producto p : lista) {
			System.out.println(p.toString());
		}
		System.out.println("=============================");
//		Ordeno lista de menor a mayor e imprimo el primer y el ultimo producto.
		Collections.sort(lista);
		System.out.println("Producto más caro: " + (lista.get(lista.size() - 1).getNombre()));
		System.out.println("Producto más barato: " + lista.get(0).getNombre());

	}
}
