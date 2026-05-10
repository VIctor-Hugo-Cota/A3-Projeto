package metodos;

import java.util.Scanner;

public class FuncB {

    public static Object[] FuncB() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome completo do Funcionário:");
        String nome = sc.nextLine();

        System.out.println("Digite seu numero de registro:");
        int registro = sc.nextInt();

        Double salario = 2000.00;

        Object[] basico = {nome, registro};

        return basico;
    }
}
