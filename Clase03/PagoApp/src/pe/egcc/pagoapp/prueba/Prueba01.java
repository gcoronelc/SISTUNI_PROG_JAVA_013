package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.dto.PagoDto;
import pe.egcc.pagoapp.service.PagoService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    // Dato
    PagoDto dto = new PagoDto(6, 20, 90);
    // Proceso
    PagoService service = new PagoService();
    service.procesar(dto);
    // Reporte
    System.out.println("Ingresos: " + dto.getIngresos());
    System.out.println("Renta: " + dto.getRenta());
    System.out.println("Neto: " + dto.getNeto());
  }
  
}
