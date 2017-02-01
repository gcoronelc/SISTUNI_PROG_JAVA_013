package pe.egcc.comprobante.service;

import pe.egcc.comprobante.model.Item;

/**
 *
 * @author Gustavo Coronel
 */
public abstract class CompAbstract {
  
  public static final double IGV = 0.18;
  public static final double SERVICIO = 0.10;
  
  public abstract Item[] procesar(double total);
  
  
  public double redondear(double valor){
    valor = Math.round( valor * 100.0 );
    valor = valor / 100.0;
    return valor;
  }
  
}
