package model;



public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    
    
    public Funcionario(String nome, String cpf, double salario){
        this.nome=nome;
        this.cpf=nome;
        this.salario=salario;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCpf(String cpf){
        this.cpf=cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setSalario(double salario){
        this.salario=salario;
    }

    public double getSalario(){
        return salario;
    }

    public abstract double getBonificacao();
    
    
    
    
    
}
