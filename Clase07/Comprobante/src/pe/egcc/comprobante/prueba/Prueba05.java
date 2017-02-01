package pe.egcc.comprobante.prueba;

import pe.egcc.comprobante.model.Item;
import pe.egcc.comprobante.service.CompAbstract;
import pe.egcc.comprobante.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {

  public static void main(String[] args) {
    // Dato
    double total = 1459.80;
    // Proceso
    CompAbstract comp = 
            CompFactory.getComp(CompFactory.COMP_BOLETA);
    Item[] repo = comp.procesar(total);
    // Reporte
    for (Item i : repo) {
      System.out.println(i.toString());
    } 
  }
  
}
