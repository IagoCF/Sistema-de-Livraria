package Visao;

import javax.swing.*;

public class TelaResultado extends JDialog {

	private JLabel labelId ,labelNome, labelAutor, labelTipo;
    private JLabel valorId, valorNome, valorAutor, valorTipo;

    public TelaResultado(String nome) {
        super((JFrame) null, "Dados de cadastro", true);

        String mensagem = nome + " cadastrado com sucesso!";
        
        //labels
        valorNome = new JLabel(mensagem);
        valorNome.setBounds(20, 10, 300, 25);
        add(valorNome);

        setLayout(null);
        setSize(320, 150);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Fechar ao clicar no X
    }
}