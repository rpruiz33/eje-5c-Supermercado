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
private List<ItemCarrito>  Lst;
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
public Carrito(int idCarrito, LocalDate fecha, LocalTime hora, List<ItemCarrito> lst) {
	super();
	this.idCarrito = idCarrito;
	this.fecha = fecha;
	this.hora = hora;
	Lst = lst;
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

public Producto traerProducto(int idProducto) {
	int i = 0;
	while (i < Lst.size()) {
		if ((idProducto == Lst.get(i).getIdItem())) {
			return Lst.get(i).getProducto();
			}
		i++;
		}
	return null;
}






}
