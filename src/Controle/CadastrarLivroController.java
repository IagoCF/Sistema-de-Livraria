package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import ConexaoDB.Conexao;
import Modelo.LivroModel;

public class CadastrarLivroController {
	
	Connection conexao = null;
	private PreparedStatement pstmt = null;
	
	public void salvarLivro(Integer idLivro, String nomeLivro, String autor, Date data, String tipo) throws SQLException {
		LivroModel livro = new LivroModel(idLivro, nomeLivro, autor, data, tipo);
		conexao = Conexao.obterConexao();
		
		String sql = "Insert Into livro (idLivro, nome, autor, anoPubli, tipo) VALUES (?, ?, ?, ?, ?)";
		pstmt = conexao.prepareStatement(sql);
		
		pstmt.setInt(1, livro.getIdLivro());
		pstmt.setString(2, livro.getNomeLivro());
		pstmt.setString(3, livro.getAutor());
		pstmt.setDate(4, new java.sql.Date(livro.getAno_publicacao().getTime()));
		pstmt.setString(5, livro.getTipo());
		pstmt.executeUpdate();
        pstmt.close();
		

	}

}