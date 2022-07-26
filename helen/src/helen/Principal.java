package helen;

/**
 *
 * @author desktop
 */
public class Principal {

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
        calcularTotal(clp, "roberta");
        calcularTotal(clp, "helen");

        // b)
        eliminar(clp, "helen");
        clp.mostrarColaSimple();
    }

    public static void eliminar(colaPedidos a, String y) {
        String h = "";
        int total = 0;
        colaPedidos caux = new colaPedidos(a.max);
        Pedidos x;

        while (!a.esVacia()) {
            x = a.eliCola();

            if (x.getCli().getNombre().equals(y)) {
                pilaPlato aux1 = x.getPp();
                h = x.getCli().getNombre();
                //
                Plato vct = new Plato();
                if (aux1.esVacia()) {

                } else {
                    pilaPlato aux = new pilaPlato(aux1.max);
                    while (!aux1.esVacia()) {
                        vct = aux1.eliPila();
                        if (vct.getPrecio() < 100) {
                            aux.adiPila(vct);
                        }
                    }
                    aux1.vaciarPila(aux);
                }
                //
            }

            caux.adiCola(x);
        }
        a.vaciar(caux);
    }

    public static void calcularTotal(colaPedidos clp, String xc) {
        colaPedidos caux = new colaPedidos(clp.max);
        Pedidos x;
        //System.out.println("Los elementos de la cola son:");
        int total = 0;
        while (!clp.esVacia()) {
            x = clp.eliCola();
            //x.mostrarPedidos();
            if (x.getCli().getNombre().equals(xc)) {
                pilaPlato paux = new pilaPlato(x.getPp().max);
                Plato xp;
                while (!x.getPp().esVacia()) {
                    xp = x.getPp().eliPila();
                    total = total + xp.getPrecio();
                    paux.adiPila(xp);
                }
                x.getPp().vaciarPila(paux);
            }
            caux.adiCola(x);
        }
        clp.vaciar(caux);
        System.out.println(" total cliente: " + xc + " es: " + total);
    }
}
