package Carros;

public class Carro {

	// variáveis
	private String nome;
	private String marca;
	private String cor;
	private int ano;
	private boolean airbag;
	private boolean cambioAutomatico;
	
	// métodos de acesso
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public boolean isAirbag() {
		return airbag;
	}
	public void setAirbag(boolean airbag) {
		this.airbag = airbag;
	}
	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}
	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}
	
	// método construtor
	public Carro(String nome, String marca, String cor) {
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;
		this.airbag = airbag;
		this.cambioAutomatico = cambioAutomatico;
	}
	
	// método de classe
	public void acelerar(boolean ac) {
		if(ac) {
			System.out.println("Vruuuuuum!!!");
		}
		else {
			System.out.println("Parado");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro c1 = new Carro("Pálio", "Fiat", "Vermelho");
		c1.setAno(2004);
		c1.setAirbag(false);
		c1.setCambioAutomatico(false);
		
		Carro c2 = new Carro("Fusca", "VolksWagen", "Azul");
		c2.setAno(1998);
		c2.setAirbag(false);
		c2.setCambioAutomatico(false);
		
		Carro c3 = new Carro("Corolla", "Toyota", "Branco");
		c3.setAno(2015);
		c3.setAirbag(true);
		c3.setCambioAutomatico(true);
		
		System.out.println(c1.getNome() + " - "
			+	c1.getMarca() + " - "
			+	c1.getCor());
		
		c1.acelerar(true);
		System.out.println("\n"); // quebra de linha
		System.out.println(c2.getNome() + " - "
				+	c2.getMarca() + " - "
				+	c2.getCor());
		
		c2.acelerar(false);
	}
}
