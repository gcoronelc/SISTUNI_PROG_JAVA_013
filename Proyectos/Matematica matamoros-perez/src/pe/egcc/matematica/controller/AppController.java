package pe.egcc.matematica.controller;

import pe.egcc.matematica.service.MyMath;

/**
 *
 * @author jeffry
 */
public class AppController {

  public String fibonacci(int n) {
    return MyMath.fibonacci(n);
  }
  public long factorial(int num) {
    return MyMath.factorial(num);
  }
  public int mcm(int n1, int n2) {
    return MyMath.mcm(n1,n2);
  }
  public long mcd(int n1, int n2) {
    return MyMath.mcd(n1,n2);
  }
  public boolean esPrimo(int n) {
    return MyMath.esPrimo(n);
  }

  
}
