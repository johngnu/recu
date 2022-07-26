package empresa;

/**
 *
 * @author desktop
 */
public class Producto {

    private String nombre;
    private int precio;
    private int cantidad;
    private int anioVenc;
    private String estado;

    public Producto() {
    }

    public Producto(String nombre, int precio, int cantidad, int anioVenc, String estado) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.anioVenc = anioVenc;
        this.estado = estado;
    }

    public void mostrarProducto() {
        System.out.println("nombre: " + nombre + " precio: " + precio 
                + " cantidad: " + cantidad + " venc:" + anioVenc + " estado: " + estado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getAnioVenc() {
        return anioVenc;
    }

    public void setAnioVenc(int anioVenc) {
        this.anioVenc = anioVenc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
