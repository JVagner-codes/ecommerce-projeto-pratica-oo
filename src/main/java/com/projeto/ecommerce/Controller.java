package com.projeto.ecommerce;

public class Controller {

    Estoque estoque = new Estoque();

    public void cadastrarNovoProduto(String nome, double valor, int codProduto, int quantidadeParaEstoque) {
        Produto novoProduto = new Produto(nome, valor, codProduto);
        estoque.adicionaProduto(novoProduto, quantidadeParaEstoque);
    }
}
