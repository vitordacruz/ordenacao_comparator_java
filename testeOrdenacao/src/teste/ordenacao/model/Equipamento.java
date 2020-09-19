package teste.ordenacao.model;

import java.time.LocalDateTime;

import teste.ordenacao.util.Util;

public class Equipamento {

	private String nome;
	private LocalDateTime data;
	
	public Equipamento() {};
	
	public Equipamento(String nome, LocalDateTime data) {
		super();
		this.nome = nome;
		this.data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}	
	public String toString() {
		return "| " + this.nome + " | " + this.data.format(Util.getDateTimeFormate()) + " |";
	}
	
}
