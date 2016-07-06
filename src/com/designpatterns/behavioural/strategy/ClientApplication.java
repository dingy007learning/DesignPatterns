package com.designpatterns.behavioural.strategy;

public class ClientApplication {
	static ChessApplication chess = new ChessApplication();

	public static void main(String[] args) {
		System.out.println("Next Step: " + chess.calculateNextStep());
		chess.setChessAlgorithm(new HardChessAlgorithm());
		System.out.println("New next step: " + chess.calculateNextStep());
	}
}
