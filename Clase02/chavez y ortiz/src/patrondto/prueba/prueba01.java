
package patrondto.prueba;

import patrondto.service.MateService;

public class prueba01 {
    public static void main(String[] args) {
        //datos 
        int n1= 6;
        int n2= 20;
        int n3= 80;
        int n4= 768;
        
        // proceso
        
        MateService mateService = new MateService();
        int Ingreso= mateService.Ingreso(n1, n2, n3);
        
        int Neto=  mateService.Neto(n1, n2, n3, n4);
        //Reporte
        
        System.out.println("ingreso: "+ Ingreso);
       
        System.out.println("neto: " + Neto);
    }
    
}
