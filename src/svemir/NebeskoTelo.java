package svemir;

import java.awt.Color;
import java.awt.Graphics;

public abstract class NebeskoTelo extends Objekat {

	protected int polup;
	
	public NebeskoTelo(int x, int y, Color boja, int pp) {
		super(x, y, boja);
		polup=pp;
	}

}
