package modelo;

public class ItemCarrito {
private int idItem;
private Producto producto;
private int cantidad;

public boolean agregarProducto(String producto, float precio) {
	Producto producto1=new Producto(1,producto, precio);
	return true ;
}
}
