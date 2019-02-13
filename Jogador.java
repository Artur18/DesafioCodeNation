package br.com.desafio;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Jogador extends Gerenciador_de_Times {

	private static long id;
	public static void setId(long id) {
		Jogador.id = id;
	}



	private long idTime;
	private String nome;
	private LocalDate dataNascimento;
	private Integer nivelHabilidade;
	private BigDecimal salario;
	
	

	public Jogador(long id, long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade,
			BigDecimal salario) {		
		this.id = id;
		this.idTime = idTime;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.nivelHabilidade = nivelHabilidade;
		this.salario = salario;
	}



	public long getId() {
		return id;
	}



	public long getIdTime() {
		return idTime;
	}



	public String getNome() {
		return nome;
	}



	public LocalDate getDataNascimento() {
		return dataNascimento;
	}



	public Integer getNivelHabilidade() {
		return nivelHabilidade;
	}



	public BigDecimal getSalario() {
		return salario;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ id: "+ id+"]";
	}
	
	
}

