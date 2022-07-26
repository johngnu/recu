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
        Plato p3 = new Plato("majadito", 100);
        Plato p4 = new Plato("asado", 100);
        Plato p5 = new Plato("milanesa", 12);
        
        pilaPlato pl1 = new pilaPlato(5);
        pl1.adiPila(p1);
        pl1.adiPila(p2);
        pl1.adiPila(p3);
        pl1.adiPila(p4);
        pl1.adiPila(p5);        
        //pl1.mostrarPila();
        
        pilaPlato pl2 = new pilaPlato(5);
        pl2.adiPila(p1);
        pl2.adiPila(p2);
        pl2.adiPila(p3);
        
        
        // cliente 
        Cliente c1 = new Cliente("helen", "13342538");
        Cliente c2 = new Cliente("roberta", "112233");
        
        // pedidos
        Pedidos ps1 = new Pedidos(1, c1, pl1);
        Pedidos ps2 = new Pedidos(2, c2, pl2);
        
        colaPedidos clp = new colaPedidos(3);
        clp.adiCola(ps1);
        clp.adiCola(ps2);
        
        clp.mostrarColaSimple();
        
        // a)
        calcularTotal("helen");
    }
    
    
    public static void calcularTotal(String x) {
        
    }
}
