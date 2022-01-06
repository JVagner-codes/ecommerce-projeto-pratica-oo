package com.projeto.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private Estoque estoque;
    private List<Cliente> clientes;

    public Controller() {
        this.estoque = new Estoque();
        this.clientes = new ArrayList<>();
    }

    public void cadastrarNovoProduto(String nome, double valor, int codProduto, int quantidadeParaEstoque) {
        Produto novoProduto = new Produto(nome, valor, codProduto);
        this.estoque.adicionaProduto(novoProduto, quantidadeParaEstoque);
    }

    public void diminuirQuantidadeDeProduto(int codProduto, int quantProdutosAMenos) {
        int quantidadeEmEstoque = this.estoque.quantidadeProdutoEmEstoque(codProduto);
        quantidadeEmEstoque -= quantProdutosAMenos;
        this.estoque.mudarQuantidadeEmEstoqueDoProduto(codProduto, quantidadeEmEstoque);
    }

    public void cadastrarNovoCliente(String nome, String cpf) {
        Cliente novoCliente = new Cliente(nome, cpf);
        this.clientes.add(novoCliente);
    }

    public void removerProduto(int codigoProduto) {
        this.estoque.removerProduto(codigoProduto);
    }

    public void comprar(int codProduto, int quantidade, String cpf) {
        diminuirQuantidadeDeProduto(codProduto, quantidade);
        Produto produto = estoque.pesqusarProduto(codProduto);
        pesquisarCliente(cpf).addProdutoNoMeuCarrinho(produto);
    }

    public void getEstoque() {
        this.estoque.apresentarEstoque();
    }

    private Cliente pesquisarCliente(String  cpf) {
        Cliente clienteEncontrado = null;
        for (Cliente c: clientes) {
            if (c.getCpf().equalsIgnoreCase(cpf)) {
                clienteEncontrado = c;
            }
        }
        return clienteEncontrado;
    }
}
