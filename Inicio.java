package jogoDosAnimais;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import javax.swing.JOptionPane;

public class Inicio {

	public static void main(String[] args) {
		/* Declaração de variáveis */
		String animal = "";
		String acao = "";
		String animalTerra = "";
		String acaoAnimal = "";

		/* Declarando LinkedHashMap pra ordenação da inserção de valores */
		LinkedHashMap<String, String> mapAnimais = new LinkedHashMap<String, String>();

		/* Declaração ArrayList - listas dos atributos dos animais(nome, Acao) */
		ArrayList<String> listAnimais = new ArrayList<>();
		ArrayList<String> listAcao = new ArrayList<>();
		ArrayList<String> listAnimaisTerra = new ArrayList<>();
		ArrayList<String> listAcaoAnimais = new ArrayList<>();

		/* Adicionando tubarão e macaco as arrays, são os animais predefinidos */
		listAnimais.add("Tubarão");
		listAnimaisTerra.add("Macaco");

		/* Declaração de variável pra controle de fim da execução */
		boolean fimJogo = true;

		/* Estrutura de repetição do jogo */
		while (fimJogo) {

			JOptionPane.showMessageDialog(null, "Pense em um animal.", "Jogo dos Animais", 3); // Tela de mensagem
																								// inicial

			int resAgua = JOptionPane.showConfirmDialog(null, "O animal que pensou vive na água?", "Jogo dos Animais",
					JOptionPane.YES_NO_OPTION); // Guardando variável pra definição da estrutura condicional

			/* Condicional para o caso de o animal viver na água */
			if (resAgua == 0) {

				/* Declaração de variáveis para controle das estruturas condicionais */
				int resTubarao = 0;
				int resAcao = 1;
				int resAnimal = 1;

				/* Declaração de variáveis para controle das estruturas de repetição */
				boolean finalizou = false;
				boolean campoVazio = true;
				boolean campoVazioCarac = true;

				/* Condicional para o caso de o animal não ser um tubarão(segundo loop) */
				if (!listAcao.isEmpty()) {

					/* Estrutura de repetição pra percorrer a listAcao */
					for (String carac : listAcao) {
						resAcao = JOptionPane.showConfirmDialog(null, "O animal que pensou " + carac + " ?",
								"Jogo dos Animais", JOptionPane.YES_NO_OPTION);

						if (resAcao == 0) { // se sim

							if (mapAnimais.containsKey(carac)) { // Condicional para o caso de o animal corresponder a
																	// ação
								resAnimal = JOptionPane.showConfirmDialog(null,
										"O animal que pensou é o(a) " + mapAnimais.get(carac) + " ?",
										"Jogo dos Animais", JOptionPane.YES_NO_OPTION);

								/*
								 * Condicional para o caso de o animal corresponder ao objeto(chave) adquirido
								 * na condição anterior
								 */
								if (resAnimal == 0) {
									JOptionPane.showMessageDialog(null, "Eu venci!!!!", "Jogo dos Animais", 3);
									finalizou = true; // finaliza o while
									break; // próxima condição
								}
							}
						}
					}
				}

				/* Controle de leitura do código */
				if (finalizou) {
					continue;
				} else {
					/* Estrutura de repetição pra percorrer a listAnimais */
					for (String ani : listAnimais) {
						resTubarao = JOptionPane.showConfirmDialog(null, "O animal que pensou é o " + ani + " ?",
								"Jogo dos Animais", JOptionPane.YES_NO_OPTION);

						/*
						 * Controle de leitura do código para que não mostrar todos os elementos da
						 * listAnimais
						 */
						if (resAcao == 1) {
							break;
						}
					}
				}
				/* Condição para o caso de o animal ser o animal */
				if (resTubarao == 0) {
					JOptionPane.showMessageDialog(null, "Eu venci!!!!", "Jogo dos Animais", 3);
					continue;
				} else {

					/*
					 * estrutura de repetição para implementar obrigatoriedade de inserção de
					 * valores
					 */
					while (campoVazio) {
						animal = JOptionPane.showInputDialog("Qual animal você pensou?");

						if (animal != null) {
							campoVazio = false; // se o campo não estiver null, finaliza a repetição
						} else {
							JOptionPane.showMessageDialog(null, "INFORME UM VALOR!", "Jogo dos Animais", 3);
							// caso esteja null, solicita o valor
						}

					}

					/*
					 * estrutura de repetição para implementar obrigatoriedade de inserção de
					 * valores
					 */
					while (campoVazioCarac) {
						acao = JOptionPane.showInputDialog("Um(a) " + animal + " ________ mas um(a) Tubarão não");
						if (acao != null) {
							campoVazioCarac = false; // se o campo não estiver null, finaliza a repetição
						} else {
							JOptionPane.showMessageDialog(null, "INFORME UM VALOR!", "Jogo dos Animais", 3);
							// caso esteja null, solicita o valor
						}
					}
					/* Adicionando valores */
					mapAnimais.put(acao, animal);
					listAnimais.add(animal);
					listAcao.add(acao);

					continue;
				}

			} else {
				/* Declaração de variáveis para controle das estruturas condicionais */
				int resMacaco = 0;
				int resAcaoAni = 1;
				int resAnimalTerra = 1;

				/* Declaração de variáveis para controle das estruturas de repetição */
				boolean finalizou = false;
				boolean campoVazio = true;
				boolean campoVazioCarac = true;

				/* Condicional para o caso de o animal não ser um macaco(segundo loop) */
				if (!listAcaoAnimais.isEmpty()) {

					/* Estrutura de repetição pra percorrer a listAcaoAnimais */
					for (String caracTerra : listAcaoAnimais) {
						resAcaoAni = JOptionPane.showConfirmDialog(null, "O animal que pensou " + caracTerra + " ?",
								"Jogo dos Animais", JOptionPane.YES_NO_OPTION);

						if (resAcaoAni == 0) { // se sim

							if (mapAnimais.containsKey(caracTerra)) { // Condicional para o caso de o animal
																		// corresponder a ação
								resAnimalTerra = JOptionPane.showConfirmDialog(null,
										"O animal que pensou é o(a) " + mapAnimais.get(caracTerra) + " ?",
										"Jogo dos Animais", JOptionPane.YES_NO_OPTION);

								/*
								 * Condicional para o caso de o animal corresponder ao objeto(chave) adquirido
								 * na condição anterior
								 */
								if (resAnimalTerra == 0) {
									JOptionPane.showMessageDialog(null, "Eu venci!!!!", "Jogo dos Animais", 3);
									finalizou = true;
									break;
								}
							}
						}
					}
				}

				/* Controle de leitura do código */
				if (finalizou) {
					continue;
				} else {

					/* Estrutura de repetição pra percorrer a listAnimaisTerra */
					for (String aniTerra : listAnimaisTerra) {
						resMacaco = JOptionPane.showConfirmDialog(null, "O animal que pensou é o " + aniTerra + " ?",
								"Jogo dos Animais", JOptionPane.YES_NO_OPTION);

						/*
						 * Controle de leitura do código para que não mostrar todos os elementos da
						 * listAnimais
						 */
						if (resAcaoAni == 1) {
							break;
						}
					}
				}
				/* Condição para o caso de o animal ser o animal */
				if (resMacaco == 0) {
					JOptionPane.showMessageDialog(null, "Eu venci!!!!", "Jogo dos Animais", 3);
					continue;
				} else {
					/*
					 * estrutura de repetição para implementar obrigatoriedade de inserção de
					 * valores
					 */
					while (campoVazio) {
						animalTerra = JOptionPane.showInputDialog("Qual animal você pensou?");
						if (animalTerra != null) {
							campoVazio = false; // se o campo não estiver null, finaliza a repetição
						} else {
							JOptionPane.showMessageDialog(null, "INFORME UM VALOR!", "Jogo dos Animais", 3);
							// caso esteja null, solicita o valor
						}
						while (campoVazioCarac) {
							acaoAnimal = JOptionPane
									.showInputDialog("Um(a) " + animalTerra + " ________ mas um(a) Macaco não");
							if (acaoAnimal != null) {
								campoVazioCarac = false; // se o campo não estiver null, finaliza a repetição
							} else {
								JOptionPane.showMessageDialog(null, "INFORME UM VALOR!", "Jogo dos Animais", 3);
								// caso esteja null, solicita o valor
							}
						}

					}

					/* Adicionando valores */
					mapAnimais.put(acaoAnimal, animalTerra);
					listAnimaisTerra.add(animalTerra);
					listAcaoAnimais.add(acaoAnimal);

					continue;

				}
			}

		}

	}

}
