package modelo;

import java.util.Objects;

public class Producto {
public Producto() {
		super();
	}
private int idProducto;
private String producto;
private float precio;
public Producto(int idProducto, String producto, float precio) {
	super();
	this.idProducto = idProducto;
	this.producto = producto;
	this.precio = precio;
}
public int getIdProducto() {
	return idProducto;
}
public void setIdProducto(int idProducto) {
	this.idProducto = idProducto;
}
public String getProducto() {
	return producto;
}
public void setProducto(String producto) {
	this.producto = producto;
}
public float getPrecio() {
	return precio;
}
public void setPrecio(float precio) {
	this.precio = precio;
}
public String mostrar() {
	return "id "+idProducto +" "+producto+"<--producto"+ " precio--> "+precio ;
	
}
@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    
    Producto otroProducto = (Producto) obj;
    
    return Objects.equals(idProducto, otroProducto.idProducto);

}
}