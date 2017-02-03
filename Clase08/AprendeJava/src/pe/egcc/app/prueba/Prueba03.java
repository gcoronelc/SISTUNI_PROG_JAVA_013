package pe.egcc.app.prueba;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {

  public static void main(String[] args) {
    
    Map<String,Object> rec = new HashMap<>();
    
    rec.put("COD", "P089");
    rec.put("NOM", "Computadora");
    rec.put("PRE", 3800.0);
    rec.put("MAR", "SistUNI");
    rec.put("STO", 1000);
    rec.put("ACT", true);
    
    
    System.out.println("Nombre: " + rec.get("NOM"));
    
    for(String key: rec.keySet()){
      System.out.println(key + " -> " + rec.get(key));
    }
    
  }
}
