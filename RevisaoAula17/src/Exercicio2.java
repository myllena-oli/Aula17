import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = ler.nextInt();
        System.out.println("Digite o seu peso: ");
        double peso = ler.nextDouble();
        System.out.println("Digite a sua altura: ");
        double altura = ler.nextDouble();
        System.out.println(dizerInformacao(nome));
        System.out.println(dizerInformacao(idade));
        System.out.println(dizerInformacao(peso, altura));

    }

    public static String dizerInformacao(String nome) {

        return "Meu nome é " + nome + ".";
    }

    public static String dizerInformacao(int idade) {

        return "Minha idade é " + idade + ".";
    }

    public static String dizerInformacao(double peso, double altura) {

        return "Meu peso é " + peso + "kg e minha altura é " + altura + ".";
    }

}