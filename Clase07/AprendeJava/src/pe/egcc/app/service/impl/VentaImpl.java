package pe.egcc.app.service.impl;

import pe.egcc.app.service.spec.MateSpec;
import pe.egcc.app.service.spec.VentaSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class VentaImpl extends AbstractVenta
        implements MateSpec, VentaSpec {

  @Override
  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }

  @Override
  public double calcVenta(double precio, int cant) {
    return (precio * cant);
  }

  public double calcBaseImponible(double total) {
    return total / (1 + IGV);
  }

}
