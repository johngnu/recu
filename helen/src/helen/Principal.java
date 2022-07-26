package helen;

/**
 *
 * @author desktop
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Plato p1 = new Plato("fricase", 20);
        Plato p2 = new Plato("silpancho", 10);
        Plato p3 = new Plato("majadito", 10);
        Plato p4 = new Plato("asado", 10);
        Plato p5 = new Plato("milanesa", 12);
        
        pilaPlato pi = new pilaPlato(5);
        pi.adiPila(p1);
        pi.adiPila(p2);
        pi.adiPila(p3);
        pi.adiPila(p4);
        pi.adiPila(p5);
        
        pi.mostrarPila();
    }
    
}
