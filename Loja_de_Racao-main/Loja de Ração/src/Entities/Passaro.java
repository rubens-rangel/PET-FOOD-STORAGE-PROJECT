package Entities;

public class Passaro extends TipoDeAnimal {

    public Passaro(String nomepet, double pesoDoPet) {
        super(nomepet, pesoDoPet);
    }

    @Override
    public Double PesoRacao(double PesoPet) {
        double PrecoKg;
        if (PesoPet >= 0.01 && PesoPet < 0.5) {
            PrecoKg = 2.0;
            return PrecoKg;
        }
        if (PesoPet >= 0.5 && PesoPet < 0.7) {
            PrecoKg = 3.0;
            return PrecoKg;
        }
        if (PesoPet >= 0.7 && PesoPet < 1.5) {
            PrecoKg = 4.0;
            return PrecoKg;
        }
        if (PesoPet >= 1.5 && PesoPet <  5) {
            PrecoKg = 5.0;
            return PrecoKg;
        }
        if (PesoPet >= 5 && PesoPet <  30) {
            PrecoKg = 7.0;
            return PrecoKg;
        }

        else {
            return 0.0;
        }
    }

    @Override
    public Double CalculoPreco(double QuantidadeAComprar, double PrecoKg) {
        double Precofinal = QuantidadeAComprar * PrecoKg;
        return Precofinal;
    }
}