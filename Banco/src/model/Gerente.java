package model;

public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public Gerente(int senha, int numeroDeFuncionariosGerenciados, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    
    public void setSenha(int senha){
        this.senha=senha;
        
    }
    
    public int getSenha(){
        return senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    
    
    
    public boolean autentica(int senha){
        if(this.senha==senha){
            System.out.println("Acesso permitido");
            return true;
        }else{
            System.out.println("Acesso negado");
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao()+1000;
        
    }
    
    
    
    
    
    

}
