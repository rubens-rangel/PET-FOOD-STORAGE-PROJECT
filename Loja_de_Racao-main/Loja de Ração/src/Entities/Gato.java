package Entities;

public class Gato extends TipoDeAnimal {

    public  double PrecoKg;

    public Gato(String nomepet, double pesoDoPet) {
        super(nomepet, pesoDoPet);
    }

    @Override
    public Double PesoRacao(double PesoPet) {
        double PrecoKg;
        if (PesoPet >= 3.0 && PesoPet < 7.0) {
            PrecoKg = 8.0;
            return PrecoKg;
        }
        if (PesoPet >= 7 && PesoPet < 11) {
            PrecoKg = 10.0;
            return PrecoKg;
        }
        if (PesoPet >= 11 && PesoPet <  15) {
            PrecoKg = 11.0;
            return PrecoKg;
        }
        if (PesoPet >= 15 && PesoPet < 25) {
            PrecoKg = 15.0;
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