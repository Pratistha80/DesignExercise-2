package Zombie2020;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZombieJUnitTestClass {

	@Test
	void test() {

		ZombieClass zc = new ZombieClass();
		zc.addNewType("Type1", "Weekness1");
		assertEquals("Weekness1", zc.getWeekness("Type1"));

	}

}


