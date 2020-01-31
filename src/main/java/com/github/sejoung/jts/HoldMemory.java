package com.github.sejoung.jts;

import java.util.HashMap;
import java.util.Map;

public class HoldMemory {

	private final static Map<String, String> leakMap = new HashMap<>();

	private final static String STORE_DATA = "STORE_DATA";

	public static void main(String[] args) {

		HoldMemory holdMemory = new HoldMemory();
		holdMemory.addObject(50000);

		try {
			System.out.println("Holding memory. it will be stopped after 10 min.");
			Thread.sleep(600000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void addObject(int objectCount) {

		int mapSize = leakMap.size();
		int maxCount = mapSize + objectCount;

		for (int loop = mapSize; loop < maxCount; loop++) {
			leakMap.put(STORE_DATA + loop, STORE_DATA);
		}

	}

}
