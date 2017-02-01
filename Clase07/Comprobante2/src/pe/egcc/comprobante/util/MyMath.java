package pe.egcc.comprobante.util;

/**
 *
 * @author Gustavo Coronel
 */
public final class MyMath {

  private MyMath() {
  }

  

  public static boolean isDouble(String valor){
    return  valor.matches("\\d+") || 
            valor.matches("^[-+][0-9]+") ||
            valor.matches("^[0-9]+\\.[0-9]+$") ||
            valor.matches("^[-+][0-9]+\\.[0-9]+$");
  }
  
}
