package metodos;

import java.util.Scanner;

public class FuncP {

    public static Object[] FuncP() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome completo do Funcionário:");
        String nome = sc.nextLine();

        System.out.println("Digite seu numero de registro:");
        int registro = sc.nextInt();

        System.out.println("Qual o valor da peça produzida pelo funcionario?");
        int valorp = sc.nextInt();

        System.out.println("Qual a quantidade de peças produzidas no ultimo mês?");
        int pecas = sc.nextInt();

        double salarioB = 2000.00;
        double salarioFP = salarioB + (valorp * pecas);

        Object[] deProdução = {nome, registro, salarioFP};

        return deProdução;
    }
}