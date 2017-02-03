package empleado.Prueba01;

//prueba de la superclase empleado por comision
import empleado.Service.EmpleadoPorComision;

public class PruebaPrimera {

    public static void main(String[] args) {
        //se crea la instancia del obj empleado por comision
        EmpleadoPorComision empleado = new EmpleadoPorComision("Victor", "Asato","Activon", "21345231", 10000.70, 0.06);
        System.out.printf("%s %s\n","Nombres: ", empleado.getNombres());
        System.out.printf("%s %s\n","Apellido Paterno ", empleado.getApePaterno());
        System.out.printf("%s %s\n","apellido Materno ", empleado.getApeMaterno());
        System.out.printf("%s %s\n","DNI: ", empleado.getDni());
        System.out.printf("%s %s\n","La venta bruta es: ",empleado.getVentasBrutas());
        System.out.printf("%s %s\n","La Tarifa de Comision es:" ,empleado.getComision());    
        System.out.printf("%s %s\n","El Pago es:" ,empleado.ingresos());
    }
    
    
}
