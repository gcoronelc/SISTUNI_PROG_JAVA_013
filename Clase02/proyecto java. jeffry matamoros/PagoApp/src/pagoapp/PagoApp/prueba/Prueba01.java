
package pagoapp.PagoApp.prueba;
import pagoapp.PagoApp.service.PagoService;
/**
 *
 * @author jeffry
 */
public class Prueba01 {
  public static void main(String[] args) {
    //dato
    double horas=18.0;
    double dias=15.0;
    double pago=10;
    // proceso
    PagoService service=new PagoService();
    double importe=service.calcularImporte(horas, dias, pago);
    double impuesto=service.calcularImpuesto(importe);
    double total=service.calcularTotal(importe);
    //reporte
    System.out.println("Importe: "+ importe);
    System.out.println("Impuesto: "+ impuesto);
    System.out.println("Total: "+ total);
  }
}
