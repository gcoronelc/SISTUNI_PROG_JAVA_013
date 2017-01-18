package VObject;

public class EmpleadoVO {

    private int id;
    private int hDia;
    private int nDias;
    private int pHora;

    public EmpleadoVO(int id, int hDia, int nDias, int pHora) {
        this.id = id;
        this.hDia = hDia;
        this.nDias = nDias;
        this.pHora = pHora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int gethDia() {
        return hDia;
    }

    public void sethDia(int hDia) {
        this.hDia = hDia;
    }

    public int getnDias() {
        return nDias;
    }

    public void setnDias(int nDias) {
        this.nDias = nDias;
    }

    public int getpHora() {
        return pHora;
    }

    public void setpHora(int pHora) {
        this.pHora = pHora;
    }

}
