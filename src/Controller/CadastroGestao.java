package Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Model.Titulo;

public class CadastroGestao {
	public static void main(String[] args) {
		List<Titulo> acervo = new ArrayList<>(Arrays.asList());
		Scanner ler = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("Bem-vindo! Você deseja:");
			System.out.println("[1] Cadastrar novo título");
			System.out.println("[2] Alterar disponibilidade de títulos");
			System.out.println("[3] Buscar por título");
			System.out.println("[4] Buscar por autor");
			System.out.println("[5] Buscar por gênero");
			System.out.println("[6] Buscar por código");
			System.out.println("[7] Sair do sistema");
			menu = ler.nextInt();
			if (menu == 6) {
				System.out.println("Código do livro: ");
				long codigo = ler.nextLong();
				for (Titulo titulo : acervo) {
					boolean encontrado = false;
					if (titulo.codigo == codigo) {
						System.out.println(titulo);
						encontrado = true;
						continue;
					}
					if (acervo.indexOf(titulo) == acervo.lastIndexOf(acervo) || encontrado == false) {
						if (titulo.codigo != codigo) {
							System.out.println("Nenhum item corresponde à pesquisa");
						}
					}
				}
			}
			if (menu == 5) {
				System.out.print("Qual gênero procura? ");
				String genero = ler.next();
				for (Titulo titulo : acervo) {
					if (titulo.genero == genero) {
						System.out.println(titulo.titulo+"\t"+titulo.autor+"\n");
					}
				}
			}
			if (menu == 4) {
				System.out.print("Autor do livro: ");
				String autor = ler.next();
				for (Titulo titulo : acervo) {
					boolean encontrado = false;
					if (titulo.autor == autor) {
						System.out.println(titulo);
						encontrado = true;
						continue;
					}
					if (acervo.indexOf(titulo) == acervo.lastIndexOf(acervo) || encontrado == false) {
						if (titulo.autor != autor) {
							System.out.println("Nenhum item corresponde à pesquisa");
						}
					}
				}
			}
			if (menu == 3) {
				System.out.print("Título do livro: ");
				String nome = ler.next();
				for (Titulo titulo : acervo) {
					boolean encontrado = false;
					if (titulo.titulo == nome) {
						System.out.println(titulo);
						encontrado = true;
						continue;
					}
					if (acervo.indexOf(titulo) == acervo.lastIndexOf(acervo) || encontrado == false) {
						if (titulo.titulo != nome) {
							System.out.println("Nenhum item corresponde à pesquisa");
						}
					}
				}
			}
			if (menu == 2) {
				System.out.print("Código do livro: ");
				long codigo = ler.nextLong();
				for (Titulo titulo : acervo) {
					boolean encontrado = false;
					if (titulo.codigo == codigo) {
						System.out.println(titulo);
						encontrado = true;
						System.out.print("Este livro se encontra disponível para empréstimo? [S/N]");
						String resposta = ler.next();
						while (resposta != "S" && resposta != "N") {
							System.out.print("Digite uma resposta válida: ");
							resposta = ler.next();
						}
						if (resposta == "S") {
							titulo.setDisponivel(true);
							System.out.println("Status atualizado!");
						} else {
							titulo.setDisponivel(false);
							System.out.println("Status atualizado!");
						}	
					}
				}
			}
			if (menu == 1) {
				System.out.print("Título do livro: ");
				String titulo = ler.next();
				System.out.print("\nAutor: ");
				String autor = ler.next();
				System.out.print("\nGênero da obra: ");
				String genero;
				genero = ler.next();
				genero = ler.next();
				System.out.print("\nEste livro se encontra disponível para empréstimo? [S/N] ");
				String resposta = ler.next();
				boolean disponivel;
				while (resposta != "S" && resposta != "N") {
					System.out.print("Digite uma resposta válida: ");
					resposta = ler.next();
				}
				if (resposta == "S") {
					disponivel = true;
				} else {
					disponivel = false;
				}
				System.out.print("\nCódigo do livro: ");
				long codigo = ler.nextLong();
				acervo.add(new Titulo(titulo,autor,genero,disponivel,codigo));
			}
		
		} while (menu != 7);
		System.out.println("---SISTEMA ENCERRADO---");
	}
}
