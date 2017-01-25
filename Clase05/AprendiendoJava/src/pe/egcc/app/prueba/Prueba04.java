package pe.egcc.app.prueba;

import pe.egcc.app.model.Clase1;
import pe.egcc.app.model.Clase2;
import pe.egcc.app.model.Clase3;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {

  public static void main(String[] args) {
    Clase1 bean = new Clase2();
    Clase3 obj;
    if(bean instanceof Clase3){
      obj = (Clase3) bean;
    } else {
      System.err.println("No hay compatibilidad.");
    }
    
    
  }
  
}
