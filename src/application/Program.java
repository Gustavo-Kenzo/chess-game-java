package application;

import java.util.Scanner;

import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual a linha? ");
		int row = sc.nextInt();
		System.out.print("Qual a coluna? ");
		int column = sc.nextInt();
		Position position = new Position(row, column);

		System.out.print("Posicao: "+position);
	}

}
