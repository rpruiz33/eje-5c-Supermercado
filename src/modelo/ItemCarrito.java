package modelo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.time.LocalTime;

public class ItemCarrito {
private int idItem;
private Producto producto;
private int cantidad;
public int getIdItem() {
	return idItem;
}
public void setIdItem(int idItem) {
	this.idItem = idItem;
}
public Producto getProducto() {
	return producto;
}
public void setProducto(Producto producto) {
	this.producto = producto;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
public ItemCarrito(int idItem, Producto producto, int cantidad) {
	super();
	this.idItem = idItem;
	this.producto = producto;
	this.cantidad = cantidad;
}


}