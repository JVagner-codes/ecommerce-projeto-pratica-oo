package com.projeto.ecommerce;

import lombok.Data;

@Data
public class Cliente {

    private String nome;
    private String cpf;
    private String endereco;
    private Carrinho carrinho;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.carrinho = new Carrinho();
    }

    public void addProdutoNoMeuCarrinho (Produto produto) {
        this.carrinho.addProdutoNoCarrinho(produto);
    }

    public void removerProdutoDoMeuCarrinho (Produto produto) {
        this.carrinho.removerProdutoDoCarrinho(produto);
    }
}
