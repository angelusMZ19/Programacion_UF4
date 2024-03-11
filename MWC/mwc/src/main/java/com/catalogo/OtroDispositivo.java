package com.catalogo;

public class OtroDispositivo extends Dispositivos{
    // private double preuFinal;
    private String descripcion;

    public OtroDispositivo(String marca, String model, int preuBase,String descripcion ){
        super(marca, model, preuBase);
        precioFinalOtros(preuBase);
        this.descripcion= descripcion;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double precioFinalOtros(double preuBase){
        return preuBase*2;
    }

    @Override
    public String toString() {
        return super.toString()
            +   "\n  Descripcio: " + this.descripcion
            +   "\n  Preu final: " + precioFinalOtros(preuBase);  
        }
}

