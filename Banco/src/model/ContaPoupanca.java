package model;


public class ContaPoupanca extends Conta{

  public void autaliza(double taxa){
      this.saldo-=this.saldo * taxa * 3;
  }

}