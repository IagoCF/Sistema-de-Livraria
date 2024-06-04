package Visao;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import Controle.CadastrarLivroController;

import java.awt.GridLayout;
import java.awt.event.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;


public class CadastroLivroInterface extends JFrame implements ActionListener {

    private JRadioButton fisicoRadioButton, digitalRadioButton;
    private JLabel labelId, labelNome, labelAutor, labelTipo;
    private JFormattedTextField campoId;
    private JTextField campoNome, campoAutor, campoTipo;
    private JButton botaoEnviar;

    public CadastroLivroInterface() {
        super("Cadastrar Livro");

        //labels
        labelId = new JLabel("ID:");
        labelId.setBounds(10, 10, 80, 25);
        add(labelId);

        labelNome = new JLabel("Nome");
        labelNome.setBounds(10, 40, 80, 25);
        add(labelNome);

        labelAutor = new JLabel("Autor:");
        labelAutor.setBounds(10, 70, 80, 25);
        add(labelAutor);
        
        labelTipo = new JLabel("Tipo:");
        labelTipo.setBounds(10, 100, 80, 25);
        add(labelTipo);

        //campos
        try {
            MaskFormatter formatter = new MaskFormatter("#####");
            formatter.setPlaceholderCharacter('0');
            campoId = new JFormattedTextField(formatter);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        campoId.setBounds(90, 10, 200, 25);
        add(campoId);

        campoNome = new JTextField();
        campoNome.setBounds(90, 40, 200, 25);
        add(campoNome);

        campoAutor = new JTextField();
        campoAutor.setBounds(90, 70, 200, 25);
        add(campoAutor);
        
        //radio buttons
        fisicoRadioButton = new JRadioButton("Físico");
        digitalRadioButton = new JRadioButton("Digital");
        ButtonGroup grupoTipo = new ButtonGroup();
        grupoTipo.add(fisicoRadioButton);
        grupoTipo.add(digitalRadioButton);
        
        fisicoRadioButton.setBounds(90, 100, 100, 25);
        digitalRadioButton.setBounds(230, 100, 100, 25);
        add(labelTipo);
        add(fisicoRadioButton);
        add(digitalRadioButton);

        //botão Enviar
        botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(140, 140, 100, 25);
        botaoEnviar.addActionListener(this);
        add(botaoEnviar);

        //tela
        setLayout(null);
        setSize(350, 220);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botaoEnviar) {
            int idLivro = Integer.parseInt(campoId.getText());
            
            TelaResultado telaImpressao = new TelaResultado(campoNome.getText());
            telaImpressao.setVisible(true);
            
            String tipo;
            if (fisicoRadioButton.isSelected()) {
    			tipo = "Físico";
    		}else if (digitalRadioButton.isSelected() ){
    			tipo = "Digital";
    		}else {
    			tipo = "Não Informado";
    		}
            
            try {
                CadastrarLivroController cadastrarLivroController = new CadastrarLivroController();
                cadastrarLivroController.salvarLivro(idLivro, campoNome.getText(), campoAutor.getText(), new Date(), tipo);
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new CadastroLivroInterface();
        new CadastroCategoriaInterface();
        new VinculoInterface();
    }
}
