package View;

import Services.Roteamento;

import java.util.Scanner;

public class telainicial {
    public static void telaInicial() {
    System.out.println("Bem-vindo ao programa de cadastros");
    System.out.println();
    telaDeOpcoes();
}

    public static void telaDeOpcoes() {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        Roteamento rotas = new Roteamento();

        System.out.println("Escolha uma opção:");
        System.out.println("1. Cadastrar Usuario");
        System.out.println("2. Cadastrar Venda");
        System.out.println("3. Cadastrar Produto");
        System.out.println("4. Sair");
        escolha = scanner.nextInt();
        rotas.rotas(escolha);

    };
}