package svemir;



import java.awt.Color;
import java.awt.Graphics;

public abstract class Objekat{
	
private int x,y;
private Color boja;

public Objekat(int x, int y, Color boja) {
	super();
	this.x = x;
	this.y = y;
	this.boja = boja;
}



public Color getBoja() {
	return boja;
}


public void promeniX(int pom) {
	x+=pom;
}
public void promeniY(int pom) {
	y+=pom;
}

public int getX() {
	return x;
}

public int getY() {
	return y;
}

public abstract void iscrtaj(Graphics g);
}