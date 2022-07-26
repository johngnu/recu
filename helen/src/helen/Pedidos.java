package helen;

/**
 *
 * @author desktop
 */
public class Pedidos {

    private int nroMesa;
    private Cliente cli;
    private pilaPlato pp;

    public Pedidos() {
    }

    public Pedidos(int nroMesa, Cliente cli, pilaPlato pp) {
        this.nroMesa = nroMesa;
        this.cli = cli;
        this.pp = pp;
    }

    public void mostrarPedidos() {
        System.out.println(" *** Mesa no. " + nroMesa);
        System.out.println("* cliente");
        cli.mostrarCliente();
        System.out.println("* platos");
        pp.mostrarPila();
    }

    public int getNroMesa() {
        return nroMesa;
    }

    public void setNroMesa(int nroMesa) {
        this.nroMesa = nroMesa;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public pilaPlato getPp() {
        return pp;
    }

    public void setPp(pilaPlato pp) {
        this.pp = pp;
    }

}
