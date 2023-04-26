package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sn.nextLine();
		System.out.print("Vida inicial: ");
		int life = sn.nextInt();
		System.out.print("Ataque: ");
		int attack = sn.nextInt();
		System.out.print("Armadura: ");
		int armor = sn.nextInt();

		Champion firstChampion = new Champion(name, life, attack, armor);

		sn.nextLine();
		System.out.println();

		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		name = sn.nextLine();
		System.out.print("Vida inicial: ");
		life = sn.nextInt();
		System.out.print("Ataque: ");
		attack = sn.nextInt();
		System.out.print("Armadura: ");
		armor = sn.nextInt();

		Champion secondChampion = new Champion(name, life, attack, armor);

		sn.nextLine();
		System.out.println();

		System.out.print("Quantos turnos você deseja executar? ");
		int turns = sn.nextInt();

		sn.nextLine();
		System.out.println();

		for (int i = 0; i < turns; i++) {
			if (firstChampion.life < 1 || secondChampion.life < 1) {
				break;
			} else {
				firstChampion.takeDamage(secondChampion);
				secondChampion.takeDamage(firstChampion);
				System.out.println("Resultado do turno " + (i + 1) + ":");
				System.out.println(firstChampion.status());
				System.out.println(secondChampion.status());
				System.out.println();
			}
		}

		System.out.print("FIM DO COMBATE");

		sn.close();

	}
}
