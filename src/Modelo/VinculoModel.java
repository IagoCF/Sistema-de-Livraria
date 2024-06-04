package Modelo;

public class VinculoModel {
	private Integer idLivro;
	private Integer idCategoria;
	
	public Integer getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}
	public Integer getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	public VinculoModel(Integer idLivro, Integer idCategoria) {
		super();
		this.idLivro = idLivro;
		this.idCategoria = idCategoria;
	}
	
}
