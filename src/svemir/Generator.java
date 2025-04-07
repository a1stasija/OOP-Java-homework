package svemir;
import java.util.Random;
public class Generator implements Runnable {
	private Svemir s;
	private long sleepTime2 = 900;
	Thread thread;

	public Generator(Svemir s) {
		super();
		this.s = s;
	}

	public synchronized void finish() {
		if (thread != null) {
			thread.interrupt();
		}
		while (thread != null) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
	}

	public synchronized void pokreni() {
		//finish();
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				int x = (int) (Math.random() * 200);
				int y = 0;
				int r = (int) (Math.random() * 20 + 10);
				NebeskoTelo t = new Kometa(x, y, r);

				synchronized (s) {
					s.addTelo(t);
				}
				Thread.sleep(sleepTime2);
				
			}
		} catch (InterruptedException e) {
		}

		synchronized (this) {
			thread = null;
			notify();
		}
	}
}

