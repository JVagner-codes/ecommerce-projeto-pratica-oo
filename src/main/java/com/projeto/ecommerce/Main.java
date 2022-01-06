package com.projeto.ecommerce;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.cadastrarNovoProduto("Camisa", 20.99, 111, 5);
        controller.cadastrarNovoProduto("Calça", 59.99, 112, 3);
        controller.cadastrarNovoProduto("Tênis", 89.99, 113, 10);
        controller.cadastrarNovoProduto("Meia", 9.99, 114, 10);

        controller.removerProduto(114);

        controller.getEstoque();

        System.out.println("\n ================================================ \n");

        controller.cadastrarNovoCliente("João", "098.999.99-97");

        controller.comprar(111, 2, "098.999.99-97");
        System.out.println("Compra efetuada com sucesso");

        System.out.println("\n ================================================ \n");

        controller.getEstoque();

    }
}
