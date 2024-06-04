package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import ConexaoDB.Conexao;
import Modelo.CategoriaModel;

public class CadastrarCategoriaController {
	
	Connection conexao = null;
	private PreparedStatement pstmt = null;
	
	public void salvarCategoria(Integer idCategoria, String nomeCategoria) throws SQLException {
		CategoriaModel categoria = new CategoriaModel(idCategoria, nomeCategoria);
		conexao = Conexao.obterConexao();
		
		String sql = "Insert Into categoria (idCategoria, nome) VALUES (?,?)";
		pstmt = conexao.prepareStatement(sql);
		
		pstmt.setInt(1, categoria.getIdCategoria());
		pstmt.setString(2, categoria.getNomeCategoria());
		pstmt.executeUpdate();
        pstmt.close();
		

	}
	
}
