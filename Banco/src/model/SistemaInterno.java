package model;

public class SistemaInterno {

    void login(Autenticavel a){
        int senha;
        boolean ok = a.autentica(this.senha);
    }
}