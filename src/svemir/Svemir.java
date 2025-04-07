package svemir;


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Svemir extends Canvas implements Runnable {

	private Color pozadina =  Color.BLACK;
	private ArrayList<NebeskoTelo> tela = new ArrayList<>();
	private long sleepTime = 100;

	private Thread thread;

	public Svemir() {
		super();
		this.setBackground(pozadina);
	}

	public void addTelo(NebeskoTelo t) {
		tela.add(t);
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
	public void paint(Graphics g) {
		for (int i = 0; i < (tela.size()); i++) {
			NebeskoTelo n = tela.get(i);
			n.iscrtaj(g);
		}
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				Thread.sleep(sleepTime);
				
				synchronized (this) {
					for (int i = 0; i < (tela.size()); i++) {
						NebeskoTelo n = tela.get(i);
						n.promeniY(5);
					}
					repaint();
				}

			}

		} catch (InterruptedException e) {
		}
		synchronized (this) {
			thread = null;
			notify();
		}

	}

}
