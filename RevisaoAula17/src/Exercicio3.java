import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char conceito;

        while (true) {
            System.out.println("Digite a nota do aluno (de 0 a 10): ");
            double nota = ler.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota digitada incorretamente. ");
            } else {
                conceito = classificacaoNota(nota);
                System.out.println("Conceito " + conceito + ".");
                break;
            }
        }
    }

    public static char classificacaoNota(double nota) {
        char conceito;

        if (nota >= 9) {
            conceito = 'A';
        } else if (nota >= 8) {
            conceito = 'B';
        } else if (nota >= 7) {
            conceito = 'C';
        } else if (nota >= 6) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        return conceito;
    }

}