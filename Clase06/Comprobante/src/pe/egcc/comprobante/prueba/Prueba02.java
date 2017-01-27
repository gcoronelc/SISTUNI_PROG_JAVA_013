package pe.egcc.comprobante.prueba;

import pe.egcc.comprobante.model.Item;
import pe.egcc.comprobante.service.BoletaService;
import pe.egcc.comprobante.service.CompAbstract;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {

  public static void main(String[] args) {
    // Dato
    double total = 1459.80;
    // Proceso
    CompAbstract comp = new BoletaService();
    Item[] repo = comp.procesar(total);
    // Reporte
    for (Item i : repo) {
      System.out.println(i.toString());
    }
    
  }
  
}
