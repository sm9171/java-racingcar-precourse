package racingcar.game.round;

import racingcar.common.Input;

public class Round {

	private final int round;

	private Round(int round) {
		this.round = round;
	}

	public static Round fromConsole() {
		return new Round(
				Input.fromConsole().toInteger());
	}

}