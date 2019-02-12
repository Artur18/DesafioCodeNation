package br.com.desafio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public abstract class Gerenciador_de_Times implements MeuTimeInterface {

	@Override
	public void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal,
			String corUniformeSecundario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade,
			BigDecimal salario) {
		// TODO Auto-generated method stub
		
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
