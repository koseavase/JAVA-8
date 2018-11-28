package edu.lamda;

public class RunnableLambda {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for(int i=0;i<5;i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
