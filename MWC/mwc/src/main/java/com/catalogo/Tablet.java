package com.catalogo;
//se quiere saber las pulgadas 
public class Tablet extends Dispositivos implements GammaAlta{
    
    private int pulgadas;
    private double preuFinal;

    public Tablet(String marca, String model, double preuBase, int pulgadas) {
        super(marca, model, preuBase);
        this.pulgadas= pulgadas;
        preuFinalTablet(preuBase);
        isGammaAlta();
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas; 
    }
    public int getPulgadas(){
        return this.pulgadas; 
    }



    @Override
    public String toString() {
        return super.toString() 
        + "\n  Pulgadas: " + pulgadas
        + "\n  GammaAlta: " + isGammaAlta()
        + "\n  Preu final: " + preuFinalTablet(preuBase);
    }
    
      public double preuFinalTablet (double preuBase) { 
        return preuBase*2;
    }

    public boolean isGammaAlta() {
        return this.preuFinal > 900;
    }
}