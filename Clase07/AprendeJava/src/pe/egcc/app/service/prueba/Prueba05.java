package pe.egcc.app.service.prueba;

import pe.egcc.app.service.model.Clase1;
import pe.egcc.app.service.model.Clase2;
import pe.egcc.app.service.model.Clase3;
import pe.egcc.app.service.spec.MateSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {

  public static void main(String[] args) {

    Clase1 bean = new Clase2();

    Object o = bean; // UpCasting

    Clase2 m = (Clase2) bean; // DownCasting

    if (bean instanceof Clase3) {
      Clase3 n = (Clase3) bean;
    } else {
      System.err.println("No hay compatibilidad");
    }
    
    MateSpec r = (MateSpec) bean;
    
  }

}
