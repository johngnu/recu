package helen;

/**
 *
 * @author desktop
 */
public class pilaPlato {

    private Plato p[];
    int max, tope;

    public pilaPlato(int m) {
        max = m;
        p = new Plato[max];
        tope = -1;
    }

    public boolean esVacia() {
        if (tope == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esLlena() {
        if (tope == (max - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public void adiPila(Plato x) {
        if (esLlena()) {
            System.out.println("Pila llena");
        } else {
            tope = tope + 1;
            p[tope] = x;
        }
    }

    public Plato eliPila() {
        Plato x = null;
        if (esVacia()) {
            System.out.println("Pila vacia");
        } else {
            x = p[tope];
            tope = tope - 1;
        }
        return x;
    }

    public void mostrarPila() {
        pilaPlato paux = new pilaPlato(max);
        Plato x;
        while (!esVacia()) {
            x = eliPila();
            x.mostrar();
            paux.adiPila(x);
        }
        vaciarPila(paux);
        System.out.println();
    }

    public void vaciarPila(pilaPlato paux) {
        while (!paux.esVacia()) {
            Plato x = paux.eliPila();
            adiPila(x);
        }
    }
}
