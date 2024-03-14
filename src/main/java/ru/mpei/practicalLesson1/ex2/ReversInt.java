package ru.mpei.practicalLesson1.ex2;

public class ReversInt {
	public static void main(String[] args) {
		int var = 123;
		System.out.println(revers(var));
	}




	public static int revers(int var) {
		int digit;
		int revVar = 0;
		int minus = var;
		var = Math.abs(var);     //Чтобы убрать минус, если число отрицательное

		while (var > 0) {
			digit = var % 10;
			var /= 10;
			revVar = revVar * 10 + digit;
		}
		if (minus > 0)
			return revVar;
		else
			return -revVar;
	}

}
