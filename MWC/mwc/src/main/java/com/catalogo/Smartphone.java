package com.catalogo;
//se quiere saber el el hardaware(tiene acelerometro?) y el sistema operativo
public class Smartphone extends Dispositivos implements GammaAlta{
    private String sistemO;
    private boolean acelerometro=false;
    private boolean gps=true;
    private double preuFinal;
    //private boolean gammaAlta;

    public Smartphone (String marca, String model, double preuBase,String sistemO, boolean acelerometro, boolean gps){
        super(marca, model, preuBase);
        this.sistemO = sistemO;
        this.acelerometro = acelerometro;
        this.gps = gps;
        precioFinalSmartphone(preuBase);
        isGammaAlta();
    }


    public String getSistemO() {
        return sistemO;
    }

    public void setSistemO(String sistemO) {
        this.sistemO = sistemO;
    }

    public boolean isAcelerometro() {
        return acelerometro;
    }
    public void setAcelerometro(boolean acelerometro) {
        this.acelerometro = acelerometro;
    }

    public boolean isGps() {
        return gps;
    }
    public void setGps(boolean gps) {
        this.gps = gps;
    }
    
    @Override
    public String toString() {
        return super.toString()
        + "\n  Accelerometre: " + this.acelerometro
        + "\n  GPS: " + this.gps
        + "\n  Smartphone Gamma alta: " + isGammaAlta()
        + "\n  Preu final: " + this.preuFinal; 
    }

    public double precioFinalSmartphone(double preuBase) {
        double defaultPrice= preuBase*2;
        double increment = 0.1 * defaultPrice;
        if (acelerometro) {
            increment += 0.05 * defaultPrice; // Si té acceleròmetre, incrementa un 5% addicional
        }
        return preuFinal += defaultPrice + increment;
    }
    
    @Override
    public boolean isGammaAlta() {
        // return precioFinalSmartphone(); > 700;
        return this.preuFinal>700;
    }

}
