import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;
  
    public Carrito() {
        productos = new ArrayList<>();
    }

    public int getCantidad() {
        return productos.size();
    }

    public Double getTotalPorPagar() {
        return 0.0;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

	public Object getProducto(String nombreProducto) {
        for (Producto p : productos) {
            if (nombreProducto.equals(p.getNombre())) {
                return p;
            }
        }
        return null;
	}

}
