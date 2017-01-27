package pe.egcc.comprobante.service;

import pe.egcc.comprobante.model.Item;

/**
 *
 * @author Gustavo Coronel
 */
public class FacturaService extends CompAbstract{

  @Override
  public Item[] procesar(double total) {
    // Variables
    double consumo, impuesto, servicio, totalGeneral;
    // Proceso
    consumo = redondear( total / (1 + IGV) );
    impuesto = redondear( total - consumo );
    servicio = redondear( total * SERVICIO );
    totalGeneral = redondear( total + servicio );
    // Reporte
    Item[] repo = {
      new Item("Consumo", consumo),
      new Item("Impuesto", impuesto),
      new Item("Total", total),
      new Item("Servicio", servicio),
      new Item("Total General", totalGeneral),
    };
    return repo;
  }
  
}
