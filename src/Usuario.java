// primero creamos una clase de usuario que tendra el metodo principal
public class Usuario {
    public static void main(String[] args){
        //creamos 3 objetos de cuenta de ahoro con saldo
        CuentaDeAhorro bbva      = new CuentaDeAhorro("BBVA", 1900.00);
        CuentaDeAhorro bcp       = new CuentaDeAhorro("BCP", 1800.00);
        CuentaDeAhorro interbank = new CuentaDeAhorro("INTERBANK", 1600.00);
        
        //creamos una cuenta bancaria y asignamos las cuentas bancaria de ahorro variable
        CuentaBancaria CuentaBancariaDeAhorro = new CuentaBancaria();
        CuentaBancariaDeAhorro.agregarCuenta(bbva);
        CuentaBancariaDeAhorro.agregarCuenta(bcp);
        CuentaBancariaDeAhorro.agregarCuenta(interbank);
        
        //crearemos dos objetos de cuentas corrientes
        CuentaCorriente city   = new CuentaCorriente("CITY", 3500.00);
        CuentaCorriente banbif = new CuentaCorriente("BANBIF", 5500.00);
        
        //y las cuentas correientes creadas las agregamos a la cuenta bancaria actual
        CuentaBancaria CuentaBancariaActual = new CuentaBancaria();
        CuentaBancariaActual.agregarCuenta(city);
        CuentaBancariaActual.agregarCuenta(banbif);
        
        //crearemos todas las cuentas bancarias y le agregamos la cuenta de ahorro como la cuenta actual mostrando su detalle de todos los bancos
        CuentaBancaria todasCuentasBancarias = new CuentaBancaria();
        todasCuentasBancarias.agregarCuenta(CuentaBancariaDeAhorro);
        todasCuentasBancarias.agregarCuenta(CuentaBancariaActual);
        todasCuentasBancarias.mostrarDetalleCuenta();
        
        System.out.println("--------------CUENTA ACTUAL---------------------------");
        //podemos eliminar la cuenta bancaria de ahorros de todas las cuentas bancarias usando el metodo de eliminar cuenta 
        todasCuentasBancarias.eliminarCuenta(CuentaBancariaDeAhorro);
        //volvemos a mostrar todo el detalle de la cuenta actualizada
        todasCuentasBancarias.mostrarDetalleCuenta();
    }
}
