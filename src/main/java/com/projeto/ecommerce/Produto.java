package com.projeto.ecommerce;

import lombok.Data;

@Data
public class Produto {

    private String nomeProduto;
    private String descricao;
    private double valor;
    private int codigoProduto;

    public Produto(String nomeProduto, double valor, int codigoProduto) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.codigoProduto = codigoProduto;
    }
}
