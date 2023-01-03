package thread.generate;

public class ThreadTest2 implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("Runnable을 사용한 thread 실행" + (i+1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			
			}
		}//for
	}
	
	public static void main(String[] args) {
		ThreadTest2 t2 = new ThreadTest2();
		t2.run();
	}
	
}//class
