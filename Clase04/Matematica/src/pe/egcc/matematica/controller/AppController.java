package pe.egcc.matematica.controller;

import pe.egcc.matematica.service.MyMath;

/**
 *
 * @author Gustavo Coronel
 */
public class AppController {

  public long factorial(int num) {
    return MyMath.factorial(num);
  }
  
}
