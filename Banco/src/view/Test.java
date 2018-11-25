package view;

import model.Gerente;
import model.Funcionario;

public class Test {
    

    
    public static void main(String[] args) {
        Gerente g1 = new Gerente(2,2,"aaa","321321", 5000.00);
        System.out.println(g1.getBonificacao());
    }
        
    
}