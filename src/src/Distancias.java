
package src;

public class Distancias {
    private double distanciaInicial,resultado,factor;

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    public double getResultado() {
        return resultado;
    }

    public Distancias() {
    }    

    public double getDistanciaInicial() {
        return distanciaInicial;
    }

    public void setDistanciaInicial(double distanciaInicial) {
        this.distanciaInicial = distanciaInicial;
    }
    
    public double calcularDistancia(double undEntrada,double factor){
        this.resultado = this.distanciaInicial*this.factor;
        return resultado;
    }
    
}


