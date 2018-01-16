//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

//1. Run the program.  What number appears in the console?
//   Run it again. Is the number the same?

public class IntroToRandom {
	public static void main(String[] args) {

		for (int i = 0; i < 999999; i++) {

			int r = 0;

			Random plop = new Random();
			int inty = plop.nextInt(88 - (-222000000)) + -222;

			r = inty;
			System.out.println(r);
		}
	}
}