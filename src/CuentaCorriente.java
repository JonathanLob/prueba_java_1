//nodo o clase hoja
public class CuentaCorriente implements Cuenta{

    //tendremos variables privadas tipo cadena y double
    private String nombreBanco;
    private double saldo;
    
    //constructor de la clase con 2 argumentos
    public CuentaCorriente(String nombrebanco, double saldo){
        this.nombreBanco=nombrebanco;
        this.saldo=saldo;
    }
    
    //el metodo nos imprimira el detalle de la cuenta, nombre y saldo
    @Override
    public void mostrarDetalleCuenta() {
        System.out.println(nombreBanco+" - "+saldo);
    }
    
}
