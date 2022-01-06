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
        Produto produtoASeRemover = pesquisarProdutoPVD(codigoDoProduto);
        this.produtosEmEstoqueEQuantidade.remove(produtoASeRemover);
    }

    public int quantidadeProdutoEmEstoque(int codigoDoProduto) {
        Produto produto = pesqusarProduto(codigoDoProduto);
        return produtosEmEstoqueEQuantidade.get(produto);
    }

    public void mudarQuantidadeEmEstoqueDoProduto(int codigoDoProduto, int novaQuantidade) {
        Produto produtoASeAtualizar = pesquisarProdutoPVD(codigoDoProduto);
        produtosEmEstoqueEQuantidade.put(produtoASeAtualizar, novaQuantidade);
    }

    public Produto pesqusarProduto(int codigoDoProduto) {
        return pesquisarProdutoPVD(codigoDoProduto);
    }

    public void apresentarEstoque() {
        produtosEmEstoqueEQuantidade.forEach((produto, quant) -> {
            System.out.println("Produto: " + produto);
            System.out.println("Quantidade: " + quant);
        });
    }

    private Produto pesquisarProdutoPVD(int codigoDoProduto) {
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
