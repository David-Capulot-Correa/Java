import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Função que calcula o poder com base no nível
    public static double nivel(Scanner scanner, double base) {
        System.out.println("Qual é o seu nível?");
        System.out.println("1 - Acerto até 5 de 10");
        System.out.println("2 - Acerto até 9 de 10");
        System.out.println("3 - Acerto 10 de 10");
        System.out.print("Escolha: ");

        int op = scanner.nextInt();
        double poder = 0;

        switch (op) {
            case 1:
                poder = base * 0.25;
                System.out.println("Nível iniciante selecionado (+" + poder + ")");
                break;
            case 2:
                poder = base * 0.5;
                System.out.println("Nível intermediário selecionado (+" + poder + ")");
                break;
            case 3:
                poder = base * 1;
                System.out.println("Nível avançado selecionado (+" + poder + ")");
                break;
            default:
                System.out.println("Opção inválida. Nível ignorado.");
                break;
        }

        return poder;
    }

    // Classe para armazenar nome e pontuação
    static class Jogador {
        String nome;
        double pontuacao;

        Jogador(String nome, double pontuacao) {
            this.nome = nome;
            this.pontuacao = pontuacao;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Jogador> jogadores = new ArrayList<>();
        int menu;

        do {
            // Menu principal
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Adicionar jogador");
            System.out.println("2 - Ver jogadores cadastrados");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            menu = scanner.nextInt();
            scanner.nextLine(); // Limpa buffer

            switch (menu) {
                case 1:
                    // Adicionar jogador
                    System.out.print("Qual o nome do seu personagem? \nR = ");
                    String name = scanner.nextLine();
                    System.out.println("\nBem-vindo, " + name + "!");

                    int opcao;
                    double poder = 0;

                    do {
                        System.out.println("\n****** Escolha suas habilidades *********\n");
                        System.out.println("0 - Finalizar escolhas");
                        System.out.println("1 - Arremesso de 2 pontos");
                        System.out.println("2 - Arremesso de 3 pontos");
                        System.out.println("3 - Lance Livre");
                        System.out.println("4 - Bandeja");
                        System.out.println("5 - Dunk");
                        System.out.println("6 - Dribbling");
                        System.out.println("7 - Pass");
                        System.out.println("8 - Block");
                        System.out.println("9 - Steal");
                        System.out.println("10 - Rebote");
                        System.out.println("11 - Velocidade");
                        System.out.println("12 - Durabilidade");
                        System.out.println("13 - QI");
                        System.out.println("14 - Força");
                        System.out.println("15 - Pulo");
                        System.out.println("16 - Arremessar depois do drible");
                        System.out.println("17 - Pontuar com contato");
                        System.out.println("18 - Defesa");
                        System.out.print("\nEscolha uma habilidade: R = ");
                        opcao = scanner.nextInt();

                        switch (opcao) {
                            case 1:  poder += nivel(scanner, 12); break;
                            case 2:  poder += nivel(scanner, 14); break;
                            case 3:  poder += nivel(scanner, 5); break;
                            case 4:  poder += nivel(scanner, 9); break;
                            case 5:  poder += nivel(scanner, 7); break;
                            case 6:  poder += nivel(scanner, 9); break;
                            case 7:  poder += nivel(scanner, 6); break;
                            case 8:  poder += nivel(scanner, 3); break;
                            case 9:  poder += nivel(scanner, 6); break;
                            case 10: poder += nivel(scanner, 8); break;
                            case 11: poder += nivel(scanner, 16); break;
                            case 12: poder += nivel(scanner, 2); break;
                            case 13: poder += nivel(scanner, 17); break;
                            case 14: poder += nivel(scanner, 4); break;
                            case 15: poder += nivel(scanner, 11); break;
                            case 16: poder += nivel(scanner, 19); break;
                            case 17: poder += nivel(scanner, 12); break;
                            case 18: poder += nivel(scanner, 18); break;
                            case 0: break;
                            default: System.out.println("Opção inválida."); break;
                        }

                    } while (opcao != 0);

                    System.out.println("\nPoder total final de " + name + " é " + poder);

                    // Salva jogador na lista
                    jogadores.add(new Jogador(name, poder));

                    break;

                case 2:
                    // Mostrar jogadores cadastrados
                    System.out.println("\n=== Jogadores cadastrados ===");
                    if (jogadores.isEmpty()) {
                        System.out.println("Nenhum jogador cadastrado ainda.");
                    } else {
                        for (Jogador j : jogadores) {
                            System.out.println(j.nome + " -> " + j.pontuacao);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (menu != 0);

        scanner.close();
    }
}
