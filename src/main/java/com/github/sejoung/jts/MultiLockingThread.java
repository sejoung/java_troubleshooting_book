package com.github.sejoung.jts;

public class MultiLockingThread {

	public static void main(String[] args) {

		for (int loop = 0; loop < 10; loop++) {
			var lockThread = new LockThread();
			lockThread.start();
		}

		System.out.println("MultiLockingThread started....");
	}

	private static class LockThread extends Thread {

		@Override
		public void run() {
			while (true) {
				IncreaseNumber.increase();
			}
		}
	}

	private static class IncreaseNumber {

		private static long count = 0;

		public static synchronized void increase() {
			count++;
		}
	}

}
