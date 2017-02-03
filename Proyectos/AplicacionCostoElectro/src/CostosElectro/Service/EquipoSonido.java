package CostosElectro.Service;
/**
 * @autor John Leandro Osorio
 * @email rjleandro1975@gmail.com
 */
import CostosElectro.View.Guardar;
import java.io.*;

import java.util.StringTokenizer;

//Subclase concreta  que extiende a la superclase abstracta y que implementa la interface
public class EquipoSonido extends Electro implements Guardar {
    
        
    //Variables de instancia propias de la subclase concreta
     protected float potenciaWatts=0;
    
    //sobreescribimos el método abstracto
    @Override
    protected void calcularCostoTotal(){
        
        costoTotal=(costoBase - (costoBase*descuento/100) );
        
    }//fin método calcularCostoTotal()
   
        //sobreescribimos el método abstracto
    @Override
    protected void mostrarCostoTotal(){
        
        System.out.printf("El costo total del Equipo de Sonido marca  %s con una potencia de %.0f Watts , cuyo precio base era %.0f y descuento de %.0f porciento es %.0f pesos \n ",marca,potenciaWatts,costoBase,descuento,costoTotal);
        
    }//fin método mostrarCostoTotal()
   
      //SobreEscritura de la Interface
    @Override
    public void guardarEnTXT(){

       //Variable para almacenar la cadena que se desea guardar 
    String Cadena; 
    //Todo dentro de un bloque try -catch para atrapar las execpciones
        try{
            //Mensaje indicando la operación a realizar
           System.out.printf("Los datos del equipo se guardarán en un Fichero de Texto \n");
            //Defino un flujo hacia el fichero que se desea escribir.
            //Crea el fichero si no existe
            FileWriter fw = new FileWriter("guardarCostosEquipo.txt",true);

       //configuramos la cadena de datos que se enviará al fichero
            Cadena = marca + ";" + potenciaWatts+ ";" + costoBase + ";" + descuento + ";" + costoTotal + "\n";
        //Escribimos en el fichero.
            fw.write(Cadena);
       //Mensaje indicando la operación realizada
         System.out.printf("Los datos se han guardado en el fichero CostosEquipo.txt \n");
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
        System.out.printf("Se muestran los datos del fichero\n");
 //Lectura del archivo con tokens
  //Todo dentro de un bloque try-catch
        try {
            //abrir el archivo para lectura indicando en el parámetro el archivo de texto que se quiere leer
            BufferedReader fileIN = new BufferedReader(new FileReader ("guardarCostosEquipo.txt"));
            //Se lee la primera linea 
            String line = fileIN.readLine();
            //mientras se encuentre datos en el archivo (mientras hayan líneas para leer)            
            while (line != null){
                //Define un objeto de la clase StringTokenizer
                // y pasa el token y la linea de datos leida en el parámetro
                StringTokenizer mistokens = new StringTokenizer(line, ";"); 
                
                //Se guarda cada dato antes del token (;) en cada variable
                marca = mistokens.nextToken().trim();
                //Los datos que provienen del fichero son datos String, por tanto hay que hacer un parse
                //Un parse convierte un tipo de datos a otro
                //en este caso Float.parseFloat convertirá el dato String extraído por nextToken a un valor Float
                potenciaWatts= Float.parseFloat(mistokens.nextToken().trim());
                costoBase = Float.parseFloat(mistokens.nextToken().trim());
                descuento = Float.parseFloat(mistokens.nextToken().trim());
                costoTotal= Float.parseFloat(mistokens.nextToken().trim());
                
                //Se organiza la cadena del mensaje a mostrar al usuario.  El caracter "\n" significa salto de línea
                String Mensaje = "DATOS DE ELECTRODOMÉSTICO ALMACENADO \n Marca: " + marca + "\nPotencia en Watts: " + 
                        potenciaWatts + "\nEl costo base es: " + costoBase + "\nEl descuento fue: " + descuento+ "\nEl costo total es: " + costoTotal+"\n\n"; 
                //Se muestra el mensaje configurado en la cadena
                System.out.printf("%s",Mensaje);       
                //Se lee la siguiente línea del archivo de texto
                line = fileIN.readLine();               
            }//Fin del while
            
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
		File fichero = new File("guardarCostosEquipo.txt");
         if (fichero.delete()) {
             System.out.println("El fichero ha sido borrado satisfactoriamente");
		 }
     }
        
    //Métodos set y get para las variables de instancia
        protected void setPotenciaWatts(float potenciaWatts){
        this.potenciaWatts=potenciaWatts;
    }//fin método setPotenciaWatts
    
    protected float getPotenciaWatts(){
        return potenciaWatts;
    }//fin método getPotenciaWatts
    
    
    
    
    
    
    
    
    
    
    
}//fin subclase Equipo
