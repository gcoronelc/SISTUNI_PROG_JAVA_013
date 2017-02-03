

package CostosElectro.Service;
/**
 * @autor John Leandro Osorio
 * @email rjleandro1975@gmail.com
 */

import CostosElectro.View.Guardar;
import java.io.*;
import java.util.StringTokenizer;

//Subclase concreta  que extiende a la superclase abstracta
public class Televisor extends Electro implements Guardar {
    
    //Variables de instancia propias de la subclase concreta
    protected float tamañoPulgadas=0;
    
    //sobreescribimos el método abstracto
    @Override
    protected void calcularCostoTotal(){
        
        costoTotal=(costoBase - (costoBase*descuento/100) );
        
    }//fin método calcularCostoTotal()
   
        //sobreescribimos el método abstracto
    @Override
    protected void mostrarCostoTotal(){
        
        System.out.printf("El costo total del televisor marca  %s con tamaño de %.0f pulgadas, cuyo precio base era %.0f y descuento de %.0f porciento es %.2f soles \n ",marca,tamañoPulgadas,costoBase,descuento,costoTotal);
        
    }//fin método mostrarCostoTotal()
    
    //SobreEscritura de la Interface
    @Override
    public void guardarEnTXT(){

       //Variable para almacenar la cadena que se desea guardar 
    String Cadena; 
        try{
   //Mensaje indicando la operación a realizar
           System.out.printf("Los datos del televisor se guardarán en un Fichero de Texto \n");
            //Defino un flujo hacia el fichero que se desea escribir.
            //Crea el fichero si no existe
            FileWriter fw = new FileWriter("guardarCostosTv.txt",true);


         //configuramos la cadena de datos que se enviará al fichero
            Cadena = marca + ";" + tamañoPulgadas + ";" + costoBase + ";" + descuento + ";" + costoTotal + "\n";
        //Escribimos en el fichero.
            fw.write(Cadena);
       //Mensaje indicando la operación realizada
         System.out.printf("Los datos se han guardado en el fichero CostosTv.txt \n");
      //Cierro el flujo de datos del fichero
            fw.close(); 
            
        //Bloque catch que va junto con el try
            //Excepcion de entrada y salida IOException
           }catch(IOException e){
    //Imprimo el error que llegara a presentarse
            System.out.println("Error E/S: "+e);
        }              
    }
    
    //Sobreescritura de la interface
      @Override
    public void mostrarTXT(){
       //Mensaje indicando la operación a realizar
        System.out.printf("Se muestran los datos \n");
 //Lectura del archivo con tokens
  //Todo dentro de un bloque try-catch
        try {
            //abrir el archivo para lectura indicando en el parámetro el archivo de texto que se quiere leer
            BufferedReader fileIN = new BufferedReader(new FileReader ("guardarCostosTv.txt"));
            //Se lee la primera linea
            String line = fileIN.readLine();
            //mientras se encuentre datos en el archivo (mientras hayan líneas para leer)      
            while (line != null){
                //Define un objeto de la clase StringTokenizer
                StringTokenizer mistokens = new StringTokenizer(line, ";"); 
                
                 //Se guarda cada dato antes del token (;) en cada variable
                marca = mistokens.nextToken().trim();
                 //Los datos que provienen del fichero son datos String, por tanto hay que hacer un parse
           
                //en este caso Float.parseFloat convertirá el dato String extraído por nextToken a un valor Float
                tamañoPulgadas= Float.parseFloat(mistokens.nextToken().trim());
                costoBase = Float.parseFloat(mistokens.nextToken().trim());
                descuento = Float.parseFloat(mistokens.nextToken().trim());
                costoTotal= Float.parseFloat(mistokens.nextToken().trim());
                
                //Se organiza la cadena del mensaje a mostrar al usuario.  El caracter "\n" significa salto de línea
                String Mensaje = "DATOS DE ELECTRODOMÉSTICO ALMACENADO \n Marca: " + marca + "\nTamaño en Pulgadas: " + 
                        tamañoPulgadas + "\nEl costo base es: " + costoBase + "\nEl descuento fue: " + descuento+ "\nEl costo total es: " + costoTotal+"\n\n"; 
             //Se muestra el mensaje configurado en la cadena
                System.out.printf("%s",Mensaje);       
                 //Se lee la siguiente línea del archivo de texto
                line = fileIN.readLine();               
            }
                        
    //Si no hay más datos se debe cerrar el archivo
            fileIN.close();
  //Bloque catch para la excepción de no encontrar el archivo
        }catch (FileNotFoundException ex){
            System.out.printf("No se encontro el archivo \n");
 //Bloque catch para la excepción de errores de entrada y salida
        }catch (IOException ex){
             System.out.println("Error E/S: "+ex);
        }
    }
       @Override
    public void limpiarTXT(){
		File fichero = new File("guardarCostosTv.txt");
         if (fichero.delete()) {
             System.out.println("El fichero ha sido borrado satisfactoriamente");
		 }
       
     }
    
    
    
    
    
    
    //Métodos set y get para las variables de instancia propias de la subclase
        protected void setTamañoPulgadas(float tamañoPulgadas){
        this.tamañoPulgadas=tamañoPulgadas;
    }//fin método setTamañoPulgadas
    
    protected float getTamañoPulgadas(){
        return tamañoPulgadas;
    }//fin método getTamañoPulgadas()
    
}// fin subclase Televisor
