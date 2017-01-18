package pe.egcc.edutec.lib;

/**
 *
 * @author Gustavo Coronel
 */
public class Promedio {

  public int promediar(int n1, int n2){
    int p;
    p = (n1 + n2) / 2;
    return p;
  }
  
  public int promediar(int n1, int n2, int n3){
    int p;
    p = (n1 + n2 + n3) / 3;
    return p;
  }
  
  public int promediar(int n1, int n2, int n3, int n4){
    int p;
    p = (n1 + n2 + n3 + n4) / 4;
    return p;
  }
  
  public int promediar(int n1, int n2, int n3, int n4, int n5){
    int p;
    p = (n1 + n2 + n3 + n4 + n5) / 5;
    return p;
  }
    
}
