package Entities;

public class TipoDeAnimal {
    private String nomepet;
    private double PesoPet;

    public TipoDeAnimal(String nomepet, double pesoDoPet) {
        this.nomepet = nomepet;
        PesoPet = PesoPet;
    }

    public String getNomepet() {
        return nomepet;
    }

    public void setNomepet(String nomepet) {
        this.nomepet = nomepet;
    }

    public double PesoPet() {
        return PesoPet;
    }

    public void setPesoPet(double pesoPet) {
        PesoPet = pesoPet;
    }



    public Double PesoRacao(double PesoPet) {
        return 0.0;
    }

    public Double CalculoPreco(double QuantidadeAComprar, double PrecoKg) {
        return 0.0;
    }
}
