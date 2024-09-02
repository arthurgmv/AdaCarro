import java.util.ArrayList;

public class Frota {
    private ArrayList<Carro> carros;

    public Frota() {
        carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
        System.out.println("Carro adicionado à frota.");
    }

    public void listarCarrosDisponiveis() {
        for (Carro carro : carros) {
            if (carro.isDisponivel()) {
                System.out.println("Placa: " + carro.getPlaca() + ", Modelo: " + carro.getModelo());
            }
        }
    }

    public Carro buscarCarroPorPlaca(String placa) {
        for (Carro carro : carros) {
            if (carro.getPlaca().equalsIgnoreCase(placa)) {
                return carro;
            }
        }
        return null;
    }

    public void exibirStatusFrota() {
        System.out.println("Total de carros na frota: " + Carro.getTotalCarros());
        System.out.println("Carros disponíveis para aluguel:");
        listarCarrosDisponiveis();
    }
}
