package com.projeto.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }

    public void addProdutoNoCarrinho(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProdutoDoCarrinho(Produto produto) {
        this.produtos.remove(produto);
    }
}
