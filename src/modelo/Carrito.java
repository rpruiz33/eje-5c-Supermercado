package modelo;
import java.time.LocalDate;
import java.time.LocalTime;
public class Carrito {
private int idCarrito;
private LocalDate fechaNacimiento; 
private LocalTime hora;
private ItemCarrito  Lst;
public Carrito(int idCarrito, LocalDate fechaNacimiento, LocalTime hora, ItemCarrito lst) {
	super();
	this.idCarrito = idCarrito;
	this.fechaNacimiento = fechaNacimiento;
	this.hora = hora;
	Lst = lst;
}
public int getIdCarrito() {
	return idCarrito;
}
public void setIdCarrito(int idCarrito) {
	this.idCarrito = idCarrito;
}
public LocalDate getFechaNacimiento() {
	return fechaNacimiento;
}
public void setFechaNacimiento(LocalDate fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}
public LocalTime getHora() {
	return hora;
}
public void setHora(LocalTime hora) {
	this.hora = hora;
}
public ItemCarrito getLst() {
	return Lst;
}
public void setLst(ItemCarrito lst) {
	Lst = lst;
}


}
