package ru.mpei.practicalLesson1.ex2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static ru.mpei.practicalLesson1.ex2.ReversInt.revers;

public class ReversIntTest {

	@Test
	void reversTest1() {
		int num = 1;
		Assertions.assertEquals(1, revers(num));
	}

	@Test
	void reversTest2() {
		int num = 1234;
		Assertions.assertEquals(4321, revers(num));
	}


	@Test
	void reversTest3() {
		int num = 987654321;
		Assertions.assertEquals(123456789, revers(num));
	}

	@Test
	void reversTest4() {
		int num = 0;
		Assertions.assertEquals(0, revers(num));
	}

	@Test
	void reversTest5() {
		int num =-321;
		Assertions.assertEquals(-123, revers(num));
	}


}