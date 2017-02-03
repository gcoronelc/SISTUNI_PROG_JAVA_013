package CostoElectro.ClasePrincipal;

import CostosElectro.Service.Menu;

/**
 * @autor John Leandro Osorio
 * @email rjleandro1975@gmail.com
 */

public class CostoElectro {

    
    public static void main(String[] args) {

        
        //Construimos el Objeto para mostrar el menú
        Menu miMenu;
		miMenu = new Menu();
        
        //Invocamos el método para mostrar el menú
        miMenu.mostrarMenu();
                  
    }
       
}
