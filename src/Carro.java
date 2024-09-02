public class Carro {
    private String placa;
    private String modelo;
    private int ano;
    private boolean disponivel;
    private static int totalCarros = 0;

    public Carro(String placa, String modelo, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.setAno(ano);
        this.disponivel = true;
        totalCarros++;
    }

    // Getters e Setters
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 1900) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano deve ser maior que 1900");
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }


    public void alugar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Carro alugado com sucesso!");
        } else {
            System.out.println("Carro já está alugado.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Carro devolvido com sucesso!");
        } else {
            System.out.println("Carro já está disponível.");
        }
    }

    public static int getTotalCarros() {
        return totalCarros;
    }
}
