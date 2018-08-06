package concurrency;

import java.util.Random;

public class HelloWorldRunnable {
	public static void main(String[] args){
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				while  (true){
					if (Thread.interrupted()){
						System.out.println("R1 was interrupted by R2");
					}
				}}
		};

		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				while (true){
					if (Thread.interrupted()){
						System.out.println("R2 was interrupted by R1");
					}

				}};
		};
	}
}

