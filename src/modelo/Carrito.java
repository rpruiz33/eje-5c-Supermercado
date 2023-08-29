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







}
