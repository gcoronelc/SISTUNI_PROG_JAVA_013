
package pagosapp.PagosApp.prueba;

import pagosapp.PagosApp.service.PagosService;

/**
 *
 * @author leslie
 */
public class Prueba1 {
  public static void main(String[] args) {
    //dato
    double hora=10.0;
    double dia=11.0;
    double pago=6;
    // proceso
    PagosService service=new PagosService();
    double importe=service.calcularImporte(hora, dia, pago);
    double impuesto=service.calcularImpuesto(importe);
    double total=service.calcularTotal(importe);
    //reporte
    System.out.println("Importe: "+ importe);
    System.out.println("Impuesto: "+ impuesto);
    System.out.println("Total: "+ total);
  }
  }
