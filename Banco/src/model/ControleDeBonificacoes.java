package model;

public class ControleDeBonificacoes {
    private double totalDeBonificacoes = 0;

    public void registra(Funcionario f){
        Sytem.out.println("Adicionando bonificacao do funcionario: " + f);
        this.totalDeBonificacoes+= f.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return totalDeBonificacoes;
    }

  
    
}