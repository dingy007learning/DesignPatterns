package com.designpatterns.behavioural.strategy;

public class ChessApplication {

	IChessAlgorithm chessAlgorithm = new EasyChessAlgorithm();

	public IChessAlgorithm getChessAlgorithm() {
		return chessAlgorithm;
	}

	public void setChessAlgorithm(IChessAlgorithm chessAlgorithm) {
		this.chessAlgorithm = chessAlgorithm;
	}
	
	public int calculateNextStep() {
		return this.chessAlgorithm.calcultateNextStep();
	}
}
