package com.github.sejoung.jts;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeThreads {

	public static void main(String[] args) {


		for (int loop = 0; loop < 3; loop++) {

			var thread = new LoopingThread();
			thread.start();
		}

		System.out.println("started looping threads.....");
	}

	private static class LoopingThread extends Thread {

		@Override
		public void run() {
			int runCount = 100;

			while (true) {
				try {
					var string = "AAAA";

					var list = new ArrayList<String>(runCount);

					for (int i = 0; i < runCount; i++) {
						list.add(string);
					}

					var hashMap = new HashMap<String, Integer>(runCount);

					for (int loop = 0; loop < runCount; loop++) {
						hashMap.put(string + loop, loop);
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
	}


}
