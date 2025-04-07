package svemir;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Simulator extends Frame {
	private Generator gen;
	private Svemir s = new Svemir();
	private Panel bottomPanel = new Panel();
	
	private void populateWindow() {
		
		gen=new Generator(s);
		
		
		Button b = new Button("Pokreni!");
		bottomPanel.add(b);
		
		
		
		add(s, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);
		
		
		
		//--------------------------------
		b.addActionListener((ae) -> {
			s.pokreni();
			gen.pokreni();
			b.setEnabled(false);
		});
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				s.finish();
				gen.finish();
				dispose();
			}
		});
		
		//-----------------------------
		
		
		
		
	}
	public Simulator() {
		setTitle("1");
		setBounds(700, 200, 200, 400);
		setResizable(false);
		setVisible(true);
		populateWindow();

	}
	
	public static void main(String[] args) {
		new Simulator();
	}
}
