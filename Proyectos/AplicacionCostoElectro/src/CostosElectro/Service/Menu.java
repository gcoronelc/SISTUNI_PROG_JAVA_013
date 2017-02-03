package CostosElectro.Service;

import java.util.Scanner;

/**
 * @autor John Leandro Osorio
 * @email rjleandro1975@gmail.com
 */
public class Menu {
    
    //Construyo los objetos por fuera de los métodos para que estén dispónibles a cualquier método de la clase
    
    //Objeto de la clase televisor
        Televisor miTelevisor = new Televisor();
    //Objeto de la clase equipo
        EquipoSonido miEquipo=new EquipoSonido();
  
    //Objeto de la clase Scanner para capturar datos
        Scanner miCaptura = new Scanner(System.in);
    
        
     public void mostrarMenu(){
    
        int decision=0;//variable para capturar la decisión del usuario
		
        //Mostramos las distintas opciones
        System.out.printf("Elija electrodoméstico \n");
        System.out.printf("1.- Televisor \n");
        System.out.printf("2.- Equipo de Sonido \n");
        System.out.printf("3.- Leer archivo de Texto de Televisores \n");
        System.out.printf("4.- Leer archivo de Texto de Equipo Sonido \n");
		System.out.printf("5.- Limpiar archivo de Texto de Televisores \n");
		System.out.printf("6.- Limpiar archivo de Texto de Equipo Sonido \n");
		System.out.printf("7.- Salir \n");
        //capturamos la decision del usuario
        decision= miCaptura.nextInt();
        
        //Evaluamos mediante un Switch la decision del usuario
        switch(decision){
            //Caso en el que se digita el número 1
			case 1:
                     
				     System.out.printf("Eligió Televisor \n");
                     miCaptura.nextLine();//Generalmente se limpia el buffer antes de introducir líneas de caracteres		 
                     System.out.printf("Ingrese Marca Televisor \n");
                     miTelevisor.setMarca(miCaptura.nextLine());//Invocamos el método setMarca y pasamos como argumentos lo que se capture por teclado
                     System.out.printf("Ingrese tamaño en pulgadas del Televisor \n");
                     miTelevisor.setTamañoPulgadas(miCaptura.nextFloat());//Invocamos el método setTamañoPulgadas y pasamos como argumentos lo que se capture por teclado

                     System.out.printf("Ingrese costo base del Televisor \n");
                     miTelevisor.setCostoBase(miCaptura.nextFloat());//Invocamos el método setCostoBase y pasamos como argumentos lo que se capture por teclado

                     System.out.printf("Ingrese Porcentaje de descuento de Televisor \n");
                     miTelevisor.setDescuento(miCaptura.nextFloat());//Invocamos el método setDescuento y pasamos como argumentos lo que se capture por teclado

                     miTelevisor.calcularCostoTotal();

                     miTelevisor.mostrarCostoTotal();
                    
                     miTelevisor.guardarEnTXT();//guardamos en fichero
                     break;   
				  
            //Caso en el que se digita el número 2   
            case 2:
                    System.out.printf("Eligió Equipo de Sonido \n"); 
                 
					miCaptura.nextLine();//Generalmente se limpia el buffer antes de introducir líneas de caracteres
                    
					System.out.printf("Ingrese Marca del Equipo\n");
                    miEquipo.setMarca(miCaptura.nextLine());//Invocamos el método setMarca y pasamos como argumentos lo que se capture por teclado
			       
					System.out.printf("Ingrese la potencia en Watts del equipo de Sonido\n");
                    miEquipo.setPotenciaWatts(miCaptura.nextFloat());//Invocamos el método setPotenciaWatts y pasamos como argumentos lo que se capture por teclado

                    System.out.printf("Ingrese costo base del Equipo de Sonido \n");
                    miEquipo.setCostoBase(miCaptura.nextFloat());//Invocamos el método setCostoBase y pasamos como argumentos lo que se capture por teclado

                    System.out.printf("Ingrese descuento del Equipo de Sonido en porcentaje \n");
                    miEquipo.setDescuento(miCaptura.nextFloat());//Invocamos el método setDescuento y pasamos como argumentos lo que se capture por teclado

                    miEquipo.calcularCostoTotal();//Invocamos el método calcularCostoTotal del objeto miEquipo

                    miEquipo.mostrarCostoTotal();//Invocamos el método mostrarCostoTotal del objeto miEquipo
                    
                    miEquipo.guardarEnTXT();//guardamos en fichero
					                                                   
                 break;
                
            case 3:
                //Mostramos la información almacenada en el fichero del televisor
                miTelevisor.mostrarTXT();
                break;
            
            case 4:
                //mostramos la información almacanda en el fichero del equipo
                miEquipo.mostrarTXT();
                break;
			case 5:
				//para limpiar fichero de televisor
				miTelevisor.limpiarTXT();
				 break;
			case 6:
               //para limpiar fichero de televisor
				miEquipo.limpiarTXT();
                 break;        
			case 7:
				//salir
			    System.out.printf("Chauuu!!! \n");
				System.exit(0);
				break;   
			//Caso en el que se digita cualquier otro número
				     		
            default:
                System.out.printf("Ingresó una opción NO VÁLIDA \n");
                break;
   	}   
       
        
        
    }
    
}
