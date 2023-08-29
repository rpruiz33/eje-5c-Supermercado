package test;
import modelo.Supermercado;
import modelo.Producto;
import modelo.Carrito;
import modelo.ItemCarrito;

public class Test {

	public static void main(String[] args) {

		Supermercado supermercado=new Supermercado();
		System.out.println(supermercado.agregarProducto("carne",32.4f));
		System.out.println(supermercado.agregarProducto("carne",32.4f));
	}

}
