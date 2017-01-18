package pe.calculopagotrabajadores.prueba;

import pe.calculopagotrabajadores.service.CalculoPagoTrabajadoresService;

/**
 * @autor John Leandro Osorio
 * @email rjleandro1975@gmail.com
 */

public class CalculoPagoTrabajadoresPrueba {
	
	  public static void main(String[] args) {
    // Datos
	double hora = 6;
	double dia=20;
	double pagohora=80;
    //Resultado
    CalculoPagoTrabajadoresService service = new CalculoPagoTrabajadoresService();
    double ingreso = service.calcularIngreso(hora,dia,pagohora);
    double renta = service.calcularRenta(hora,dia,pagohora);
	double neto = service.calcularNeto(hora,dia,pagohora);
	
    // Reporte
    System.out.println("Ingreso Mesual: " + ingreso);
    System.out.println("Impuesto a la Renta(8%): " + renta);
    System.out.println("Total Neto: " + neto);
  }
  
	
	
	
	
}
