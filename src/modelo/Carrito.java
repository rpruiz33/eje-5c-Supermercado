package modelo;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.time.LocalTime;
public class Carrito {
private int idCarrito;
private LocalDate fecha;
private LocalTime hora;
private List<ItemCarrito> Lst;

public int getIdCarrito() {
	return idCarrito;
}
public void setIdCarrito(int idCarrito) {
	this.idCarrito = idCarrito;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public LocalTime getHora() {
	return hora;
}
public void setHora(LocalTime hora) {
	this.hora = hora;
}
public List<ItemCarrito> getLst() {
	return Lst;
}
public void setLst(List<ItemCarrito> lst) {
	Lst = lst;
}
public Carrito(int idCarrito, LocalDate fecha, LocalTime hora, List<ItemCarrito> lst1) {
	super();
	this.idCarrito = idCarrito;
	this.fecha = fecha;
	this.hora = hora;

	Lst=lst1;
}
public boolean agregarProductoCarrito(String producto, float precio, int cantidad) {
	int i = 0;

	while (i < Lst.size()) {

		if (((Lst.get(i).getProducto().equals(producto))) && precio == (Lst.get(i).getProducto().getPrecio())) {
			return false;
		}
		i++;
	}
	Producto p1 = new Producto(Lst.size() + 1, producto, precio);
	ItemCarrito nuevo = new ItemCarrito(Lst.size() + 1, p1, cantidad);
	System.out.println();
	System.out.println(nuevo.getIdItem()); 
	Lst.add(nuevo);
	return true;
}

public Producto traerProductoCarrito(int idProducto) {
	int i = 0;
	while (i < Lst.size()) {
  
        if (idProducto == Lst.get(i).getIdItem()) {
            return Lst.get(i).getProducto();
        }
        i++;
    }
   
    return null;
}
//

public boolean eliminarItem(Producto producto, int cantidad) throws Exception {
	int i = 0;
	while (i < Lst.size()) {

		if (Lst.get(i).getProducto().equals(producto)) {

			if (cantidad == Lst.get(i).getCantidad()) {

				Lst.remove(i);
				return true;
			}
			if (cantidad < Lst.get(i).getCantidad()) {

				Lst.get(i).setCantidad(Lst.get(i).getCantidad() - cantidad);
				return true;

			}
			i++;

		}
	}
	throw new Exception("El producto no existe en el carrito.");
}
	public float subTotal() {
		int i=0;
		float acum=0;
		while(i<Lst.size()) {
			acum=Lst.get(i).getProducto().getPrecio()+acum;
			i++;
		}
	return acum;
	}
}





