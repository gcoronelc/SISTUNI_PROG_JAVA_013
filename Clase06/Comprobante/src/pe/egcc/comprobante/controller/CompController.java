package pe.egcc.comprobante.controller;

import pe.egcc.comprobante.model.Item;
import pe.egcc.comprobante.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 */
public class CompController {
  
  
  public String[] getTipos(){
    String[] tipos = {
      CompFactory.COMP_BOLETA,
      CompFactory.COMP_FACTURA
    };
    return tipos;
  }

  public Item[] procesar(String tipo, double total) {
    return CompFactory.getComp(tipo).procesar(total);
  }
  
}
