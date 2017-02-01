package pe.egcc.app.service.prueba;

import pe.egcc.app.service.impl.VentaImpl;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    VentaImpl bean = new VentaImpl();
    System.out.println("8 + 6 = " + bean.sumar(8, 6));
    System.out.println("8 y 6 = " + bean.calcVenta(8, 6));
    System.out.println("BI de 100 = " + bean.calcBaseImponible(100.0));
  }
  
}
