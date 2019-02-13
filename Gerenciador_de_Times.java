package br.com.desafio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public  class Gerenciador_de_Times implements MeuTimeInterface {
	
	private List<Time> times = new ArrayList<>();
	private List<Jogador> jogadores = new ArrayList<>();
	private Time time;
	private Jogador jogador;
	
	public List<Time> getTimes() {
		return times;
	}


	public List<Jogador> getJogadores() {
		return jogadores;
	}


	@Override
	public void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal,
			String corUniformeSecundario) {
		Time time = new Time(id, nome,dataCriacao, corUniformePrincipal, corUniformeSecundario);
		times.add(time);
	}
	

	@Override
	public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade,
			BigDecimal salario) {
		
		Jogador jogador = new Jogador(id,idTime,nome, dataNascimento,nivelHabilidade,salario);
		jogadores.add(jogador);
		jogador.setId(jogador.getId());
		
		
	}

	@Override
	public void definirCapitao(Long idJogador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long buscarCapitaoDoTime(Long idTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buscarNomeJogador(Long idJogador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buscarNomeTime(Long idTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long buscarJogadorMaiorSalario(Long idTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal buscarSalarioDoJogaodor(Long idJogador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Long> buscarJogadoresDoTime(Long idTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long buscarMelhorJogadorDoTime(Long idTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long buscarJogadorMaisVelho(Long idTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Long> buscarTimes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Long> buscarTopJogadores(Integer top) {
		// TODO Auto-generated method stub
		return null;
	}


}
