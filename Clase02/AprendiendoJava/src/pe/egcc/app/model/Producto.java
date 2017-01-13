package pe.egcc.app.model;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 * @github github.com/gcoronelc
 */
public class Producto {

  private String nombre;
  private double precio;
  private int stock;
  private boolean activo;

  /**
   * Constructor por defecto.
   */
  public Producto() {
    // this.nombre = "Cerveza";
    // this.precio = 15.0;
    // this.stock = 400;
    // this.activo = true;
    this("Cerveza", 15.0, 400, true);
    System.out.println("Objeto creado.");
  }
  
  /**
   * Constructor con parámetros.
   * 
   * @param nombre
   * @param precio
   * @param stock
   * @param activo 
   */
  public Producto(String nombre, double precio, int stock, boolean activo) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
    this.activo = activo;
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau objeto.");
  }
  
  

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

}
