package patrondto.service;

/**
 *
 * @author lili martha
 */
public class MateService {

    public int Ingreso(int n1, int n2, int n3) {
        return (n1 * n2 * n3);
    }

    public int Neto(int n1, int n2, int n3, int n4) {
        return (n1 * n2 * n3) - (n4);

    }
}
