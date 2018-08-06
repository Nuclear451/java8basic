package concurrency;

public class SimpleThreads {
	public static void main(String[] args) throws InterruptedException {
		long patience = 1000 * 60 * 60;

		threadMessage("Starting MessageLoop thread");
		long startTime = System.currentTimeMillis();

		Thread thread = new Thread(new MessageLoop());
		thread.start();

		threadMessage("Waiting for MessageLoop thread to finish");
		while (thread.isAlive()){
			threadMessage("still waiting");
			thread.join(1000);

			if ((System.currentTimeMillis() - startTime) > patience && thread.isAlive()){
				threadMessage("Tired of waiting");
				thread.interrupt();
				thread.join();
			}
		}
		threadMessage("Finally!");
	}

	private static void threadMessage(String message){
		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadName, message);
	}
	private static class MessageLoop implements Runnable{

		@Override
		public void run() {
			String importantInfo[] = {
					"First Info",
					"Second Info",
					"Third Info",
					"Fourth Info"
			};
			try {
				for (String s : importantInfo){
					Thread.sleep(3000);
					threadMessage(s);
				}
			}catch (InterruptedException e){
				threadMessage("I wasn't done.");
			}
		}
	}
}
