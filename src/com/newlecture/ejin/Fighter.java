package com.newlecture.ejin;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Fighter {
	
	private Image img;
	private int x=0;
	private int y=0;
	
	private int vx = 0;
	private int vy = 0;
	private int dx = 0;
	private int dy = 0;
	
	private int width=64;
	private int height=64;
	private int offset = width*3; // 192
	
	public Fighter() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/fighter.png");
		x=200;
		y=100;
	}

	public void draw(Graphics g) {
		g.drawImage(img,
				x, y, x+width, y+height,
				offset+0, 0, offset+width, height,
				GameCanvas.getInstance());
	}

	public void update() {
		if(dx == x || dy == y) {
			System.out.printf("vx:%d, vy:%d\n", vx, vy);
			System.out.printf("x:%d, y:%d\n", x, y);
			System.out.printf("dx:%d, dy:%d\n", dx, dy);

			vx = 0;
            vy = 0;
            
        } 

		x += vx;
		y += vy;
	}

	public void move(int dx, int dy) {
		vx = (dx-x)/15;
		vy = (dy-y)/15;
		
		this.dx = dx;
		this.dy = dy;
	}
}
