
package metodos;

import java.util.Scanner;

public class FuncC {

    public static Object[] FuncC() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome completo do Funcionário:");
        String nome = sc.nextLine();

        System.out.println("Digite seu numero de registro:");
        int registro = sc.nextInt();

        System.out.println("Qual a quantidade de vendas feitas no ultimo mês?");
        int vendas = sc.nextInt();

        System.out.println("Qual o percentual de comissão?");
        int comissao = sc.nextInt();

        Double salarioB = 2000.00;
        Double salarioFC = salarioB + ((vendas + comissao) / 100);

        Object[] comissionado = {nome, registro, salarioFC};

        return comissionado;
    }
}
