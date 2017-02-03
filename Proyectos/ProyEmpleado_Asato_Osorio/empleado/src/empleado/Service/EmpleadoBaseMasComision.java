package empleado.Service;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {

    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apePat, String apeMat, String iden, double venBru, double Comis, double salario) 
    {
        super(nombre, apePat, apeMat, iden, venBru, Comis);
        setSalarioBase(salario);
    }

    public void setSalarioBase(double salario) {
        if (salario >= 0.0) {
            salarioBase = salario;
        } else {
            throw new IllegalArgumentException("El salario debe de ser Mayor e Igual que 0.0");
        }
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public double ingresos() {
        return getSalarioBase() + super.ingresos();
    }

    @Override
    public String toString() {
        return String.format("Empleado con sueldo base: ", super.toString(), " Sueldo Base: ", getSalarioBase());
    }

}
