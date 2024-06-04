package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import ConexaoDB.Conexao;
import Modelo.VinculoModel;

public class VincularController {
	Connection conexao = null;
	private PreparedStatement pstmt = null;
	
	public void vincular(Integer idLivro, Integer idCategoria) throws SQLException {
		VinculoModel livro = new VinculoModel(idLivro, idCategoria);
		conexao = Conexao.obterConexao();
		
		String sql = "Insert Into pertence (idLivro, idCategoria) VALUES (?,?)";
		pstmt = conexao.prepareStatement(sql);
		
		pstmt.setInt(1, livro.getIdLivro());
		pstmt.setInt(2, livro.getIdCategoria());
		pstmt.executeUpdate();
        pstmt.close();
		

	}
}
