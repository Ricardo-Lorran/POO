package aula_26_10_2026;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora_Ricardo {

	private JFrame frmRicardo;
	private JTextField JTFResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora_Ricardo window = new Calculadora_Ricardo();
					window.frmRicardo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora_Ricardo() {
		initialize();
	}

	double valor1, valor2, valor3, valor4, valor5, valor6, valor7, valor8, valor9;
	double resultadoacumulado = 0;
	String op;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRicardo = new JFrame();
		frmRicardo.setTitle("RICARDO LORRAN FREIRE SANTOS 0025400");
		// Cor pela data de nascimento 30/10/2005 -> Vermelho 30, Verde 10, Azul 05
		frmRicardo.getContentPane().setBackground(new Color(30, 10, 5));
		frmRicardo.setBackground(new Color(255, 128, 0));
		frmRicardo.setAutoRequestFocus(false);
		frmRicardo.setBounds(100, 100, 450, 300);
		frmRicardo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRicardo.getContentPane().setLayout(null);

		JTFResultado = new JTextField();
		JTFResultado.setFont(new Font("Arial Black", Font.PLAIN, 10));
		JTFResultado.setBounds(10, 10, 413, 48);
		frmRicardo.getContentPane().add(JTFResultado);
		JTFResultado.setColumns(10);

		JButton btnNewButton = new JButton("0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "0");
			}
		});
		btnNewButton.setBounds(10, 68, 61, 42);
		frmRicardo.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JTFResultado.setText(JTFResultado.getText() + "1");
			}
		});
		btnNewButton_1.setBounds(81, 69, 61, 42);
		frmRicardo.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "2");
			}
		});
		btnNewButton_2.setBounds(152, 68, 61, 42);
		frmRicardo.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("6");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "6");
			}
		});
		btnNewButton_3.setBounds(152, 120, 61, 42);
		frmRicardo.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_1_1 = new JButton("7");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "7");
			}
		});
		btnNewButton_1_1.setBounds(223, 120, 61, 42);
		frmRicardo.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_2_1 = new JButton("8");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "8");
			}
		});
		btnNewButton_2_1.setBounds(10, 173, 61, 42);
		frmRicardo.getContentPane().add(btnNewButton_2_1);

		// BOTÃO MULTIPLICAÇÃO
		JButton btnmultiplicacao = new JButton("*");
		btnmultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				valor1 = Double.parseDouble(JTFResultado.getText());
				resultadoacumulado = Double.parseDouble(JTFResultado.getText());
				JTFResultado.setText("");
				op = "multiplicacao";

			}
		});
		btnmultiplicacao.setBounds(362, 156, 61, 34);
		frmRicardo.getContentPane().add(btnmultiplicacao);

		// BOTÃO SUBTRAÇÃO
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				valor1 = Double.parseDouble(JTFResultado.getText());
				resultadoacumulado = Double.parseDouble(JTFResultado.getText());
				JTFResultado.setText("");
				op = "subtracao";

			}
		});
		btnSubtracao.setBounds(362, 112, 61, 34);
		frmRicardo.getContentPane().add(btnSubtracao);

		// BOTÃO SOMA
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				valor1 = Double.parseDouble(JTFResultado.getText());
				resultadoacumulado = Double.parseDouble(JTFResultado.getText());
				JTFResultado.setText("");
				op = "soma";

			}
		});
		btnSoma.setBounds(362, 68, 61, 34);
		frmRicardo.getContentPane().add(btnSoma);

		JButton btnNewButton_5 = new JButton("3");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JTFResultado.setText(JTFResultado.getText() + "3");
			}
		});
		btnNewButton_5.setBounds(223, 69, 61, 42);
		frmRicardo.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_1_3 = new JButton("4");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "4");
			}
		});
		btnNewButton_1_3.setBounds(10, 121, 61, 42);
		frmRicardo.getContentPane().add(btnNewButton_1_3);

		JButton btnNewButton_2_3 = new JButton("5");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText(JTFResultado.getText() + "5");
			}
		});
		btnNewButton_2_3.setBounds(81, 120, 61, 42);
		frmRicardo.getContentPane().add(btnNewButton_2_3);

		JButton btnNewButton_6 = new JButton("9");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JTFResultado.setText(JTFResultado.getText() + "9");
			}
		});
		btnNewButton_6.setBounds(81, 173, 61, 42);
		frmRicardo.getContentPane().add(btnNewButton_6);

		// BOTÃO DIVISÃO
		JButton btndivisao = new JButton("/");
		btndivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				valor1 = Double.parseDouble(JTFResultado.getText());
				resultadoacumulado = Double.parseDouble(JTFResultado.getText());
				JTFResultado.setText("");
				op = "divisao";

			}
		});
		btndivisao.setBounds(362, 207, 61, 34);
		frmRicardo.getContentPane().add(btndivisao);

		JButton btnzerar = new JButton("C");
		btnzerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("");
				resultadoacumulado = 0;
				op = "";
			}
		});
		btnzerar.setBounds(290, 207, 61, 34);
		frmRicardo.getContentPane().add(btnzerar);

		// BOTÃO IGUAL
		JButton btnigual = new JButton("=");
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!JTFResultado.getText().isEmpty()) {

					valor1 = Double.parseDouble(JTFResultado.getText());
					valor2 = Double.parseDouble(JTFResultado.getText());
					valor3 = Double.parseDouble(JTFResultado.getText());
					valor4 = Double.parseDouble(JTFResultado.getText());
					valor5 = Double.parseDouble(JTFResultado.getText());
					valor6 = Double.parseDouble(JTFResultado.getText());
					valor7 = Double.parseDouble(JTFResultado.getText());
					valor8 = Double.parseDouble(JTFResultado.getText());
					valor9 = Double.parseDouble(JTFResultado.getText());

					if ("soma".equals(op)) {

						resultadoacumulado += valor2;
						JTFResultado.setText(String.valueOf(resultadoacumulado));

					} else if ("subtracao".equals(op)) {

						resultadoacumulado -= valor2;
						JTFResultado.setText(String.valueOf(resultadoacumulado));

					} else if ("multiplicacao".equals(op)) {

						resultadoacumulado *= valor2;
						JTFResultado.setText(String.valueOf(resultadoacumulado));

					} else if ("divisao".equals(op)) {

						resultadoacumulado /= valor2;
						JTFResultado.setText(String.valueOf(resultadoacumulado));

					} else if ("potencia".equals(op)) {

						resultadoacumulado = Math.pow(resultadoacumulado, valor2);
						JTFResultado.setText(String.valueOf(resultadoacumulado));

					}
				}
			}
		});
		btnigual.setBounds(185, 199, 61, 42);
		frmRicardo.getContentPane().add(btnigual);
		
		// BOTÃO POTÊNCIA
		JButton btnNewButton_1_1_1 = new JButton("Xª");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				valor1 = Double.parseDouble(JTFResultado.getText());
				resultadoacumulado = Double.parseDouble(JTFResultado.getText());
				JTFResultado.setText("");
				op = "potencia";

			}
		});
		btnNewButton_1_1_1.setBounds(294, 156, 61, 42);
		frmRicardo.getContentPane().add(btnNewButton_1_1_1);
	}
}
