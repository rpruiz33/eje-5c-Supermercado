package modelo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.time.LocalTime;
public class Supermercado {

	private List<Producto> gondola ;

	public Supermercado() {
		super();
		

		this.gondola= new ArrayList<Producto>();
	}

	public boolean agregarProducto(String producto,float precio) {
		int i = 0;
		
		while(i < gondola.size()) {
			
			if (((gondola.get(i).getProducto().equals(producto))) && precio==(gondola.get(i).getPrecio())) {
				return false;
			}
			i++;
		}
			Producto nuevo = new Producto(gondola.size() + 1, producto,precio);
			gondola.add(nuevo);
			return true;
		}
		
	

	public List<Producto> getProductos() {
		return gondola;
	}



	public void setProductos(List<Producto> productos) {
		this.gondola = productos;
	}

}
