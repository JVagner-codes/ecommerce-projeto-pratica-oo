package com.projeto.ecommerce;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Estoque {

    private final Map<Produto, Integer> produtosEmEstoqueEQuantidade;

    public Estoque() {
        this.produtosEmEstoqueEQuantidade = new HashMap<>();
    }

    public void adicionaProduto(Produto p, int quant) {
        this.produtosEmEstoqueEQuantidade.put(p, quant);
    }

    public void removerProduto(int codigoDoProduto) {
        Produto produtoASeRemover = pesquisarProduto(codigoDoProduto);
        this.produtosEmEstoqueEQuantidade.remove(produtoASeRemover);
    }

    public void mudarQuantidadeEmEstoqueDoProduto(int codigoDoProduto, int novaQuantidade) {
        Produto produtoASeAtualizar = pesquisarProduto(codigoDoProduto);
        produtosEmEstoqueEQuantidade.put(produtoASeAtualizar, novaQuantidade);
    }

    private Produto pesquisarProduto(int codigoDoProduto) {
        Produto produtoEncontrado = null;
        Set<Produto> produtos = produtosEmEstoqueEQuantidade.keySet();
        for (Produto p: produtos) {
            if (p.getCodigoProduto() == codigoDoProduto) {
                produtoEncontrado = p;
                break;
            }
        }
        return produtoEncontrado;
    }
}
