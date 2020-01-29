package com.github.sejoung.jts;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class InfinitLoop {

	public static void main(String[] args) {
		ThreadLocalRandom random = ThreadLocalRandom.current();

		while (true) {
			var dummyList = new ArrayList<String>();

			for (int loop = 0; loop < 1000; loop++) {
				String temp = "ABCDEFG";
				dummyList.add(temp);
			}
			/*
			if (random.nextInt(100000) == 1) {
				break;
			}
*/
		}

	}
}
