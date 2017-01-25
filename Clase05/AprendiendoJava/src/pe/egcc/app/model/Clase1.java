
package pe.egcc.app.model;

/**
 *
 * @author Gustavo Coronel
 */
public class Clase1 {

  public Clase1() {
    System.out.println("Java Corazon, es un sentimiento.");
  }
  
  public Clase1(String nombre) {
    System.out.println("Hola " + nombre);
  }
  
  
  
  /**
   * Calcula la suma de dos números.
   * 
   * @param n1 Valor del número 1.
   * @param n2 Valor del número 2.
   * @return Retorna la suma de los dos números.
   */
  public int sumar(int n1, int n2){
    return (n1 + n2);
  }
  
}
