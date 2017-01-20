package pe.egcc.app.prueba;

import pe.egcc.app.model.Venta;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    
    System.out.println("Venta.igv = " + Venta.igv);
    
    Venta v1 = new Venta();
    Venta v2 = new Venta();
    
    v1.cliente = "Gustavo";
    v1.importe = 4500.0;
        
    v2.cliente = "Claudia";
    v2.importe = 5600.0;
    
    Venta.igv = 0.45;
    
    System.out.println("v1.cliente = " + v1.cliente);
    System.out.println("v1.importe = " + v1.importe);
    System.out.println("v1.igv = " + v1.igv);
    
    System.out.println("v2.cliente = " + v2.cliente);
    System.out.println("v2.importe = " + v2.importe);
    System.out.println("v2.igv = " + v2.igv);
  }
  
}
