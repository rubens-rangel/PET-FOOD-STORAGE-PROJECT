package Entities;

public class Gato extends TipoDeAnimal {

    public Gato(String nomepet, double pesoDoPet) {
        super(nomepet, pesoDoPet);
    }

    @Override
    public Double PesoRacao(double PesoPet) {
        double PrecoKg;
        if (PesoPet >= 0.5 && PesoPet < 1.0) {
            PrecoKg = 10.0;
            return PrecoKg;
        }
        if (PesoPet >= 1 && PesoPet < 4) {
            PrecoKg = 14.0;
            return PrecoKg;
        }
        if (PesoPet >= 4 && PesoPet <  12) {
            PrecoKg = 18.0;
            return PrecoKg;
        } else {
            return 0.0;
        }
    }

    @Override
    public Double CalculoPreco(double QuantidadeAComprar, double PrecoKg) {
        double Precofinal = QuantidadeAComprar * PrecoKg;
        return Precofinal;
    }

}