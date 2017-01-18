
package BObject;

import java.util.ArrayList;
import java.util.List;
import VObject.EmpleadoVO;


public class EmpleadoBO {
    //lista de tipo Empleado
    List<EmpleadoVO> empleados;
    
    //constructor
    public EmpleadoBO(){
        empleados = new ArrayList<>();
        EmpleadoVO empleado1 = new EmpleadoVO(0,6,20,10);
        EmpleadoVO empleado2 = new EmpleadoVO(1,8,22,30);
        empleados.add(empleado1);
        empleados.add(empleado2);
        
    }
    
    public EmpleadoVO obtenerEmpleado(int id){
        return empleados.get(id);
    }
    
    //obtiene toda la lista de empleados
    public List<EmpleadoVO> obtenerEmpleados(){
	return empleados;
	}
	
    
    public void mostrarVO(EmpleadoVO empleado){
        System.out.println("ID Empleado: "+empleado.getId());
        System.out.println("Horas Día: "+empleado.gethDia());
        System.out.println("Número de días: "+empleado.getnDias());
        System.out.println("Pago por Hora: "+empleado.getpHora());
    }
    
    public void pagoDTO(EmpleadoVO empleado){
        int ingresos = empleado.gethDia()*empleado.getnDias()*empleado.getpHora();
        double renta = 0;
        if(ingresos>1500){
            renta = ingresos*0.08;
        }
        else
            renta = 0;
        double neto = ingresos - renta;
        System.out.println("Ingresos: "+ingresos);
        System.out.println("Renta: "+renta);
        System.out.println("Neto: "+neto);
        
    }
    
    
}
