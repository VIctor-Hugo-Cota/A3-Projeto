package metodos;

import java.util.Scanner;
import java.util.ArrayList;

public class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LimparTela limpar = new LimparTela();
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        Boolean ativo = true;

        while (ativo == true) {
            LimparTela.limpar();
            System.out.println("=============== Folha de pagamentos ===============");
            System.out.println("1 - Cadastrar colaborador ");
            System.out.println("2 - Listar colaboradores ");
            System.out.println("3 - Sair ");
            System.out.println("===================================================");

            int opcao1 = sc.nextInt();
            sc.nextLine();
            switch (opcao1) {
                case 1:
                    // cadastra um novo colaborador
                    Boolean ativo1 = true;
                    while (ativo1 == true) {
                        LimparTela.limpar();
                        System.out.println("=============== Coladores ===============");
                        System.out.println("1 - Funcionário padrão");
                        System.out.println("2 - Funcionário comissionado");
                        System.out.println("3 - Funcionário de produção");
                        System.out.println("4 - Voltar ");
                        System.out.println("==========================================");
                        int opcao2 = sc.nextInt();
                        sc.nextLine();

                        switch (opcao2) {
                            case 1: {
                                // padrão (somente salario base)
                                LimparTela.limpar();
                                System.out.println("Digite o nome completo do Funcionário:");
                                String nome = sc.nextLine();

                                System.out.println("Digite seu numero de registro:");
                                int registro = sc.nextInt();
                                sc.nextLine();

                                Double salario = 2000.00;

                                Funcionario f = new Funcionario(nome, registro, salario);

                                listaFuncionarios.add(f);

                                System.out.println("Funcionário cadastrado!");
                                break;
                            }
                            case 2: {
                                // comissionado (vendas mes * percentual de comissão / 100)
                                LimparTela.limpar();
                                System.out.println("Digite o nome completo do Funcionário:");
                                String nome = sc.nextLine();

                                System.out.println("Digite seu numero de registro:");
                                int registro = sc.nextInt();
                                sc.nextLine();

                                System.out.println("Qual a quantidade de vendas feitas no ultimo mês?");
                                int vendas = sc.nextInt();
                                sc.nextLine();

                                System.out.println("Qual o percentual de comissão?");
                                Double comissao = sc.nextDouble();
                                sc.nextLine();

                                Double salarioB = 2000.00;
                                Double salarioFC = salarioB + ((vendas * comissao) / 100);

                                Funcionario f = new Funcionario(nome, registro, salarioFC);

                                listaFuncionarios.add(f);
                                break;
                            }
                            case 3: {
                                // produção (valor da peça produzida * quantidade)
                                LimparTela.limpar();
                                System.out.println("Digite o nome completo do Funcionário:");
                                String nome = sc.nextLine();

                                System.out.println("Digite seu numero de registro:");
                                int registro = sc.nextInt();
                                sc.nextLine();

                                System.out.println("Qual o valor da peça produzida pelo funcionario?");
                                Double valorp = sc.nextDouble();
                                sc.nextLine();

                                System.out.println("Qual a quantidade de peças produzidas no ultimo mês?");
                                int pecas = sc.nextInt();
                                sc.nextLine();

                                double salarioB = 2000.00;
                                double salarioFP = salarioB + (valorp * pecas);

                                Funcionario f = new Funcionario(nome, registro, salarioFP);

                                listaFuncionarios.add(f);
                                break;
                            }
                            case 4:
                                ativo1 = false;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 2:
                    // mostra o array lista de colaboradores
                    for (Funcionario f : listaFuncionarios) {

                        System.out.println("Nome: " + f.nome);
                        System.out.println("Registro: " + f.registro);
                        System.out.println("Salário: " + f.salario);

                        System.out.println("===============");
                    }
                    System.out.println("Pressione ENTER para continuar...");
                    sc.nextLine();
                    break;
                case 3:
                    // fecha o programa
                    System.out.print("❌❌❌❌Sistema encerrado❌❌❌❌");
                    ativo = false;
                    break;

                default:
                    break;
            }
        }
    }
}