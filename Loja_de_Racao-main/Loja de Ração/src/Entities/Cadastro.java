package Entities;

public class Cadastro {
	private String nome;
	private String nomepet;
	private String TipoDePet; 
	private double PesoDoPet;

	public Cadastro(String nome, String nomepet, String tipoDePet, double pesoDoPet) {
		this.nome = nome;
		this.nomepet = nomepet;
		TipoDePet = tipoDePet;
		PesoDoPet = pesoDoPet;
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
	public double getPesoDoPet() {
		return PesoDoPet;
	}
	public void setPesoDoPet(double pesoDoPet) {
		PesoDoPet = pesoDoPet;
	}

	@Override
	public String toString() {
		return nome + ";" + nomepet + ";" + TipoDePet + ";" + PesoDoPet;
			
	}
	
}
