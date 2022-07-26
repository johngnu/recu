package empresa;

/**
 *
 * @author desktop
 */
public class Principal {

    public static void main(String[] args) {

        Producto p1 = new Producto("prod1", 20, 5, 2023, "SI");
        Producto p2 = new Producto("prod2", 20, 5, 2023, "NO");
        Producto p3 = new Producto("prod3", 20, 5, 2024, "NO");
        Producto p4 = new Producto("prod4", 20, 5, 2025, "SI");

        colaProducto cl = new colaProducto(5);
        cl.adiCola(p1);
        cl.adiCola(p2);
        cl.adiCola(p3);
        cl.adiCola(p4);

        cl.mostrarColaSimple();
        
        // b)
        mostrarEstadoSi(cl);
        
    }

    public static void mostrarEstadoSi(colaProducto cl) {
        colaProducto caux = new colaProducto(cl.max);
        Producto x;
        System.out.println("*b) ** Productos en estado SI: ");
        while (!cl.esVacia()) {
            x = cl.eliCola();
            if (x.getEstado().equals("SI")) {
                x.mostrarProducto();
            }
            caux.adiCola(x);
        }
        cl.vaciar(caux);
        System.out.println();
    }
}
