package aplicacioncostoelectrodomestico;


/**
 *  @author ELFARDIDIER
 *   Declaración de super clase abstracta.
 *  Sus métodos no poseen implementación
 */
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.1A89318A-3F83-72A1-9A29-2ED571A6FE45]
// </editor-fold> 
public abstract class Electrodomestico {

    /**
     *  Variables de instancia abstractas. No necesitan implementación(valores)
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7863E90F-6E2B-05BB-A7AA-2E4D9F74A541]
    // </editor-fold> 
    protected String marca;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AE402C01-48CE-DB88-E5D1-628910BC0032]
    // </editor-fold> 
    protected float costoBase;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B0878FD0-C846-D857-394F-20B25A3489AF]
    // </editor-fold> 
    protected float descuento;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.97D6BB0D-9BC7-95BA-F2A8-9934B05D56D6]
    // </editor-fold> 
    protected float costoTotal;

    /**
     *  método abstracto. No necesita implementación (código)
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8C961878-34B8-E1A4-8F53-814EFBB5B2D5]
    // </editor-fold> 
    protected abstract void calcularCostoTotal ();

    /**
     *  método abstracto. No necesita implementación (código)
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F30737E4-317D-5941-4F58-850BF3A7A0C6]
    // </editor-fold> 
    protected abstract void mostrarCostoTotal ();

    /**
     *  Métodos set y get para las variables de instancia
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D7889E16-656B-AFA3-1533-FD123DDE9018]
    // </editor-fold> 
    protected void setDescuento (float valor) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.252DE356-E80C-4468-4518-636649B3F9F3]
    // </editor-fold> 
    protected float getDescuento () {
        return 0.0f;
    }

    /**
     *  Métodos set y get para las variables de instancia
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F7FA9D15-E7F8-3C0E-ABEE-4DB8B8659F03]
    // </editor-fold> 
    protected void setMarca (String marca) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2D0496EB-1024-683B-FEF3-3F14B4D58F71]
    // </editor-fold> 
    protected String getMarca () {
        return null;
    }

    /**
     *  Métodos set y get para las variables de instancia
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7605A4F3-2950-63CB-8258-DDCDB0BC19EB]
    // </editor-fold> 
    protected void setCostoBase (float costoBase) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.377D47C6-E3E9-14DE-4327-F6440F0FCCA6]
    // </editor-fold> 
    protected float getCostoBase () {
        return 0.0f;
    }

}

