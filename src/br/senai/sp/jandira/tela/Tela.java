package br.senai.sp.jandira.tela;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.FontUIResource;
import br.senai.sp.jandira.calculadora.CalculadoraImc;


public class Tela {

		
	public void criarTela(){
		
		
				
		JFrame minhaTela =new JFrame();
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setTitle("Cálculo do IMC");
		minhaTela.setLayout(null);
		minhaTela.setSize(500,500);
		
		// titulo		
		JLabel titulo = new JLabel();
		titulo.setText("Cálculo do IMC");
		titulo.setBounds(130, 20, 200,30 );
		titulo.setForeground(Color.BLUE);
		titulo.setFont(new FontUIResource("Calculo do IMC", 1, 25));
		
		
		// nome
		JLabel nome = new JLabel();
		nome.setText("Qual o seu nome? ");
		nome.setBounds(30, 70, 106, 30);
				
		JTextField fieldNome = new JTextField();
		fieldNome.setText(" ");
		fieldNome.setBounds(140, 70, 105, 30);
		
		
		// altura
		JLabel altura =new JLabel();
		altura.setText("Qual a sua altura?");
		altura.setBounds(30, 120, 105, 30);
		
		JTextField fieldAltura = new JTextField();
		fieldAltura.setText(" ");
		fieldAltura.setBounds(140, 120, 105, 30);
		
		
		// peso		
		JLabel peso = new JLabel();
		peso.setText("Qual o seu peso?");
		peso.setBounds(30, 160, 105, 30);
		
		JTextField fieldPeso = new JTextField();
		fieldPeso.setText(" ");
		fieldPeso.setBounds(140, 160, 105, 30);


		// botão
		JButton botaoIMC =new JButton();
		botaoIMC.setText("calcular");
		botaoIMC.setBounds(140, 200, 105, 30);
		botaoIMC.setBorderPainted(true);
		
				
		// resultado
		JLabel tituloResultado = new JLabel();
		tituloResultado.setText("Resultado:");
		tituloResultado.setBounds(30, 240, 105,30 );
		tituloResultado.setForeground(Color.BLACK);
		tituloResultado.setFont(new FontUIResource("Resultado:", 1, 20));
		
		
		// valor do imc
		JLabel valorDoImc = new JLabel();
		valorDoImc.setText("Valor do IMC: ");
		valorDoImc.setBounds(30, 280, 100, 30);
		
		JLabel labelValorDoImc =new JLabel();
		labelValorDoImc.setText("********");
		labelValorDoImc.setBounds(160, 280, 100, 30);
	
		JLabel estadoDoImc = new JLabel();
		estadoDoImc.setText("Status: ");
		estadoDoImc.setBounds(30, 300, 100, 30);
		
		JLabel labelEstadoDoImc =new JLabel();
		labelEstadoDoImc.setText("********");
		labelEstadoDoImc.setBounds(160, 300, 100, 30);
		
		// get da tela
		minhaTela.getContentPane().add(nome);
		minhaTela.getContentPane().add(fieldNome);
		minhaTela.getContentPane().add(altura);
		minhaTela.getContentPane().add(fieldAltura);
		minhaTela.getContentPane().add(peso);
		minhaTela.getContentPane().add(fieldPeso);
		minhaTela.getContentPane().add(botaoIMC);
		minhaTela.getContentPane().add(titulo);
		minhaTela.getContentPane().add(tituloResultado);
		minhaTela.getContentPane().add(valorDoImc);
		minhaTela.getContentPane().add(labelValorDoImc);
		minhaTela.getContentPane().add(estadoDoImc);
		minhaTela.getContentPane().add(labelEstadoDoImc);
		
		
		minhaTela.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 
	}

	
	
	
}
