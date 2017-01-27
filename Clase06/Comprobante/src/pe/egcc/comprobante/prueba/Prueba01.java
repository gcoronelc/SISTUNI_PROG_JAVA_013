package pe.egcc.comprobante.prueba;

import pe.egcc.comprobante.model.Item;
import pe.egcc.comprobante.service.CompAbstract;
import pe.egcc.comprobante.service.FacturaService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    // Dato
    double total = 1000.0;
    // Proceso
    CompAbstract comp = new FacturaService();
    Item[] repo = comp.procesar(total);
    // Reporte
    for (Item i : repo) {
      System.out.println(i.toString());
    }
    
  }
  
}
