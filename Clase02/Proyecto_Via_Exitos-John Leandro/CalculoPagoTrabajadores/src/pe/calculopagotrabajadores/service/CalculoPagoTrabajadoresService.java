package pe.calculopagotrabajadores.service;

/**
 * @autor John Leandro Osorio
 * @email rjleandro1975@gmail.com
 */
public class CalculoPagoTrabajadoresService {

    public double calcularIngreso(double hora, double dia, double pagohora) {
        double importe2;
        importe2 = (hora * dia * pagohora);
        return importe2;
    }

    public double calcularRenta(double hora, double dia, double pagohora) {
        double renta;
        renta = calcularIngreso(hora, dia, pagohora) * 0.08;
        return renta;
    }

    public double calcularNeto(double hora, double dia, double pagohora) {
        double neto;
        neto = calcularIngreso(hora, dia, pagohora) - calcularRenta(hora, dia, pagohora);
        return neto;
    }

}
