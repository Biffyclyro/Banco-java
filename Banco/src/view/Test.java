package view;

import model.Gerente;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.Funcionario;
import model.Conta;
import model.AtualizadorDeContas;

public class Test {
    

    
    public static void main(String[] args) {
        Gerente g1 = new Gerente(2,2,"aaa","321321", 5000.00);
        

        ContaCorrente cc= new ContaCorrente();
        ContaPoupanca cp= new ContaPoupanca();
        Conta c = new Conta();

        cc.deposita(1000);
        cp.deposita(1000);
        c.deposita(1000);

        AtualizadorDeContas atualizador = new AtualizadorDeContas(0.01)
        ;

        atualizador.roda(cc);
        atualizador.roda(cp);
        atualizador.roda(c);

        
        System.out.println("Saldo total: " + atualizador.getSaldoTotal());
       // System.out.println(g1.getBonificacao());
    }
        
    
}