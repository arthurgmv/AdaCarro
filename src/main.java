import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Frota frota = new Frota();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Sistema de Aluguel de Carros ---");
            System.out.println("1. Adicionar Carro");
            System.out.println("2. Listar Carros Disponíveis");
            System.out.println("3. Alugar Carro");
            System.out.println("4. Devolver Carro");
            System.out.println("5. Exibir Status da Frota");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a placa do carro: ");
                    String placa = scanner.nextLine();
                    System.out.print("Digite o modelo do carro: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Digite o ano do carro: ");
                    int ano = scanner.nextInt();
                    Carro novoCarro = new Carro(placa, modelo, ano);
                    frota.adicionarCarro(novoCarro);
                    break;
                case 2:
                    System.out.println("\nCarros disponíveis:");
                    frota.listarCarrosDisponiveis();
                    break;
                case 3:
                    System.out.print("Digite a placa do carro que deseja alugar: ");
                    placa = scanner.nextLine();
                    Carro carroParaAlugar = frota.buscarCarroPorPlaca(placa);
                    if (carroParaAlugar != null) {
                        carroParaAlugar.alugar();
                    } else {
                        System.out.println("Carro não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Digite a placa do carro que deseja devolver: ");
                    placa = scanner.nextLine();
                    Carro carroParaDevolver = frota.buscarCarroPorPlaca(placa);
                    if (carroParaDevolver != null) {
                        carroParaDevolver.devolver();
                    } else {
                        System.out.println("Carro não encontrado.");
                    }
                    break;
                case 5:
                    frota.exibirStatusFrota();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}

