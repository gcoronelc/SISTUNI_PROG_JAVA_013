package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {


  public static void main(String[] args) {
    
    List<String> lista = new ArrayList<>();
    
    mostrar(lista);
    
    lista.add("Chiclayo");
    lista.add("Cuzco");
    lista.add("Arequipa");
    lista.add("Chachapoyas");
    lista.add("Huancayo");
    lista.add("Ica");
    lista.add("Trujillo");
    
    mostrar(lista);
    
    lista.add(3, "Iquitos");
    
    mostrar(lista);
    
    lista.remove(4);
    lista.set(6, "Pacherrez");
    
    mostrar(lista);
  }

  private static void mostrar(List<String> lista) {
    System.out.println("----------------------------");
    if(lista.isEmpty()){
      System.out.println("Lista vacia.");
      return;
    }
    // Recorrido indexado
    for (int i = 0; i < lista.size(); i++) {
      System.out.println(lista.get(i));
    }
  }
  
}
