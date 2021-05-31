package entities;

import java.util.Scanner;

public class Menu {

	public void menu() {
		Scanner sc = new Scanner(System.in);

		Conta ContaPessoalA = new Conta("1116", "Luan", 1000.0, 2000.0);
		Conta ContaPessoalB = new Conta("1117", "Eduarda", 1000.0, 3000.0);

		int escolhaConta = 1;

		while (escolhaConta != 3) {
			System.out.println("Informe qual conta deseja acessar: \n[1] " + ContaPessoalA.toString() + "\n[2] "
					+ ContaPessoalB.toString() + "\n[3] Sair");
			escolhaConta = sc.nextInt();

			int escolhaMenuPrincipal = 9;

			while (escolhaMenuPrincipal != 6 && escolhaMenuPrincipal != 5) {
				Double valor = 0.0;
				switch (escolhaConta) {
				case 1:

					System.out.println(
							"[1] Consultar Saldo \n[2] Sacar \n[3] Depositar \n[4] Transferência \n[5] Volta ao Menu Anterior \n[6] Sair");
					escolhaMenuPrincipal = sc.nextInt();

					switch (escolhaMenuPrincipal) {
					case 1:
						ContaPessoalA.consultarSaldo();
						break;

					case 2:
						if (ContaPessoalA.getSaldo() == 0) {
							System.out.println("\nConta sem saldo\n");
						} else {
							System.out.println("Informe valor que desejar sacar :");
							valor = sc.nextDouble();
							ContaPessoalA.sacar(valor);
						}
						break;

					case 3:
						System.out.println("Informe valor que desejar depositar :");
						valor = sc.nextDouble();
						ContaPessoalA.depositar(valor);
						break;
					case 4:
						if (ContaPessoalA.getSaldo() == 0) {
							System.out.println("\nConta sem saldo\n");
						} else {
							System.out.println("Informe valor que desejar transferir : :");
							valor = sc.nextDouble();
							if (ContaPessoalA.sacar(valor)) {
								ContaPessoalB.depositar(valor);
							}
						}
						break;
					case 5:
						break;
					case 6:
						System.out.println("Até logo!");
						escolhaConta = 3;
						break;
					default:
						System.out.println("Escolha Invalida!");
					}

					break;

				case 2:
					System.out.println(
							"[1] Consultar Saldo \n[2] Sacar \n[3] Depositar \n[4] Transferência \n[5] Volta ao Menu Anterior \n[6] Sair");
					escolhaMenuPrincipal = sc.nextInt();

					switch (escolhaMenuPrincipal) {
					case 1:
						ContaPessoalB.consultarSaldo();
						break;

					case 2:
						if (ContaPessoalB.getSaldo() == 0) {
							System.out.println("\nConta sem saldo\n");
						} else {
							System.out.println("Informe valor que desejar sacar :");
							valor = sc.nextDouble();
							ContaPessoalB.sacar(valor);
						}
						break;

					case 3:
						System.out.println("Informe valor que desejar depositar :");
						valor = sc.nextDouble();
						ContaPessoalB.depositar(valor);

					case 4:
						if (ContaPessoalB.getSaldo() == 0) {
							System.out.println("\nConta sem saldo\n");
						}
						System.out.println("Informe valor que desejar transferir : :");
						valor = sc.nextDouble();
						if (ContaPessoalB.sacar(valor)) {
							ContaPessoalA.depositar(valor);
						}
					case 5:
						break;
					case 6:
						System.out.println("Até logo!");
						escolhaConta = 3;
						break;
					default:
						System.out.println("Escolha Invalida!");
						break;
					}

					break;
				case 3:
					System.out.println("Até logo!");
					escolhaMenuPrincipal = 6;
					break;

				default:
					System.out.println("Escolha Invalida!");
					System.out.println();
					System.out.println("Informe qual conta deseja acessar: \n[1] " + ContaPessoalA.toString() + "\n[2] "
							+ ContaPessoalB.toString() + "\n[3] Sair");
					escolhaConta = sc.nextInt();
					continue;
				}
			}
		}
	}
}
