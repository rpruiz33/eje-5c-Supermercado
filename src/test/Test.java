package test;

import modelo.Supermercado;
import modelo.Producto;
import java.time.LocalDate;
import java.time.LocalTime;

import java.util.ArrayList;
import java.util.List;

import modelo.Carrito;
import modelo.ItemCarrito;

public class Test {

	public static void main(String[] args) {
		LocalDate fecha = LocalDate.of(2023, 9, 2);
		LocalTime hora = LocalTime.of(15, 30);
		Producto p1 = new Producto(2, "yogur", 12.4f);
		ItemCarrito c1 = new ItemCarrito(1, p1, 2);
		ItemCarrito c2 = new ItemCarrito(1, p1, 3);
		List<ItemCarrito> lst = new ArrayList<ItemCarrito>();
		Carrito carri = new Carrito(0, fecha, hora, lst);

		Supermercado supermercado = new Supermercado();
		try {
			System.out.println(supermercado.agregarProducto("carne", 32.4f));
			System.out.println(supermercado.agregarProducto("yogur", 32.4f));
			System.out.println(supermercado.agregarProducto("carne", 32.4f));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		System.out.println(carri.agregarProductoCarrito("MILA", 22.2f, 1));
		System.out.println("TRAER PRODUCTO");

		System.out.println(supermercado.traerProducto(1));

		System.out.println(carri.traerProductoCarrito(1).toString());
		

		System.out.println("modificar PRODUCTO");
		try {
			System.out.println(supermercado.modificarProducto(0, "carne",32.4));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		System.out.println(carri.agregarProductoCarrito("yerba", 23, 5));
		System.out.println("subtotal");
		System.out.println(carri.subTotal()); 
		try {
			System.out.println(supermercado.eliminarProducto(29));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try
		{
			System.out.println( carri.eliminarItem(p1,1));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}
}
