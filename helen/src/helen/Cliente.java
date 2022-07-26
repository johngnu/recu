package helen;

/**
 *
 * @author desktop
 */
public class Cliente {

    private String nombre;
    private String nit;

    public Cliente() {
    }

    public Cliente(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }

    public void mostrarCliente() {
        System.out.println("nombre: " + nombre + " nit: " + nit);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

}
