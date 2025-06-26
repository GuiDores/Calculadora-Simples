import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        boolean iniciarCalculadora = true;

        while (iniciarCalculadora) {
        System.out.println("\n <--------------- Iniciando Calculadora :) --------------->\n");
        System.out.println("Digite um valor");
        var numb1 = scanner.nextInt();
        System.out.println("Digite um operador");
        var operador = scanner.next();
        System.out.println("Digite um valor");
        var numb2 = scanner.nextInt();

        var soma = numb1 + numb2;
        var subtracao = numb1 - numb2;
        var multiplicacao = numb1 * numb2;
        double divisao = (double) numb1 / (double) numb2;

        if (operador.equals("+")) {
            System.out.printf("%s %s %s = %s\n", numb1, operador, numb2, soma);
        }
        else if (operador.equals("-")) {
            System.out.printf("%s %s %s = %s\n", numb1, operador, numb2, subtracao);
        } else if (operador.equals("*") || operador.equalsIgnoreCase("x")) {
            System.out.printf("%s %s %s = %s\n", numb1, operador, numb2, multiplicacao);
        } else if (operador.equals("/")) {
            if (numb2 == 0) {
                System.out.println("Erro: Divisão por zero não é permitida.");
            } else {
                System.out.printf("%s %s %s = %.2f\n", numb1, operador, numb2, divisao);
            }
        } else {
            System.out.println("Por favor indique um operador");
        }
        System.out.println("Deseja fazer outro cálculo? (s/n)");
        var respUser = scanner.next();
        if (!respUser.equalsIgnoreCase("s")) {
            iniciarCalculadora = false;
        }
        }
        scanner.close();
    }
}
