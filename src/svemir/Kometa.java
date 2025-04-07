package svemir;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;

public class Kometa extends NebeskoTelo {
	Polygon p;

	public Kometa(int x, int y, int pp) {
		super(x, y, Color.GRAY, pp);
		int[] koordx = new int[5]; 
		int[] koordy = new int[5];
		int i=0;
		double pom=(Math.random()*(Math.PI));
		double inc = (2 * Math.PI) / 5;
		for(double angle = (0+pom); angle < (2 * Math.PI+pom); angle += inc) {
			koordx[i]=this.dohvX(angle);
			koordy[i]=this.dohvY(angle);
			i=(i+1)%5;
		}
		p=new Polygon(koordx,koordy,5);
	}

	public int dohvX(double angle) {
		return (int)(getX()+polup * Math.cos(angle));
	}

	public int dohvY(double angle) {
		return (int)(getY()+polup * Math.sin(angle));
	}
	@Override
	public void iscrtaj(Graphics g) {
		//Color prevColor = g.getColor();
		g.setColor(this.getBoja());
		p.translate(0,5);
		g.fillPolygon(p);
		
		//g.setColor(prevColor);
	}

}
