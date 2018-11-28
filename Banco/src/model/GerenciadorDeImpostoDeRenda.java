package model;

public class GerenciadorDeImpostoDeRenda {
    private double total;

    public void adiciona(Tributavel t){
        
        this.total += t.calculaTributos();
    }

    public double getTotal() {
        return this.total;
    }
    
}