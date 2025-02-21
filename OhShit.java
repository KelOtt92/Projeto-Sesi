import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Sistema de informação SESI
        System.out.println("Portal do Aluno");

        // Declaração de Variaveis
        String nome;
        int nota;

        // Entradas
        System.out.println("Informe o Nome do Aluno");
        nome = input.nextLine();
        System.out.println("Informe a Nota");
        nota = input.nextInt();

        // Processamento
        if (nota >= 50) {

            // Saída
            System.out.println(nome + "Estudando Está aprovado");
        } else {

            // Saída
            System.out.println(nome + "Estudante Não está aprovado");
        }
    }
}
