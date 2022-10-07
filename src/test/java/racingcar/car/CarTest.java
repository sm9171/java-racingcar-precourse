package racingcar.car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
	@Test
	void Car인스턴스_생성() {
		assertDoesNotThrow(() -> Car.of(CarName.of("car")));
	}

	@Test
	void Car_객체_동일성_체크() {
		Car left = Car.of(CarName.of("car"));
		Car right = Car.of(CarName.of("car"));

		assertEquals(left, right);
	}
}