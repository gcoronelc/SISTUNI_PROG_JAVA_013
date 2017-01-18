package pagosapp.PagosApp.service;

/**
 *
 * @author leslie
 */
public class PagosService {

    public double calcularImporte(double hora, double dia, double pago) {
        double importe;
        importe = hora * dia * pago;
        return importe;
    }

    public double calcularImpuesto(double importe) {
        double impuesto;
        impuesto = importe * 0.08;
        return impuesto;
    }

    public double calcularTotal(double importe) {
        double total;
        total = importe - calcularImpuesto(importe);
        return total;
    }
}
