package pagoapp.PagoApp.service;

/**
 *
 * @author jeffry
 */
public class PagoService {

    public double calcularImporte(double horas, double dias, double pago) {
        double importe;
        importe = horas * dias * pago;
        return importe;
    }

    public double calcularImpuesto(double importe) {
        double impuesto;
        if (importe <= 1500) {
            impuesto = 0;
        } else {
            impuesto = importe * 0.08;
        }
        return impuesto;
    }

    public double calcularTotal(double importe) {
        double total;
        total = importe - calcularImpuesto(importe);
        return total;
    }
}
