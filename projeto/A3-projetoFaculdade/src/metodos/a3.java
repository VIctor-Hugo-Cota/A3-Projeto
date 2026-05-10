package metodos;

import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LimparTela limpar = new LimparTela();

        Double salarioB = 2000.00;

        System.out.println("=============== Folha de pagamentos ===============");
        System.out.println("1 - Cadastrar colaborador");
        System.out.println("2 - Listar colaboradores");
        System.out.println("3 - Sair");
        System.out.println("===================================================");

        int opcao1 = sc.nextInt();
        switch (opcao1) {
            case 1:
                // cadastra um novo colaborador
                LimparTela.limpar();
                System.out.println("=============== Coladores ===============");
                System.out.println("1 - Funcionário padrão");
                System.out.println("2 - Funcionário comissionado");
                System.out.println("3 - Funcionário de produção");
                System.out.println("==========================================");
                int opcao2 = sc.nextInt();

                switch (opcao2) {
                    case 1:
                        //padrão (somente salario base)
                        LimparTela.limpar();
                        System.out.println("Digite o nome completo do Funcionário:");
                        String nome = sc.next();
                        System.out.println("Digite seu numero de registro:");
                        int registro = sc.nextInt();
                        
                        break;
                    case 2:
                        //comissionado (vendas mes * percentual de comissão / 100)
                        LimparTela.limpar();
                        System.out.println("Digite o nome completo do Funcionário:");
                        String nome = sc.next();
                        System.out.println("Digite seu numero de registro:");
                        int registro = sc.nextInt();

                        break;
                    case 3:
                        //produção (valor da peça produzida * quantidade)
                        LimparTela.limpar();
                        System.out.println("Digite o nome completo do Funcionário:");
                        String nome = sc.next();
                        System.out.println("Digite seu numero de registro:");
                        int registro = sc.nextInt();
                        
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                // mostra o array lista de colaboradores
                LimparTela.limpar();

                break;
            case 3:
                // fecha o programa
                System.out.print("Sistema encerrado");
                break;

            default:
                break;
        }
    }
}
