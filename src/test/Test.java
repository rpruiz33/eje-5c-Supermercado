package test;
import modelo.Supermercado;
import modelo.Producto;
import modelo.Carrito;
import modelo.ItemCarrito;

public class Test {

	public static void main(String[] args) {
		Producto p1=new Producto(2,"yogur",12.4f);
		Carrito c1=new Carrito(1,p1,2);
		Supermercado supermercado=new Supermercado();
		System.out.println(supermercado.agregarProducto("carne",32.4f));
		System.out.println(supermercado.agregarProducto("yogur",32.4f));
		System.out.println(supermercado.agregarProducto("carne",32.4f));
		System.out.println(supermercado.traerProducto(2).mostrar());
		System.out.println(supermercado.modificarProducto(2,"pollo",123.3));
		System.out.println(agregarProductoCarrito(String producto, float precio, int cantidad));
	}

}
