package pe.egcc.edutecdemo.controller;

import pe.egcc.edutec.lib.Promedio;

/**
 *
 * @author Gustavo Coronel
 */
public class PromController {
  
  private Promedio promedio;

  public PromController() {
    promedio = new Promedio();
  }
  
  public int promediar(int n1, int n2) {
    return promedio.promediar(n1, n2);
  }


  
}
