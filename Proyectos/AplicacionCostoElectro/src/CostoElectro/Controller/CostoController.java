/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CostoElectro.Controller;
import CostosElectro.Service.CompFactory;

/**
 *
 * @author rleandro
 */
public class CostoController {

       public String[] getTipos(){
    String[] tipos = {
      CompFactory.COMP_TELEVISOR,
      CompFactory.COMP_EQUIPO  
    };
    return tipos;
  }
 }   
    

    
 

