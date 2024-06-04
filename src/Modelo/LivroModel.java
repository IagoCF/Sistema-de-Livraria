package Modelo;

import java.util.Date;

public class LivroModel {
	private Integer idLivro;
	private String nomeLivro;
	private String autor;
	private Date ano_publicacao;
	private String tipo;
	
	public Integer getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Date getAno_publicacao() {
		return ano_publicacao;
	}
	public void setAno_publicacao(Date ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public LivroModel(Integer idLivro, String nomeLivro, String autor, Date ano_publicacao, String tipo) {
		super();
		this.idLivro = idLivro;
		this.nomeLivro = nomeLivro;
		this.autor = autor;
		this.ano_publicacao = ano_publicacao;
		this.tipo = tipo;
	}
	
	

}