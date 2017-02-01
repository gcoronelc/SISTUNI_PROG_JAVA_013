package pe.egcc.comprobante.prueba;

import pe.egcc.comprobante.model.Item;
import pe.egcc.comprobante.service.BoletaService;
import pe.egcc.comprobante.service.CompAbstract;
import pe.egcc.comprobante.service.FacturaService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {

  public static void main(String[] args) {
    
    CompAbstract[] objs = {
      new FacturaService(),
      new BoletaService(),
      new FacturaService(),
      new BoletaService()
    };
    
    Item[] repo = objs[1].procesar(1000);
    
    for (Item i : repo) {
      System.out.println(i);
    }
    
  }
  
}
