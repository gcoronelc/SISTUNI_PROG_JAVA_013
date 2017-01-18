package pe.egcc.pagoapp.service;

import pe.egcc.pagoapp.dto.PagoDto;

/**
 *
 * @author Gustavo Coronel
 */
public class PagoService {

  public void procesar(PagoDto dto){
    // Variables
    double ingresos, renta, neto;
    // Proceso
    ingresos = dto.getHorasDia() 
            * dto.getDias() * dto.getPagoHora();
    if(ingresos > 1500.0){
      renta = ingresos * 0.08;
    } else {
      renta = 0.0;
    }
    neto = ingresos - renta;
    // Reporte
    dto.setIngresos(ingresos);
    dto.setRenta(renta);
    dto.setNeto(neto);
  }

  
}
