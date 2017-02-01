package pe.egcc.comprobante.service;

import pe.egcc.comprobante.model.Item;

/**
 *
 * @author Gustavo Coronel
 */
public class BoletaService extends CompAbstract {

  @Override
  public Item[] procesar(double total) {
    // Variables
    double servicio, totalGeneral;
    // Proceso
    servicio = redondear(total * SERVICIO);
    totalGeneral = redondear(total + servicio);
    // Reporte
    Item[] repo = {
      new Item("Total", total),
      new Item("Servicio", servicio),
      new Item("Total General", totalGeneral),};
    return repo;
  }

}
