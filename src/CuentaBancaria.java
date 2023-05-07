//creamos la clase compuesta e implementamos la cuenta
import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria implements Cuenta{
    
    //tendremos listas de cuentas e inicializamos con array la lista de tipo cuenta
    private List<Cuenta> listaCuenta=new ArrayList<Cuenta>();

    //en detalle de la cuenta mostraremos la lista de arreglos y llamaremos
    //al metodo detallado de las cuentas respectivas ya sea cuenta de ahorro o cuenta corriente
    @Override
    public void mostrarDetalleCuenta() {
        for(Cuenta cuenta:listaCuenta){
            cuenta.mostrarDetalleCuenta();
        }
    }
    
    //metodo para agregar una cuenta a la lista
    public void agregarCuenta(Cuenta cuenta){
        listaCuenta.add(cuenta);
    }
    //metodo para eliminar una cuenta de la lista
    public void eliminarCuenta(Cuenta cuenta){
        listaCuenta.remove(cuenta);
    }
}
