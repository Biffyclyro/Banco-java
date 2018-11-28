package view;

import model.Gerente;
import model.Tributavel;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.Funcionario;
import model.Conta;
import model.AtualizadorDeContas;
import model.Diretor;
import model.GerenciadorDeImpostoDeRenda;
import model.SeguroDeVida;

public class Test {
    
    public static void main(String[] args) {
        Gerente g1 = new Gerente(2,2,"aaa","321321", 5000.00);
        Diretor d1 = new Diretor(3,4,"bbbbbb", "111122222", 8000.00);

        GerenciadorDeImpostoDeRenda gerenciador =
        new GerenciadorDeImpostoDeRenda();

        ContaCorrente cc= new ContaCorrente();
        ContaPoupanca cp= new ContaPoupanca();
        ContaCorrente cc1 = new ContaCorrente();

        cc.deposita(1000);
        cp.deposita(1000);
        cc1.deposita(1000);

        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);

       // Tributavel t = cc;
        

        AtualizadorDeContas atualizador = new AtualizadorDeContas(0.01)
        ;

        atualizador.roda(cc);
        atualizador.roda(cp);
        atualizador.roda(cc1);

        gerenciador.adiciona(cc);

        System.out.println(gerenciador.getTotal());



        System.out.println(cc.calculaTributos());
        System.out.println("Saldo total: " + atualizador.getSaldoTotal());
       // System.out.println(g1.getBonificacao());
    }
        
    
}