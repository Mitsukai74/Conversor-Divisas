
package src;

public class Divisas {
    private double valor,tasa;
    double salida;

    public double getSalida() {
        return salida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }
    
    public double convertir(double valor,double tasa){
        salida = this.valor*this.tasa;
        return salida;
    }
}
