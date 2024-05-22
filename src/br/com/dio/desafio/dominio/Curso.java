package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	private int cargaHotaria;
	
	public Curso(String titulo, String descricao, int cargaHotaria) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHotaria = cargaHotaria;
	}
	
	public int getCargaHotaria() {
		return cargaHotaria;
	}
	public void setCargaHotaria(int cargaHotaria) {
		this.cargaHotaria = cargaHotaria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", cargaHotaria=" + cargaHotaria + "]";
	}

	@Override
	protected double calcularXp() {
		return XP_PADRAO * cargaHotaria;
	}
	
	
}
