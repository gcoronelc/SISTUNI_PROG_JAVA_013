/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.service.model;

import pe.egcc.app.service.spec.MateSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class Clase2 extends Clase1 implements MateSpec{

  @Override
  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }
  
}
