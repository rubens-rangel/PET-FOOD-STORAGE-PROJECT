package Entities;

public class Cliente {
	private String nome;
	private String nomepet;
	private String TipoDePet;
	private double PesoPet;

	public Cliente(String nome, String nomepet, String tipoDePet, double pesoPet) {
		this.nome = nome;
		this.nomepet = nomepet;
		TipoDePet = tipoDePet;
		PesoPet = pesoPet;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomepet() {
		return nomepet;
	}
	public void setNomepet(String nomepet) {
		this.nomepet = nomepet;
	}
	public String getTipoDePet() {
		return TipoDePet;
	}
	public void setTipoDePet(String tipoDePet) {
		TipoDePet = tipoDePet;
	}
	public double getPesoPet() {
		return PesoPet;
	}
	public void setPesoPet(double pesoPet) {
		PesoPet = pesoPet;
	}

	@Override
	public String toString() {
		return nome + ";" + nomepet + ";" + TipoDePet + ";" + PesoPet;
	}
}
