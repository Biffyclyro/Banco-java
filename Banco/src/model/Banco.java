package model;

import java.util.ArrayList;

public class Banco {
    private  ArrayList<Conta> contas = new ArrayList();


    public  void adicionarConta(Conta c){
        contas.add(c);
        
    }
    public ArrayList<Conta> getContas(){
        return contas;
    }
    
}