package empleado.Service;

public class EmpleadoPorComision {

    private String nombres;
    private String ApePaterno;
    private String ApeMaterno;
    private String Dni;
    private double ventasBrutas;
    private double Comision;

    public EmpleadoPorComision() {
    }

//public EmpleadoPorComision(String )
    public EmpleadoPorComision(String nombre,String apePat, String apeMat, String iden, double venBru, double Comis) {
        this.nombres = nombre;
        this.ApePaterno = apePat;
        this.ApeMaterno = apeMat;
        this.Dni = iden;
        this.setVentasBrutas(venBru);
        this.setComision(Comis);
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombre) {
        nombres = nombre;
    }

    public String getApePaterno() {
        return ApePaterno;
    }

    public void setApePaterno(String apePat) {
        ApePaterno = apePat;
    }

    public String getApeMaterno() {
        return ApeMaterno;
    }

    public void setApeMaterno(String apeMat) {
        ApeMaterno = apeMat;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String iden) {
        Dni = iden;
    }
//establecer el monto de la venta bruta

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double venBru) {
        if (venBru >= 0.0) {
            ventasBrutas = venBru;
        } else {
            throw new IllegalArgumentException("Las ventas brutas deben ser >=0.0");
        }
    }
//establece la tarifa de comision

    public double getComision() {
        return Comision;
    }

    public void setComision(double Comis) {
        if (Comis > 0.0 && Comis < 1.0) {
            Comision = Comis;
        } else {
            throw new IllegalArgumentException("La Comision debe ser > 0.0 y <1.0");
        }
    }
    //calcular los ingresos

    public double ingresos() {
        return getComision() * getVentasBrutas();
    }

    //devolvera el dato string del obj empleadopor comison
    @Override
    public String toString() {
        return String.format("Empleado: ", getNombres(), getApePaterno(), getApeMaterno(),
                "Dni: ", getDni(), " Las Ventas Brutas: ", getVentasBrutas(), 
                "La Tarifa de Comision: ", getComision());
    }

}
