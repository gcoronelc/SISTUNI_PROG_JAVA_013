package pe.egcc.app.prueba;

import pe.egcc.app.model.Producto;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 * @github github.com/gcoronelc
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    // Un Objeto
    Producto obj = new Producto();
    // Mostrar el producto
    mostrar(obj);
    // Asignar valores al objeto
    obj.setNombre("Coca Cola");
    obj.setPrecio(2.80);
    obj.setStock(200);
    obj.setActivo(true);
    // Mostrar el producto
    mostrar(obj);
  }

  private static void mostrar(Producto obj) {
    System.out.println("------------------------------");
    System.out.println("Nombre: " + obj.getNombre());
    System.out.println("Precio: " + obj.getPrecio());
    System.out.println("Stock: " + obj.getStock());
    System.out.println("Activo: " + obj.isActivo());
  }
  
}
