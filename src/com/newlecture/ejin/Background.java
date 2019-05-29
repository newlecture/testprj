package com.newlecture.ejin;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Background {
	private Image img;
	private int x=0;
	private int y=0;
	private int offset = 0;
	
	public Background() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/bg.jpg");	
		x=0;
		y=0;
	}
	
	public void draw(Graphics g) {
		g.drawImage(img, 
				0, 0, 500, 700,
				0, offset+0, 360, offset+700,
				GameCanvas.getInstance());
	}
}
