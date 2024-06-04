package Visao;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import Controle.VincularController;
import java.awt.event.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

public class VinculoInterface extends JFrame implements ActionListener {

    private JLabel labelIdLivro, labelIdCategoria;
    private JFormattedTextField campoIdLivro, campoIdCategoria;
    private JButton botaoEnviar;
    private JCheckBox romanceCheckBox, policialCheckBox, terrorCheckBox, ficcaoCheckBox, infantilCheckBox;

    public VinculoInterface() {
        super("Vincular Livro a uma Categoria");

        //labels
        labelIdLivro = new JLabel("ID Livro:");
        labelIdLivro.setBounds(10, 10, 80, 25);
        add(labelIdLivro);

        labelIdCategoria = new JLabel("ID Categoria:");
        labelIdCategoria.setBounds(10, 40, 80, 25);
        add(labelIdCategoria);

        //campo ID
        try {
            MaskFormatter formatter = new MaskFormatter("#####");
            formatter.setPlaceholderCharacter('0');
            campoIdLivro = new JFormattedTextField(formatter);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        campoIdLivro.setBounds(90, 10, 200, 25);
        add(campoIdLivro);
        
        //campos checkbox
        romanceCheckBox = new JCheckBox("Romance");
        romanceCheckBox.setBounds(90, 40, 80, 25);
        add(romanceCheckBox);
        
        policialCheckBox = new JCheckBox("Policial");
        policialCheckBox.setBounds(180, 40, 80, 25);
        add(policialCheckBox);
        
        terrorCheckBox = new JCheckBox("Terror");
        terrorCheckBox.setBounds(270, 40, 80, 25);
        add(terrorCheckBox);
        
        ficcaoCheckBox = new JCheckBox("Ficção Científica");
        ficcaoCheckBox.setBounds(90, 70, 180, 25);
        add(ficcaoCheckBox);
        
        infantilCheckBox = new JCheckBox("Infantil");
        infantilCheckBox.setBounds(270, 70, 80, 25);
        add(infantilCheckBox);

        //botão Enviar
        botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(100, 110, 100, 25);
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
            int idLivro = Integer.parseInt(campoIdLivro.getText());
            int idCategoria = 00000;
            
            TelaResultado telaImpressao = new TelaResultado("Vínculo");
            telaImpressao.setVisible(true);
            
            if(romanceCheckBox.isSelected()) {
            	idCategoria = 10000;
	            try {
	                VincularController vincularController1 = new VincularController();
	                vincularController1.vincular(idLivro, idCategoria);
	            } catch (SQLException e1) {
	                e1.printStackTrace();
	            }
            }
            
            if(policialCheckBox.isSelected()) {
            	idCategoria = 20000;
	            try {
	                VincularController vincularController2 = new VincularController();
	                vincularController2.vincular(idLivro, idCategoria);
	            } catch (SQLException e1) {
	                e1.printStackTrace();
	            }
            }
            
            if(terrorCheckBox.isSelected()) {
            	
            	idCategoria = 30000;
	            try {
	                VincularController vincularController3 = new VincularController();
	                vincularController3.vincular(idLivro, idCategoria);
	            } catch (SQLException e1) {
	                e1.printStackTrace();
	            }
            }
            
            if(ficcaoCheckBox.isSelected()) { 	
            	idCategoria = 40000;
	            try {
	                VincularController vincularController4 = new VincularController();
	                vincularController4.vincular(idLivro, idCategoria);
	            } catch (SQLException e1) {
	                e1.printStackTrace();
	            }
            }
            
            if(infantilCheckBox.isSelected()) {
            	idCategoria = 50000;
	            try {
	                VincularController vincularController5 = new VincularController();
	                vincularController5.vincular(idLivro, idCategoria);
	            } catch (SQLException e1) {
	                e1.printStackTrace();
	            }
            }
            
            
        }
    }
}
