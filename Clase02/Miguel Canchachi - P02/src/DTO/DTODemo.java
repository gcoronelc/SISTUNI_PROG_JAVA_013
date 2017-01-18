
package DTO;

import BObject.EmpleadoBO;
import VObject.EmpleadoVO;


public class DTODemo {
    
    public static void main(String[] args) {
        
        //objeto business object
	EmpleadoBO empleadoBusinessObject = new EmpleadoBO();
        
        //obtiene todos los empleados
	//empleadoBusinessObject.obtenerEmpleados().forEach(System.out::println);
        
        // obtiene un cliente
	System.out.println("****");
	EmpleadoVO empleado=empleadoBusinessObject.obtenerEmpleado(1);
	//System.out.println(empleado);
        
        //Mostrar Datos de Empleado
        empleadoBusinessObject.mostrarVO(empleado);
        System.out.println("****");
        //Calcular Ingresos, Renta y Neto
        empleadoBusinessObject.pagoDTO(empleado);
        
    }
}
