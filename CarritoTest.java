import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarritoTest {
    @Test
    public void CantidadDeProductosEsCeroEnUnCarritoRecienCreado()
    {
        Carrito carrito = new Carrito();
        assertTrue( carrito.getCantidad() == 0);
    }

    @Test
    public void TotalAPagarEsCeroEnUnCarritoRecienCreado()
    {
        Carrito carrito = new Carrito();
        assertEquals( 0.0, carrito.getTotalPorPagar());
    }

    @Test
    public void AgregarUnProductoEnUnCarritoRecienCreado()
    {
        Carrito carrito = new Carrito();
        Producto producto = new Producto("Jamón", 50.5);  
        carrito.agregarProducto(producto);     
    }
}