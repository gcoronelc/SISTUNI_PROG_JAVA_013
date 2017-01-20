package pe.egcc.matematica.service;

/**
 *
 * @author Gustavo Coronel
 */
public final class MyMath {

  private MyMath() {
  }
  
  @SuppressWarnings("empty-statement")
  public static long factorial(int n){ 
    long f = 1;
    for(int i=2; i <= n; f *= i++);
    return f;
  }
    
  public static int mcd(int n1, int n2){ 
    return 0;
  }
  
  public static int mcm(int n1, int n2){ 
    return 0;
  }
  
  public static String fibonacci(int n){ 
    return "";
  }
  
  public static boolean esPrimo(int n){ 
    return false;
  }
   
}
