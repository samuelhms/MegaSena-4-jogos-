package com.company.model;

public class Conta {
    private int numeroDaConta;
    private double saldo;

    public void setNumeroDaConta(int numeroDaConta) {
        if (numeroDaConta > 0) {
            this.numeroDaConta = numeroDaConta;
        } else {
            System.out.println("O numero da conta não é válido!!");
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void  depositar(double deposito){
        if (deposito>0 && numeroDaConta > 0){
            this.saldo = deposito;
            System.out.println("Deposito de R$ "+ deposito+" realizado!!");
        }else if (deposito<=0){
            System.out.println("O valor do deposito é invalido!!");
        }else{
            System.out.println("Conta é inválida!");
        }
    }

    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void imprimir() {
        System.out.println("Numero da conta: " + this.numeroDaConta);
        System.out.println("Saldo: " + this.saldo);

    }
}
