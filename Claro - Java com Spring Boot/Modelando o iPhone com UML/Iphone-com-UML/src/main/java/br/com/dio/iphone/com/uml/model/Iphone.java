package br.com.dio.iphone.com.uml.model;

import java.util.Scanner;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {

    private static Scanner scanner = new Scanner(System.in);

    public static void mostrarMenu() {
            Iphone iphone = new Iphone();

            boolean mostrarMenu = true;
            Integer opcao = 0;
            Integer funcao = 0;

            while (mostrarMenu) {
                    System.out.println("\nEscolha o aplicativo:\n1 - Reprodutor musical\n2 - Aparelho telefônico\n3 - Navegador\nDigite qualquer outro número se quiser sair do menu");
                    opcao = Integer.parseInt(scanner.nextLine());

                    switch (opcao) {
                            case 1:
                                    System.out.println(
                                                    "\n1 - Tocar música\n2 - Pausar música\n3 - Selecionar música");
                                    funcao = Integer.parseInt(scanner.nextLine());
                                    if (funcao == 1) {
                                            iphone.tocar();
                                    } else if (funcao == 2) {
                                            iphone.pausar();
                                    } else if (funcao == 3) {
                                            iphone.selecionarMusica();
                                    } else {
                                            System.out.println("Encerrando programa...");
                                            mostrarMenu = false;
                                    }

                                    break;
                            case 2:
                                    System.out.println(
                                                    "\n4 - Ligar para alguém\n5 - Atender ligação\n6 - Iniciar correio de voz");
                                    funcao = Integer.parseInt(scanner.nextLine());
                                    if (funcao == 4) {
                                            iphone.ligar();
                                    } else if (funcao == 5) {
                                            iphone.atender();
                                    } else if (funcao == 6) {
                                            iphone.iniciarCorreioVoz();
                                    } else {
                                            System.out.println("Encerrando programa...");
                                            mostrarMenu = false;
                                    }
                                    break;
                            case 3:
                                    System.out.println(
                                                    "\n7 - Exibir página\n8 - Adicionar nova aba\n9 - Atualizar página");
                                    funcao = Integer.parseInt(scanner.nextLine());
                                    if (funcao == 7) {
                                            iphone.exibirPagina();
                                    } else if (funcao == 8) {
                                            iphone.adicionarNovaAba();
                                    } else if (funcao == 9) {
                                            iphone.atualizarPagina();
                                    } else {
                                            System.out.println("Encerrando programa...");
                                            mostrarMenu = false;
                                    }
                                    break;
                            default:
                                    System.out.println("Encerrando programa...");
                                    mostrarMenu = false;
                                    break;
                    }

            }

    }

    @Override
    public void tocar() {
            System.out.println("\nTocando música...");
    }

    @Override
    public void pausar() {
            System.out.println("\nPausando música...");
    }

    @Override
    public void selecionarMusica() {
            System.out.println("\nDigite o nome da música:");
            String musica = scanner.nextLine();

            System.out.println("Tocando música " + musica + "...");
    }

    @Override
    public void ligar() {
            System.out.println("\nDigite o número para o qual você deseja ligar:");
            String numero = scanner.nextLine();

            System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
            System.out.println("\nAtendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
            System.out.println("\nLigando para o correio de voz...");
            System.out.println("Você não tem correios de voz no momento.");
    }

    @Override
    public void exibirPagina() {
            System.out.println("\nDigite qual site você deseja acessar:");
            String site = scanner.nextLine();

            System.out.println("Direcionando para " + site + "...");
    }

    @Override
    public void adicionarNovaAba() {
            System.out.println("\nDigite qual site você deseja adicionar como uma nova aba:");
            String site = scanner.nextLine();

            System.out.println("Abrindo " + site + " em nova aba...");
    }

    @Override
    public void atualizarPagina() {
            System.out.println("\nAtualizando página atual...");
    }

    public static void main(String[] args) {
            mostrarMenu();
    }

}
