package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarNameTest {

	@Test
	void CarName_객체_동일성_체크() {
		CarName left = CarName.of("abc");
		CarName right = CarName.of("abc");

		assertEquals(left, right);
	}

	@Test
	void CarName_한글자_미만_예외처리() {
		assertThrows(IllegalArgumentException.class,
				() -> CarName.of(""));
	}

	@Test
	void CarName_다섯글자_초과_예외처리() {
		assertThrows(IllegalArgumentException.class,
				() -> CarName.of("abcdef"));
	}

	@Test
	void CarName_한글자_이상_다섯글자_이하() {
		assertDoesNotThrow(() -> CarName.of("a"));
		assertDoesNotThrow(() -> CarName.of("ab"));
		assertDoesNotThrow(() -> CarName.of("abc"));
		assertDoesNotThrow(() -> CarName.of("abcd"));
		assertDoesNotThrow(() -> CarName.of("abcde"));
	}
}