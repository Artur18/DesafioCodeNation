package br.com.desafio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Time extends Gerenciador_de_Times {

	private static long id;
	private String nome;
	private LocalDate dataCriacao;
	private String corDoUniformePrincipal;
	private String corDoUniformeSecundario;
	private Jogador jogador;
	private List<Time> times = new ArrayList<>();

	public Time(long id, String nome, LocalDate dataCriacao, String corDoUniformePrincipal,
			String corDoUniformeSecundario) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.corDoUniformePrincipal = corDoUniformePrincipal;
		this.corDoUniformeSecundario = corDoUniformeSecundario;

	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public String getCorDoUniformePrincipal() {
		return corDoUniformePrincipal;
	}

	public String getCorDoUniformeSecundario() {
		return corDoUniformeSecundario;
	}

	public Jogador getJogador() {
		return jogador;
	}

}
