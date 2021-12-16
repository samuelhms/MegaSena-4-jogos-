package com.comandosimples;

public class Main {
    public static void main(String[] args) {

        Contato contato_1 = new Contato("samuel", "samuel.silva@plena.com");

        System.out.println(contato_1.getNome());
        System.out.println(contato_1.getEmail());

        Contato contato_2 = new Contato("jessica", "jessica.dias@plena.com");

        System.out.println(contato_2.getNome());
        System.out.println(contato_2.getEmail());

        // acesso ao atributo estatico é feito atraves da classe e nao do objeto
        System.out.println(Contato.email_padrao);

    }
}
