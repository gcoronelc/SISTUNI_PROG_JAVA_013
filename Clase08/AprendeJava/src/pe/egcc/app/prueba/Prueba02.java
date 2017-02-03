package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {


  public static void main(String[] args) {
    
    List<String> lista = new ArrayList<>();
       
    lista.add("Chiclayo");
    lista.add("Cuzco");
    lista.add("Arequipa");
    lista.add("Chachapoyas");
    lista.add("Huancayo");
    lista.add("Ica");
    lista.add("Trujillo");
    lista.add("Iquitos");
    lista.set(6, "Pacherrez");
    
    
    System.out.println("Recorrido indexado");
    System.out.println("===================");
    for (int i = 0; i < lista.size(); i++) {
      System.out.println(lista.get(i));      
    }
    System.out.println("");
    
    System.out.println("Recorrido con Iterator");
    System.out.println("======================");
    Iterator<String> i = lista.iterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
    System.out.println("");
    
    System.out.println("Recorrido tipo colección: foreach");
    System.out.println("=================================");
    for(String s: lista){
      System.out.println(s);
    }
    System.out.println("");
    
    System.out.println("Recorrido con expresiones lambda");
    System.out.println("=================================");
    lista.stream().forEach(s -> System.out.println(s) );
    System.out.println("");
    
    
  }
  
}
