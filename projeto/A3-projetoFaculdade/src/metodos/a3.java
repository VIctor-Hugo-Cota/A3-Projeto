package metodos;

import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LimparTela limpar = new LimparTela();
        FuncB FB = new FuncB();
        FuncC FC = new FuncC();
        FuncP FP = new FuncP();
        Boolean ativo = true;
        
        while (ativo == true) {
             LimparTela.limpar();
            System.out.println("=============== Folha de pagamentos ===============");
            System.out.println("1 - Cadastrar colaborador");
            System.out.println("2 - Listar colaboradores");
            System.out.println("3 - Sair");
            System.out.println("===================================================");

            int opcao1 = sc.nextInt();
            
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
                    System.out.println("4 - Sair");
                    System.out.println("==========================================");
                    int opcao2 = sc.nextInt();

                    switch (opcao2) {
                        case 1:
                            // padrão (somente salario base)
                            LimparTela.limpar();
                            FB.FuncB();
                            break;
                        case 2:
                            // comissionado (vendas mes * percentual de comissão / 100)
                            LimparTela.limpar();
                            FC.FuncC();
                            
                            break;
                        case 3:
                            // produção (valor da peça produzida * quantidade)
                            LimparTela.limpar();
                            FP.FuncP();
                            
                            break;
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
                    LimparTela.limpar();

                    break;
                case 3:
                    // fecha o programa
                    System.out.print("Sistema encerrado");
                    ativo = false;
                    break;

                default:
                    break;
            }
        }
    }
}