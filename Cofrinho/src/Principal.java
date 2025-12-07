
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cofrinho cofre = new Cofrinho();

        while (true) {//menu do cofrinho 
            System.out.println("\n--- COFRINHO ---");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Total convertido para Real");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int op = sc.nextInt();

            if (op == 0) {
                System.out.println("Encerrando...");
                break;
            }

            switch (op) {
                case 1:
                    System.out.println("Escolha a moeda:");// menu seleção da moeda
                    System.out.println("1 - Dólar");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Real");
                    int tipo = sc.nextInt();

                    System.out.print("Digite o valor: ");
                    double valor = sc.nextDouble();

                    if (tipo == 1) cofre.adicionar(new Dolar(valor));
                    else if (tipo == 2) cofre.adicionar(new Euro(valor));
                    else if (tipo == 3) cofre.adicionar(new Real(valor));
                    else System.out.println("Moeda inválida!");

                    break;

                case 2:
                    System.out.println("Qual moeda remover?");// menu remoção de moeda
                    System.out.println("1 - Dólar");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Real");
                    tipo = sc.nextInt();

                    System.out.print("Digite o valor da moeda a remover: ");
                    valor = sc.nextDouble();

                    Moeda remover = null;
                    for (Moeda m : cofre.listaMoedas) {
                        if (m instanceof Dolar && tipo == 1 && m.valor == valor) remover = m;//menu listagem das moedas adicionadas
                        if (m instanceof Euro && tipo == 2 && m.valor == valor) remover = m;
                        if (m instanceof Real && tipo == 3 && m.valor == valor) remover = m;
                    }

                    if (remover != null) {
                        cofre.remover(remover);//mensagem caso moeda seja removida ou não encontrada
                        System.out.println("Moeda removida!");
                    } else {
                        System.out.println("Moeda não encontrada.");
                    }

                    break;

                case 3:
                    cofre.listarMoedas();
                    break;

                case 4:
                    System.out.println("Total em reais: " + cofre.totalConvertido());
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
