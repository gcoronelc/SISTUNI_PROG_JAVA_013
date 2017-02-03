package CostosElectro.Service;

/**
 * @autor John Leandro Osorio
 * @email rjleandro1975@gmail.com
 */

//Declaración de super clase abstracta.
//Sus métodos no poseen implementación
//Sus miembros serán heredados por las subclases
public abstract class Electro {
    
    //Variables de instancia abstractas. No necesitan implementación(valores)
    protected String marca;
    protected float costoBase;
    protected float descuento;
    protected float costoTotal;
    
    //método abstracto. No necesita implementación (código)
    protected abstract void calcularCostoTotal();
    
    protected abstract void mostrarCostoTotal();
  
    
    //Métodos set y get para las variables de instancia
    protected void setDescuento(float valor){
        descuento=valor;
    }
    
    protected float getDescuento(){
        return descuento;
    }
    
    //Métodos set y get para las variables de instancia
        protected void setMarca(String marca){
        this.marca=marca;
    }
    
    protected String getMarca(){
        return marca;
    }
    
        //Métodos set y get para las variables de instancia
        protected void setCostoBase(float costoBase){
        this.costoBase=costoBase;
    }
    
    protected float getCostoBase(){
        return costoBase;
    }
    
  }
