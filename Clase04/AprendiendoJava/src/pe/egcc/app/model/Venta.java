package pe.egcc.app.model;

/**
 *
 * @author Gustavo Coronel
 */
public class Venta {

  public static double igv = 0.18;
  public String cliente;
  public double importe;
  
  static {
    igv = 0.20;
  }
  
}
