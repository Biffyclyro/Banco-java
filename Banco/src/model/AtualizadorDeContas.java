package model;

public class AtualizadorDeContas {

    private double saldoTotal;
    private double selic;


    public AtualizadorDeContas(double selic){
        this.selic=selic;
    }
    
    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void roda(Conta c){
        System.out.println("saldo anterior: "+c.getSaldo());
        c.atualiza(this.selic);
        saldoTotal+=c.getSaldo();
    }


    
}