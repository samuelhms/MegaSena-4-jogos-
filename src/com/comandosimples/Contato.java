package com.comandosimples;

public class Contato {

    public static String email_padrao = "email.padrao@email.com";
    private String nome;
    private String email;

    Contato(String nome, String email){
        System.out.println("Criando um novo contato!");
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
