package Entities;

public class Cachorro extends TipoDeAnimal {
    public Cachorro(String nomepet, double pesoDoPet) {
        super(nomepet, pesoDoPet);
    }

    @Override
    public Double PesoRacao(double PesoPet) {
        double PrecoKg;
        if (PesoPet >= 3.0 && PesoPet < 7.0) {
            PrecoKg = 12.0;
            return PrecoKg;
        }
        if (PesoPet >= 7 && PesoPet < 17) {
            PrecoKg = 14.0;
            return PrecoKg;
        }
        if (PesoPet >= 17 && PesoPet < 47) {
            PrecoKg = 16.0;
            return PrecoKg;
        }
        if (PesoPet >= 47 && PesoPet < 110) {
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