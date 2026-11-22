/*
 * Aluno: RICARDO LORRAN FREIRE SANTOS
 * RA: 0025400
 * Atividade: AV2-AT2 - CRUD NA NUVEM (Railway)
 */

package Uniceplac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Produto2 {

	public static void main(String[] args)
	{

		// conexão local
		/*
		String url = "jdbc:mysql://localhost:3306/DBPRODUTO";
		String usuariobanco = "root";
		String bancosenha = "12345";
		*/

		// conexão no céu (Railway)
		String url = "jdbc:mysql://gondola.proxy.rlwy.net:45465/railway";
		String usuariobanco = "Ricardo";
		String bancosenha = "123456";

		Scanner sc = new Scanner(System.in);
		try
		{

			Connection conexao = DriverManager.getConnection(url, usuariobanco, bancosenha);
			System.out.println("Conectado ao banco no Railway!");

			int opcao = -1;
			while (opcao != 0) {
				System.out.println("1 - Inserir | 2 - Listar | 3 - Atualizar | 4 - Deletar | 0 - Sair ");

				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {

				case 1:
					System.out.print("Código do produto: ");
					int codigo = sc.nextInt();
					sc.nextLine();

					System.out.print("Nome do produto: ");
					String nome = sc.nextLine();

					System.out.println("Preço do produto: ");
					float preco = sc.nextFloat();

					String sql = "INSERT INTO PRODUTO (CODIGO, NOME, PRECO) VALUES (?, ?, ? )";

					PreparedStatement stmt = conexao.prepareStatement(sql);
					stmt.setInt(1, codigo);
					stmt.setString(2, nome);
					stmt.setFloat(3, preco);
					stmt.executeUpdate();

					System.out.println("Produto cadastrado com sucesso!");
					stmt.close();

					break;
				case 2:
					System.out.println("Digite o código do produto");
					int codigo2 = sc.nextInt();

					String sql2 = "SELECT * FROM PRODUTO WHERE CODIGO = ? ";
					PreparedStatement stmt2 = conexao.prepareStatement(sql2);
					stmt2.setInt(1, codigo2);
					ResultSet rs = stmt2.executeQuery();

					boolean encontrou = false;
					while (rs.next()) {
						encontrou = true;
						System.out.println("Nome produto: " + rs.getString("nome") + " | Preço: " + rs.getFloat("preco"));
					}
					if (!encontrou) {
						System.out.println("Produto não localizado");
					}
					stmt2.close();

					break;
				case 3:

					System.out.println("Digite o código do produto para atualizar");
					int codPesquisa = sc.nextInt();
					System.out.println("Digite o novo valor do produto:");
					float novopreco = sc.nextFloat();

					String SqlUp = "UPDATE PRODUTO SET PRECO = ? WHERE CODIGO=?";

					PreparedStatement stmUp = conexao.prepareStatement(SqlUp);
					stmUp.setFloat(1, novopreco);
					stmUp.setInt(2, codPesquisa);

					int linhaAfetada = stmUp.executeUpdate();

					if (linhaAfetada > 0) {
						System.out.println("Preço atualizado com sucesso");
					} else {
						System.out.println("Produto não localizado");
					}
					stmUp.close();

					break;
				case 4:
					System.out.println("Digite o código do produto para deletar");
					int codDeleta = sc.nextInt();

					String SqlDelete = "DELETE FROM PRODUTO WHERE CODIGO = ?";

					PreparedStatement stmDelete = conexao.prepareStatement(SqlDelete);
					stmDelete.setInt(1, codDeleta);

					int linhaDeletada = stmDelete.executeUpdate();

					if (linhaDeletada > 0) {
						System.out.println("Produto deletado com sucesso!");
					} else {
						System.out.println("Produto não localizado");
					}

					stmDelete.close();

					break;
				case 0:
					System.out.println("Saindo...");
					break;

				default:
					System.out.println("Opção inválida!!!");

				}

			}

			conexao.close();

		} catch (Exception E) {

			System.out.println("Erro de cadastro" + E.getMessage());

		}

		sc.close();

	}

}
