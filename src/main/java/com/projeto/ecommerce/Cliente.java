package com.projeto.ecommerce;

import lombok.Data;

@Data
public class Cliente {

    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
