import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("\nBem-vindo a televisão! \nAqui está o controle remoto.");

        controle();

        System.out.println("\nObrigado por assistir!!!");

    }

    public static void controle() {
        Scanner ler = new Scanner(System.in);
        int volume = 0, canal = 1;
        while (true) {
            System.out.println("\n\nAções do controle: \nDigite:");
            System.out.println("1 para Aumentar Volume.");
            System.out.println("2 para Abaixar Volume.");
            System.out.println("3 para Aumentar o canal.");
            System.out.println("4 para Diminuir o canal.");
            System.out.println("5 para Mudar de canal.");
            System.out.println("6 para Consultar o volume.");
            System.out.println("7 para Consultar o canal.");
            System.out.println("8 para Sair.");
            int escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    if (volume == 10) {
                        System.out.println("\nJá se encontra no volume máximo.");
                    } else {
                        volume++;
                    }
                    break;
                case 2:
                    if (volume == 0) {
                        System.out.println("\nJá se encontra no volume mínimo.");
                    } else {
                        volume--;
                    }
                    break;
                case 3:
                    if (canal == 15) {
                        canal = 1;
                    } else {
                        canal++;
                    }
                    break;
                case 4:
                    if (canal == 1) {
                        canal = 15;
                    } else {
                        canal--;
                    }
                    break;
                case 5:
                    System.out.println("\nDigite qual canal deseja de 1 a 15: ");
                    int mudanca = ler.nextInt();
                    if (mudanca >= 1 && mudanca <= 15) {
                        canal = mudanca;
                    } else {
                        System.out.println("\nCanal inexistente.");
                    }
                    break;
                case 6:
                    System.out.println("\nO volume atual é: " + volume);
                    break;
                case 7:
                    System.out.println("\nO canal atual é: " + canal);
                    break;
                case 8:
                    System.out.println("\nGuardando o controle...");
                    break;

                default:
                    System.out.println("\nNão existe esse botão no controle :/\nDigite novamente: ");

            }
            if (escolha == 8) {
                break;
            }
        }
    }
}