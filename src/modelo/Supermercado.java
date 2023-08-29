package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.time.LocalTime;

public class Supermercado {

	private List<Producto> gondola;

	public Supermercado() {
		super();

		this.gondola = new ArrayList<Producto>();
	}

	public List<Producto> getProductos() {
		return gondola;
	}

	public void setProductos(List<Producto> productos) {
		this.gondola = productos;
	}

	public boolean agregarProducto(String producto, float precio) {
		int i = 0;

		while (i < gondola.size()) {

			if (((gondola.get(i).getProducto().equals(producto))) && precio == (gondola.get(i).getPrecio())) {
				return false;
			}
			i++;
		}
		Producto nuevo = new Producto(gondola.size() + 1, producto, precio);
		System.out.println();
		System.out.println(nuevo.getIdProducto()); 
		gondola.add(nuevo);
		return true;
	}


	public Producto traerProducto(int idProducto) {
		int i = 0;
		while (i < gondola.size()) {
			if ((idProducto == gondola.get(i).getIdProducto())) {
				return gondola.get(i);
				}
			i++;
			}
		return null;
	}
	

	
	public boolean modificarProducto(int idProducto,String producto,double precio) {
	 Producto p1=new Producto (idProducto,producto,(float) precio);
	if (!traerProducto(idProducto).equals(null)) {
	p1.setProducto(producto);
	p1.setPrecio((float)precio);
	System.out.println("modificando producto");
	System.out.println(p1.mostrar());
	return true;
	}
	 return false;
	}
	// + eliminarProducto(int idProducto) : boolean
	public boolean eliminarProducto(int idProducto) {
		if (!traerProducto(idProducto).equals(null)) {
	
	}
		return;
}
	
}	

